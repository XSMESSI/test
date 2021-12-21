
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

