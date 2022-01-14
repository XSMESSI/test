
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
            <!--用id（主键）,而不是sync_id，可以更快-->
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
自定义排序是根据自己想要的特定字符串（数字）顺序进行排序。

主要是使用函数 FIELD(str,str1,str2,str3,...)

MySQL的自定义排序，str与str1、str2、str3...进行比较，并按照str1,str2,str3...的顺序输出，
如果遇到str为null或者不存在str1,str2,str3...中的情况的则序列为0，

eg:

SELECT * FROM TEST ORDER BY FIELD(value,'test1','test2','test3','test4') ASC/DESC
eg2:

SELECT * FROM TEST WHERE VALUE IN('test1','test2','test3','test4')
ORDER BY FIELD(value,'test1','test2','test3','test4') ASC/DESC # 保证只满足条件的进行排序
 */

