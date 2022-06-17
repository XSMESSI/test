
//总结日常编写代码中的sql语句集合

//1.查找两张关联表格中在其中一张表存在,不在另一张表存在的结果
SELECT
	`number`
FROM
	t_mb_point_member a
WHERE
	NOT EXISTS ( SELECT login_name AS number FROM t_mms2_usr_account b WHERE a.id = b.people_id AND people_type = 3 )

//2.画像排行榜计算信息直接返回数据

    SELECT AA.* FROM
    (SELECT A.*
    FROM (SELECT org AS `type`,ROUND(AVG(score),2) AS num FROM
    t_ts_hfzy_work_teacher_labreport
    WHERE term_id = #{param.termId} AND delete_flag = 0
    AND dept_id = #{param.deptId}
    GROUP BY org ORDER BY score DESC) AS A,
    (SELECT @rank:=0,@r_integral:=null) AS B) AS AA;

//3.查询表格中是否存在重复数据
SELECT
	*
FROM
	test_org_info a
WHERE
	( a.`code` ) IN ( SELECT `code` FROM test_org_info GROUP BY `code` HAVING count( * ) > 1 )


//4.动态传入字段名,表名
<select id ="getUser" resultType ="java.util.Map" parameterType ="java.lang.String" statementType ="STATEMENT">
    select
		${columns}
    from
		${tableName}
    where
		COMPANY_REMARK = #{company}
</select>

//5.mybatis清楚缓存
<select id="queryUcfUserBatchImportId" resultType="java.lang.String" useCache="false" flushCache="true">
	SELECT UCF_USER_BATCH_IMPORT_SEQ.NEXTVAL FROM DUAL
</select>

//6.sql查询字段连接,IF(条件判断输出结果)
   SELECT
        id AS syncId,
        CONCAT(XN,'学年 ',IF(XQ = 1,"第一学期","第二学期")) AS term,
        KCDM AS courseCode,
        KCMC AS course,
        BJMC AS className,
        JSZGH AS code,
        XM AS `name`,
        ZS AS zs,
        KS AS ks,
        KHFS AS examType,
        XF AS basicScore,
        RS AS num,
        kkdw AS dept,
        SKXS AS classHours
        FROM
        vi_teachingarr_sel_time
        <if test="now != null">
            WHERE DATE_FORMAT(create_time,'%Y-%m-%d') = #{now}
        </if>
        <if test="upNow != null">
            WHERE DATE_FORMAT(update_time,'%Y-%m-%d') = #{upNow}
        </if>
//6.条件用主键进行更新可以更快
<update id="updateBtoStudentAppraise">
        <foreach collection="list" item="item" separator=";">
            UPDATE t_ts_customer_student_appraise_follow_202112230001
            <set>
                tea_name = #{item.teaName},
                tea_code = #{item.teaCode},
                term = #{item.term},
                week_no = #{item.weekNo},
                week = #{item.week},
                week_dur = #{item.weekDur},
                session_dur = #{item.sessionDur},
                course_code = #{item.courseCode},
                course_name = #{item.courseName},
                stu_name = #{item.stuName},
                stu_code = #{item.stuCode},
                teacher_order = #{item.teacherOrder},
                class_atom = #{item.classAtom},
                teach_effect = #{item.teachEffect},
                remark = #{item.remark},
                modify_time = NOW()
            </set>
            <!--用id(主键),而不是sync_id,可以更快-->
            WHERE id = #{item.id} AND delete_flag = 0
        </foreach>
</update>

//7.查询不在一定范围内的数据量
SELECT COUNT(1) FROM `t_ts_project` WHERE notice_id NOT IN (673943072229638144,673979434446176256) and delete_flag = 0


//8.自定义排序
review_type  根据review_type 值进行自定义排序
SELECT review_type FROM `t_ts_project_review`
	ORDER BY FIELD(review_type,0,2,1,3)


/*
2.自定义排序
自定义排序是根据自己想要的特定字符串(数字)顺序进行排序。

主要是使用函数 FIELD(str,str1,str2,str3,...)

MySQL的自定义排序,str与str1.str2.str3...进行比较,并按照str1,str2,str3...的顺序输出,
如果遇到str为null或者不存在str1,str2,str3...中的情况的则序列为0,

eg:

SELECT * FROM TEST ORDER BY FIELD(value,'test1','test2','test3','test4') ASC/DESC
eg2:

SELECT * FROM TEST WHERE VALUE IN('test1','test2','test3','test4')
ORDER BY FIELD(value,'test1','test2','test3','test4') ASC/DESC # 保证只满足条件的进行排序
 */

#2022-06-17新增相关学习sql
 1.在面试的时候碰到一个 问题,就是让写一张表中有id和name 两个字段,查询出name重复的所有数据,现在列下:
select * from xi a where (a.username) in  (select username from xi group by username  having count(*) > 1)

2.查询出所有数据进行分组之后,和重复数据的重复次数的查询数据,先列下:

select  count(username) as '重复次数',username from xi group by username  having count(*)>1 order by username desc

3.一下为 查看别人的 结果,现列下:查询及删除重复记录的方法大全

1.查找表中多余的重复记录,重复记录是根据单个字段(peopleId)来判断select * from people
where peopleId in (select  peopleId  from  people  group  by  peopleId  having  count(peopleId) > 1)

2.删除表中多余的重复记录,重复记录是根据单个字段(peopleId)来判断,只留有rowid最小的记录
delete from people
where peopleId  in (select  peopleId  from people  group  by  peopleId   having  count(peopleId) > 1)
and rowid not in (select min(rowid) from  people  group by peopleId  having count(peopleId )>1)

3.查找表中多余的重复记录(多个字段)
select * from vitae a
where (a.peopleId,a.seq) in  (select peopleId,seq from vitae group by peopleId,seq  having count(*) > 1)

4.删除表中多余的重复记录(多个字段),只留有rowid最小的记录
delete from vitae a
where (a.peopleId,a.seq) in  (select peopleId,seq from vitae group by peopleId,seq having count(*) > 1)
and rowid not in (select min(rowid) from vitae group by peopleId,seq having count(*)>1)

5.查找表中多余的重复记录(多个字段),不包含rowid最小的记录
select * from vitae a
where (a.peopleId,a.seq) in  (select peopleId,seq from vitae group by peopleId,seq having count(*) > 1)
and rowid not in (select min(rowid) from vitae group by peopleId,seq having count(*)>1)

(二)
比方说
在A表中存在一个字段"name",
而且不同记录之间的"name"值有可能会相同,
现在就是需要查询出在该表中的各记录之间,"name"值存在重复的项;
Select Name,Count(*) From A Group By Name Having Count(*) > 1如果还查性别也相同大则如下:
Select Name,sex,Count(*) From A Group By Name,sex Having Count(*) > 1

(三)
方法一declare @max integer,@id integerdeclare cur_rows cursor local for select 主字段,count(*) from 表名 group by 主字段 having count(*) >; 1open cur_rowsfetch cur_rows into @id,@maxwhile @@fetch_status=0beginselect @max = @max -1set rowcount @maxdelete from 表名 where 主字段 = @idfetch cur_rows into @id,@maxendclose cur_rowsset rowcount 0

方法二 重复记录 有两个意义上的重复记录,一是完全重复的记录,也即所有字段均重复的记录,二是部分关键字段重复的记录,比如Name字段重复,而其他字段不一定重复或都重复可以忽略。

1.对于第一种重复,比较容易解决,使用select distinct * from tableName 就可以得到无重复记录的结果集.如果该表需要删除重复的记录(重复记录保留1条),可以按以下方法删除select distinct * into #Tmp from tableNamedrop table tableNameselect * into tableName from #Tmpdrop table #Tmp 发生这种重复的原因是表设计不周产生的,增加唯一索引列即可解决.

2.这类重复问题通常要求保留重复记录中的第一条记录,操作方法如下 假设有重复的字段为Name,Address,要求得到这两个字段唯一的结果集select identity(int,1,1) as autoID, * into #Tmp from tableNameselect min(autoID) as autoID into #Tmp2 from #Tmp group by Name,autoIDselect * from #Tmp where autoID in(select autoID from #tmp2) 最后一个select即得到了Name,Address不重复的结果集(但多了一个autoID字段,实际写时可以写在select子句中省去此列)

(四)
查询重复select * from tablename where id in (select id from tablenamegroup by idhaving count(id) > 1)

