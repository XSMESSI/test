#最终版本:
尚硅谷Mysql核心技术的视频学习相关记录:

-3月24学习:
*****start*********
-- select * from employees
--
-- 查询常量值
SELECT
	100 AS num;-- 查询表达式：
SELECT
	100 % 98;-- 查询函数：
SELECT
	VERSION( );-- 起别名：
SELECT
	100 % 98 AS result;
SELECT
	last_name AS 姓,
	first_name AS 名
FROM
	employees;-- 方式2：
SELECT
	last_name 姓,
	first_name 名
FROM
	employees;-- 查询sakary，显示out put,双引号的使用
SELECT
	salary AS "out put"
FROM
	employees;-- 去重：
--
-- 查询员工所在部门编号：
SELECT DISTINCT
	( department_id )
FROM
	employees;-- 9.+号作用
/**

java中的+号：
1.运算符：两个操作数都为数值型:
2.连接符：只要有一个操作数为字符串

mysql中的+号：
仅仅只有一个功能：运算符

select 100+90;  两个操作数都是数值型，做加法运算
SELECT '123'+90  ;其中一方为字符型，试图将字符型的数值转换为数值型，如果转换成功，则继续做加法运算

SELECT 'john'+90;   如果转换失败，则将字符型数值转换为0

SELECT null+0;    一方为null，结果为null
*/--
-- 查询员工名和姓链接成一个字段，并显示为姓名
SELECT
	last_name + first_name AS 姓名
FROM
	employees;-- 连接字符函数 -- CONCAT(str1,str2,...)
SELECT
	CONCAT( last_name, first_name ) 姓名
FROM
	employees;

*****end*********


*************3月25日学习 **************
-- 1. 下面的语句是否可以执行成功
select last_name , job_id , salary as sal
from employees;
-- 2. 下面的语句是否可以执行成功
select * from employees;
-- 3. 找出下面语句中的错误
select employee_id , last_name ,
salary * 12  "ANNUAL SALARY"
from employees;

select employee_id , last_name,
salary * 12 "ANNUAL SALARY"
from employees;
-- 4. 显示表 departments 的结构 ,并查询其中的全部数据

DESC departments;
SELECT * FROM departments;

-- 5. 显示出表 employees 中的全部 job_id(不能重复)

SELECT DISTINCT job_id from employees;
-- 6. 显示出表 employees 的全部列 ,各个列之间用逗号连接 ,列头显示成 OUT_PUT


SELECT IFNULL(commission_pct,0) AS 结果,commission_pct from employees;

SELECT CONCAT(first_name,',',last_name,',',job_id,',',IFNULL(commission_pct,0)) AS OUT_PUT FROM employees;


进阶二 

条件查询 

/**
语法 select 查询列表 from 表名  where   筛选条件:

分类 
  1.按条件表达式筛选 
			条件运算符: > < = !=  <>
	2.按逻辑表达式查询 
	逻辑运算符  && || !
							and  or  not

							&& 和and  两个条件都为true,结果为true,反之为false;
							|| 和 or  只要有一个条件为true 结果为true,反之为false;
							! 或 not 如果链接的两个条件本身为false,结果为true,反之为false;
	3.模糊查询 
			LIKE
			BETWEEN AND
			IN
			IS NULL

*/


1.按条件表达式筛选

#案例1 查询工资 > 12000的员工信息

SELECT * FROM employees where salary > 12000;


#案例2:查询部门编号部位90的员工名和部门编号

SELECT last_name,department_id from employees WHERE department_id = 90;


2.按逻辑表达式筛选

#案例一 查询工资在10000到20000之间的员工名 ,工资和奖金
SELECT
	last_name,
	salary,
	commission_pct
FROM
	employees
WHERE
	salary >= 10000
	AND salary <= 20000;


#案例二 查询部门编号不是在90 到110之间 ,或者工资高于15000的员工信息

SELECT * FROM employees WHERE department_id < 90 OR department_id > 110 OR salary > 15000;


#三.模糊查询 

/***
LIKE
特点 
1.一般和通配符搭配使用 
			通配符 
			%  任意多个字符  ,包含0个字符
			_ 任意单个字符
			BETWEEN AND
			IN
			IS NULL*/

#案例1 查询员工名中包含a的员工信息

SELECT * FROM employees WHERE last_name LIKE '%a%';

#查询员工名中第三个字符为e,第五个字符为a的员工名和工资 

SELECT last_name,salary FROM employees WHERE last_name LIKE '__n_l%';

#案例3 查询员工名中第二个字符为_的员工名(转义字符的使用)

SELECT last_name FROM employees where last_name LIKE '_\_%';

<转义字符的使用>
SELECT last_name FROM employees where last_name LIKE '_$_%' ESCAPE '$';


*************3月28日学习********START************


between and *包含临界值*
/**
1.使用between and可以提高代码简洁度
2.包含临界值
3.两个临界值不要调换顺序

*/

#案例一 ,查询员工编号在100-120之间的员工信息

SELECT * FROM employees WHERE employee_id BETWEEN 100 AND 120;

3.IN关键字

/**
1.含义 判断某字段的值是否属于in列表中的某一项
特点 
		1.使用in提高语句简洁度
		2.in列表的值必须一致或兼容

*/
#查询员工的工种编号是 IT_PROG ,AD_VP,AD_PRES中的一个员工名和工种编号

SELECT last_name,job_id FROM employees where job_id IN('IT_PROG','AD_VP','AD_PRES');


4 is null 使用 
/**
  = 或 <> 不能用于判断null值
	is null 或者is not null 可以判断null 值
**/
#案例1 查询没有奖金的员工名和奖金率

SELECT last_name,commission_pct FROM employees WHERE commission_pct IS NULL;

#安全等于   <=>  可读性差

#案例1 查询没有奖金的员工名和奖金率

SELECT last_name,commission_pct FROM employees WHERE commission_pct <=> NULL;

#案例二 查询工资为12000的员工信息
#案例1 查询没有奖金的员工名和奖金率

SELECT last_name,salary FROM employees WHERE salary <=> 12000;

# is null pk   <=>

IS NULL :仅仅可以判断null值
<=> :既可以判断null值 ,也可以判断普通的数值 ,可读性较低


#2.查询员工号为176的员工的姓名和部门号和年薪

SELECT
	last_name,
	department_id,
	salary * 12 * (
	1 + IFNULL( commission_pct, 0 )) AS 年薪
FROM
	employees

-- ISNULL(expr)函数的使用
功能 判断某字段或表达式是否为null ,如果是 ,则返回1 ,否则返回0
SELECT ISNULL(commission_pct) from employees

##进阶三 排序查询
/*
语法 SELECT 查询列表 FROM 表 WHERE 筛选条件 ORDER BY 排序列表 ASC/DESC

特点 1.ASC 升序 ,DESC 降序  不写 ,默认升序:
			2.ORDER BY子句中可以支持单个字段 ,多个字段 ,表达式 ,函数 ,别名
			3.ORDER BY子句一般放在查询语句的最后面 ,LIMIT子句除外
*/
-- 引入 /
#案例 查询员工信息 ,要求工资从高到低排序 
SELECT * from employees ORDER BY salary DESC;

#查询部门编号 >= 90的员工信息 ,按照入职时间的先后进行排序:[添加筛选条件]
SELECT
	*
FROM
	employees
WHERE
	department_id >= 90
ORDER BY
	hiredate ASC;

	#案例 按年薪的高低显示员工的信息和年薪{按表达式进行排序}

	SELECT *,salary * 12 * (1+IFNULL(commission_pct,0)) 年薪
	FROM employees ORDER BY salary * 12 * (1+IFNULL(commission_pct,0)) DESC;


	#案例  
		SELECT *,salary * 12 * (1+IFNULL(commission_pct,0)) 年薪
	FROM employees ORDER BY 年薪 DESC;

	#案例 按照姓名的长度显示员工的姓名和工资[按函数排序]
	SELECT LENGTH(last_name) 字节长度,last_name,salary
	FROM employees
	ORDER BY LENGTH(last_name);

	#案例 查询员工信息:要求先按工资进行排序 ,再按员工编号进行排序[按多个字段进行排序]
	SELECT * FROM employees order by salary ASC,employee_id DESC;

*************3月28日学习********END**************


***********3月30日学习**********START***********

测 试
1. 查询员工的姓名和部门号和年薪 ,按年薪降序 按姓名升序
SELECT
	last_name,
	department_id,
	salary * 12 *(
	1+IFNULL ( commission_pct, 0 )) AS 年薪
FROM
	employees
ORDER BY
	年薪 DESC,
	last_name ASC
2.选择工资不在 8000 到 17000 的员工的姓名和工资 ,按工资降序
SELECT
last_name,
salary
FROM
	employees
WHERE
	salary NOT BETWEEN 8000
	AND 17000
ORDER BY
	salary DESC;

3. 查询邮箱中包含 e 的员工信息 ,并先按邮箱的字节数降序 ,再按部门号升序

SELECT
	*
FROM
	employees
WHERE
	email LIKE '%e%'
ORDER BY
	LENGTH( email ) DESC,
	department_id ASC;


	##进阶4::常见函数
	/**
	概念 类似于java的方法 ,将一组逻辑语句封装在方法体中对外暴露方法名
	好处 1.隐藏了实现细节2 ,提高了代码的重用性
	调用 SELECT 函数名(实参列表) FROM 表 ;
	特点 1.叫什么(函数名)

	2.干什么(函数功能)

	分类 	1.单行函数 CONCAT(str1,str2,...).LENGTH(str),IFNULL(expr1,expr2)
					2.分组函数
	*/



	#一.字符函数

	1. LENGTH(str) 获取参数值的字节个数
SELECT
	LENGTH( 'JOHN' );

	//汉字三个字节
SELECT
	LENGTH( '张三丰' );

	SHOW VARIABLES LIKE '%char%';

	2. CONCAT(str1,str2,...) 拼接字符串

	SELECT CONCAT(last_name,'-',first_name) FROM employees;

	3. UPPER(str),LOWER(str)
	SELECT UPPER('john');
	SELECT LOWER('JOhN');

	##示例将姓变大写 ,名变小写 ,然后拼接
	SELECT CONCAT(UPPER(last_name),'-',LOWER(first_name)) 姓名 FROM employees

	4. substr,substring,
	注意 索引从1开始
	#截取 从指定索引出后面所有的字符
	SELECT SUBSTR('李莫愁爱上了陆展源',7) out_put;

	#截取 从指定索引处指定字符长度的字符
	SELECT SUBSTR('李莫愁爱上了陆展源',1,3) out_put;

	##案例:姓名中首字符大写 ,其他字符小写 ,然后拼接
SELECT
	CONCAT(
		UPPER(
		SUBSTR( last_name, 1, 1 )),
		'-',
		LOWER(
		SUBSTR( last_name, 2 ))) OUT_PUT
FROM
	employees;

	5. INSTR(str,substr) 返回子串第一次出现的索引 ,如果找不到返回0

SELECT
	INSTR( '杨不梅爱上了殷六侠', '殷六侠' ) AS out_put ;


6. TRIM([remstr FROM] str)  去前后

SELECT TRIM('     张翠山        ') AS out_put;

SELECT TRIM('a' FROM 'aaaaaaaaaaaaa张aaaaaa翠山aaaaaaaaaaaa') AS out_put;

7. LPAD(str,len,padstr)  用指定的字符实现左填充指定长度

SELECT LPAD('殷素素',10,'*') as out_put;

8. RPAD(str,len,padstr) 右填充

SELECT RPAD('殷素素',10,'*') as out_put;

9. REPLACE(str,from_str,to_str) 替换

SELECT REPLACE('张无忌爱上了周芷若','周芷若','赵敏') AS out_put;

##二.数学函数
 #ROUND(X) 四舍五入
 SELECT ROUND(1.45);
 SELECT ROUND(1.567,2);

 #ceil 向上取整 返回>=该参数的最小整数:
 SELECT CEIL(1.001);
 SELECT CEIL(-1.001);

 #FLOOR(X) 向下取整 ,返回<=该参数的最大整数:
 SELECT FLOOR(-9.99);

 #TRUNCATE(X,D) 截断
 SELECT TRUNCATE(1.69999,1);

#MOD(N,M) 取余
/**
MOD(a,b) a-a/b*b;
*/
SELECT MOD(-10,-3);
SELECT 10%3;


#3.日期函数 

#NOW() 返回当前系统的日期+时间
SELECT NOW();

#CURDATE() 返回当前日期 ,不包含时间
SELECT CURDATE();

#CURTIME() 返回当前时间 ,不包含日期
SELECT CURTIME();

#可以获取指定的部分 ,年月日 ,小时 ,分 ,秒
SELECT YEAR(NOW()) 年;
SELECT YEAR('1998-1-1') 年;
SELECT YEAR(hiredate) FROM employees;

SELECT MONTH(NOW()) 月;
SELECT MONTHNAME(NOW()) 月;


#STR_TO_DATE(str,format) 将字符通过指定的格式转换为日期:
SELECT STR_TO_DATE('1998-3-2','%Y-%c-%d') as out_put;

#查询入职日期为1992-4-3的员工信息
SELECT * FROM employees WHERE hiredate = '1992-4-3';

SELECT * FROM employees WHERE hiredate = STR_TO_DATE('4-3 1992','%c-%d %Y');

#DATE_FORMAT(date,format) 将日期转换为字符串
SELECT DATE_FORMAT(NOW(),'%y年%m月%d日') AS OUT_PUT;

#查询有奖金的员工名和入职日期 (%月/xx日  xx年)

SELECT
	last_name,
	DATE_FORMAT( hiredate, '%m月%d日 %Y年' ) AS 入职日期
FROM
	employees
WHERE
	commission_pct IS NOT NULL;

	#四.其他函数
	SELECT VERSION();
	SELECT DATABASE();
	SELECT USER();


	***********3月30日学习**********END***********

		***********4月1日学习**********START***********

	#五.流程控制函数 
	#1.if函数 :if else 的效果
	SELECT IF(10>5,'大','小');

SELECT
	last_name,
	commission_pct,
IF
	( commission_pct IS NULL, '没奖金,呵呵', '有奖金,嘻嘻' ) 备注
FROM
	employees;

	#2.case函数的使用一 switch case的效果

	/**
	switch(变量或表达式){
	case 常量1 语句1:break;
	...
	default  语句n:break;
	}


	mysql中 
	case 要判断的字段或表达式
	when 常量1 then 要显示的值1或语句1
	when 常量2 then 要显示的值2或语句2
	...
	else 要显示的值n或语句n
	end

	*/

	/**
	案例 查询员工的工资 ,要求
	部门号 =  30 ,显示的工资为1.1倍
	部门号 = 40  ,显示的工资为1.2倍
	部门号 = 50 ,显示的工资为1.3倍
	其余的部门 ,显示工资为原工资
	*/

SELECT
	salary 原始工资,
	department_id,
CASE
		department_id
		WHEN 30 THEN
		salary * 1.1
		WHEN 40 THEN
		salary * 1.2
		WHEN 50 THEN
		salary * 1.3 ELSE salary
	END AS 新工资
FROM
	employees;

	#CASE函数的使用2:类似于多重if
	/**
		java中 
		if(条件一){
				语句1;
			}else if(条件2){
				语句2;
			}else{
				语句n;
			}
	*/

	/**
		mysql中 

		case:
		when 条件1 then 要显示的值1或语句1;
		when 条件2 then 要显示的值2或语句2;
		...
		else 要显示的值n或语句n:
	*/
#案例 查询员工的工资情况 
#如果工资>20000,显示A级别:
#如果工资>15000,显示B级别
#如果工资>10000,显示C级别
#否则显示D级别
复习地址1:0628-8:46
SELECT salary,
CASE
WHEN salary > 20000 THEN 'A'
WHEN salary > 15000 THEN 'B'
WHEN salary > 10000 THEN 'C'
ELSE 'D'
END AS 工资级别
FROM employees;


#测试题目
#1. 显示系统时间(注 日期+时间)
SELECT NOW();

#2. 查询员工号 ,姓名 ,工资 ,以及工资提高百分之 20%后的结果(new salary)
SELECT
	employee_id,
	last_name,
	salary,
	salary * 1.2 "new salary"
FROM
	employees;

#3. 将员工的姓名按首字母排序 ,并写出姓名的长度(length)
SELECT LENGTH(last_name) ,SUBSTR(last_name,1,1) 首字符,last_name
FROM employees
ORDER BY 首字符;

#4. 做一个查询 ,产生下面的结果
<last_name> earns <salary> monthly but wants <salary*3>

SELECT CONCAT(last_name,' earns',salary,'month but wants',salary*3) as "dream salary"
from employees WHERE salary = 24000;

5.使用 case-when ,按照下面的条件 
job grade
AD_PRES A
ST_MAN B
IT_PROG C
SA_REP D
ST_CLERK E

	SELECT
		last_name,job_id AS job,
	CASE
			job_id
			WHEN 'AD_PRES' THEN
			'A'
			WHEN 'ST_MAN' THEN
			'B'
			WHEN 'IT_PROG' THEN
			'C'
			WHEN 'SA_REP' THEN
			'D'
			WHEN 'ST_CLERK' THEN
			'E'
		END AS grade
	FROM
		employees
		where job_id = 'AD_PRES';

		####二.分组函数 
/**
功能 用作统计使用 ,又称为聚合函数或统计函数或组函数

分类 
sum 求和 avg 平均值 max 最大值 min 最小值 count 计算个数

特点 
1.sum,avg一般用于处理数值型
	max,min ,count 可以处理任何类型
2.以上分组函数忽略null值 ,
3.可以和distinct搭配实现去重的运算
4.count()函数
一般使用count(*)统计行数
5.和分组函数一桶查询的字段要求是Group by 后的字段


**/

1.简单使用 
SELECT SUM(salary) FROM employees;
SELECT AVG(salary) FROM employees;
SELECT MIN(salary) FROM employees;
SELECT MAX(salary) FROM employees;
SELECT COUNT(salary) FROM employees;

SELECT SUM(salary),ROUND(AVG(salary),2),MIN(salary),MAX(salary),COUNT(salary) FROM employees;

#2.特点 参数支持哪些类型 
SELECT SUM(last_name),AVG(last_name) FROM employees;//没有意义

SELECT MAX(last_name),MIN(last_name) FROM employees;

SELECT max(hiredate),MIN(hiredate) FROM employees;

SELECT COUNT(last_name) from employees;



3.忽略null
	SELECT
		SUM( commission_pct ),
		avg( commission_pct ),SUM( commission_pct )/ 35,
		SUM( commission_pct )/ 107
	FROM
		employees;

SELECT max(commission_pct),min(commission_pct) from employees;
SELECT COUNT(commission_pct) from employees;

SELECT commission_pct FROM employees;


	#4.和distinct搭配
	SELECT SUM(DISTINCT salary) ,sum(salary) from employees;

	SELECT COUNT(DISTINCT salary) ,COUNT(salary) from employees;


	5 count()函数的详细介绍

	SELECT COUNT(salary) from employees;

	SELECT COUNT(*) FROM employees
	SELECT COUNT(1) FROM employees;

	效率 MYISM,存储引擎下 ,count(*)的效率高
	INNODB存储引擎下 ,count(*) 和 COUNT(1) 的效率高 ,但是比count(字段)要高一些




	6.和分组函数一同查询的字段有限制
	SELECT AVG(salary),employee_id from employees;


1. 查询公司员工工资的最大值 ,最小值 ,平均值 ,总和 ,
SELECT MAX(salary) mx_sal,MIN(salary) min_sal,ROUND(AVG(salary),2) ag_sal,SUM(salary) sm_sal FROM employees;

2. 查询员工表中最大入职时间和最小入职时间的相差天数
SELECT DATEDIFF(MAX(hiredate),MIN(hiredate)) DIFFRENG FROM employees;

3. 查询部门编号为90的员工个数
SELECT COUNT(*) FROM employees WHERE department_id = 90;


##进阶5 分组查询
#引入 查询每个部门的平均工资
语法 
			SELECT 分组函数 ,列(要求出现在 group by) 后面
			FROM 表
			WHERE [筛选条件]
			GROUP BY 分组的列表
			ORDER BY 子句

注意 
			 查询列表必须特殊 ,要求是分组函数和 group by 后出现的字段

特点 
			1.分组查询中的筛选条件分为两类
											数据源            位置                       关键字
			分组前筛选     原始表              GROUP BY 子句的前面       WHERE
			分组后筛选     分组后的结果集      GROUP BY 子句的后面        having

			1.分组函数做条件肯定是放在having子句中
			2.能用分组前筛选前的 ,优先考虑分组前筛选

			2 GROUP BY 子句支持单个字段分组 ,多个字段分组(多个字段之间用逗号隔开没有顺序要求) ,表达式或函数(用的较少)
			3. 也可以添加排序(排序放在整个分组查询的最后)


			 [简单的分组查询]

			 #案例1 查询每个工种的最高工资

			 SELECT MAX(salary),job_id FROM employees GROUP BY job_id;

			 #案例2 每个位置上的部门个数
			 SELECT COUNT(*),location_id FROM departments GROUP BY location_id;

		***********4月1日学习**********END***********

		***********4月4日学习******START********
		#添加分组前筛选条件
		#案例1:查询邮箱中包含a字符的 ,每个部门的平均工资
		SELECT Avg(salary),department_id
		from employees
		where email like '%a%'
		GROUP BY department_id;

		#案例2 查询有奖金的每个领导手下员工的最高工资
		SELECT MAX(salary),manager_id
		from employees
		where commission_pct is not NULL
		GROUP BY manager_id

		# 添加分组后的筛选条件

		#案例1 查询哪个部门的员工个数 > 2
		#1.查询每个部门的员工个数


		SELECT COUNT(*),department_id
		from employees
		GROUP BY department_id

		#2.根据1的结果进行筛选 ,查询哪个部门的员工个数 > 2

		SELECT COUNT(*),department_id
		from employees
		GROUP BY department_id
		HAVING COUNT(*) > 2;

		#案例2:查询每个工种有奖金的员工的最高工资 > 12000 的工种编号和最高工资.
		#1.查询每个工种有奖金的员工的最高工资


		SELECT MAX(salary),job_id
		from employees
		WHERE commission_pct is not NULL
		GROUP BY job_id;

		#2.根据1的结果继续筛选 ,最高工资> 12000

				SELECT MAX(salary),job_id
		from employees
		WHERE commission_pct is not NULL
		GROUP BY job_id
		HAVING MAX(salary) > 12000;

		#案例3   查询领导编号> 102 的每个领导手下的最低工资 > 5000的领导编号是哪个 ,以及其最低工资

		#1.查询每个领导手下的员工的固定最低工资
		SELECT MIN(salary),manager_id
		from employees
		GROUP BY manager_id;

		#2.添加筛选条件 ,编号>102
				SELECT MIN(salary),manager_id
		from employees
		where manager_id > 102
		GROUP BY manager_id;

		#3.添加筛选条件 ,最低工资 > 5000
SELECT
	MIN( salary ),
	manager_id
FROM
	employees
WHERE
	manager_id > 102
GROUP BY
	manager_id
HAVING
	MIN( salary ) > 5000


	#按照表达式或函数进行分组 

	#案例 按员工姓名的长度分组 ,查询每一组的员工个数 ,筛选员工个数 > 5的有哪些

	#1.查询每个长度的员工个数

	SELECT COUNT(*),LENGTH(last_name) len_name
	FROM employees
	GROUP BY LENGTH(last_name);

	#2 ,添加筛选条件(支持别名)

	SELECT COUNT(*),LENGTH(last_name) len_name
	FROM employees
	GROUP BY len_name
	HAVING COUNT(*)>5;

	#按多个字段进行分组

	#案例 查询每个部门 ,每个工种的员工的平均工资
	SELECT AVG(salary),department_id,job_id
	FROM employees
	GROUP BY department_id,job_id;###顺序可以变换
#添加排序
#案例 查询每个部门每个工种的员工的平均工资 ,并且按平均工资的高低显示


SELECT AVG(salary),department_id,job_id
FROM employees
WHERE department_id IS NOT NULL
GROUP BY department_id,job_id
ORDER BY AVG(salary) DESC;

#1. 查询各 job_id 的员工工资的最大值 ,最小值 ,平均值 ,总和 ,并按 job_id 升序
SELECT MAX(salary),MIN(salary),AVG(salary),SUM(salary)
from employees
GROUP BY job_id
ORDER BY job_id;

#2. 查询员工最高工资和最低工资的差距(DIFFERENCE)
SELECT MAX(salary) - MIN(salary) DIFFERENCE
from employees;
#3. 查询各个管理者手下员工的最低工资 ,其中最低工资不能低于 6000 ,没有管理者的员
工不计算在内
SELECT MIN(salary),manager_id
from employees
WHERE manager_id is not NULL
GROUP BY manager_id
HAVING MIN(salary) >= 6000


#4. 查询所有部门的编号 ,员工数量和工资平均值,并按平均工资降序
SELECT department_id,	COUNT(*),AVG(salary) a
FROM employees
GROUP BY department_id
ORDER BY a desc;

#5. 选择具有各个 job_id 的员工人数

SELECT COUNT(*)个数 ,job_id
FROM employees
GROUP BY job_id;

		***********4月4日学习******END********

		********4月6号学习*****START****

#进阶6 连接查询
/**
含义 又称多表查询 ,当查询的字段来自于多个表时 ,就会用到连接查询

笛卡尔乘积现象 表1:有m行 ,表2有n行 ,结果 = m* n行
发生原因 没有有效的连接条件
如何避免 添加有效的连接条件

分类 
			按年代分类 
			sql 92标准 仅仅支持内连接
			sql 99 标准[推荐]支持内连接+外链接(左外 ,右外)+交叉连接
			按功能分类 
						内连接 
									等值连接
									非等值连接
									自连接
						外链接 
									左外连接
									右外连接
									全外连接
						交叉连接 

**/

SELECT * FROM beauty;

SELECT * FROM boys;

SELECT NAME,boyName FROM boys,beauty
WHERE beauty.boyfriend_id = boys.id;

#一.sql92标准
#1.等值连接

/**
1.多表等值连接的结果为多表的交集部分
2.n表连接 ,至少需要n-1个连接条件
3.多表的顺序没有要求
4.一般需要为表取别名:
5.可以搭配前面介绍的所有子句使用 ,比如排序 ,分组 ,筛选.
*/

#案例1 查询女神名和对应的男生名

SELECT NAME,boyName FROM boys,beauty
WHERE beauty.boyfriend_id = boys.id;


#2.为表起别名 
/***
1.提高语句的简洁度
2.区分多个重名的字段

注意 如果为表取了别名 ,则查询的字段就不能使用原来的表名去限定

**/
#案例2 查询员工名和对应的部门名

SELECT last_name,department_name
FROM employees,departments
WHERE employees.department_id = departments.department_id;

#2.查询员工名 ,工种号 ,工种名
SELECT last_name,e.job_id,j.job_title
FROM employees as e,jobs j
WHERE e.job_id = j.job_id;

#3.两个表的顺序是否可以调换

#.查询员工名 ,工种号 ,工种名
SELECT last_name,e.job_id,j.job_title
FROM jobs j,employees as e
WHERE e.job_id = j.job_id;

#4.可以加筛选
#案例1 查询有奖金的员工名 ,部门名

SELECT last_name,department_name
from employees e,departments d
WHERE e.department_id = d.department_id
AND e.commission_pct IS NOT NULL

#案例2 查询城市名中第二个字符为O的部门名和城市名

SELECT department_name,city
FROM departments d,locations l
WHERE d.location_id = l.location_id
AND city like '_o%';


#5.可以加分组

#案例1 查询每个城市的部门个数

SELECT COUNT(*) 个数,city
FROM departments d,locations l
WHERE d.location_id = l.location_id
GROUP BY city;


#案例2:查询有奖金的每个部门的部门名和部门的领导编号和该部门的最低工资

SELECT department_name,d.manager_id,MIN(salary)
from departments d,employees e
WHERE d.department_id = e.department_id
and commission_pct is not null
GROUP BY department_name,manager_id;

#6.可以加排序

#案例 查询每个工种的工种名和员工的个数 ,并且按员工个数降序

SELECT job_title,COUNT(*)
FROM employees
WHERE e.job_id = j.job_id
GROUP BY job_title
ORDER BY COUNT(*) DESC;

#7.实现三表连接

#案例 查询员工名 ,部门名 ,和所在的城市

SELECT last_name,department_name,city
FROM employees e,departments d,locations l
WHERE e.department_id = d.department_id
AND d.location_id = l.location_id
AND city LIKE 's%'
ORDER BY department_name DESC;

#2.非等值连接 

#案例1 查询员工的工资和工资级别


SELECT salary,grade_level,department_id
 FROM employees e,job_grades g
 WHERE salary BETWEEN g.lowest_sal AND g.highest_sal;

 #3.自连接

 #案例 查询员工名 ,和上级的名称
 SELECT e.employee_id,e.last_name,m.employee_id ,m.last_name
 FROM employees e,employees m
 WHERE e.manager_id = m.employee_id;





 三.查询员工表的job_id中包含 a 和 e的 ,并且a在e的前面

 SELECT job_id from employees where job_id LIKE '%a%e%';

 五 .显示当前日期 ,以及去前后空格 ,截取字符串的函数

 SELECT NOW();
 SELECT TRIM(字符 from '');

 SELECT SUBSTR(STR,startIndex);

 ####作业 
 #1. 显示所有员工的姓名 ,部门号和部门名称;
 SELECT last_name,d.department_id,department_name
 from employees e,departments d
 WHERE e.department_id = d.department_id

#2. 查询 90 号部门员工的 job_id 和 90 号部门的 location_id
SELECT job_id,location_id
from employees e,departments d
WHERE e.department_id = d.department_id
AND e.department_id = 90;



3. 选择所有有奖金的员工的
last_name , department_name , location_id , city
SELECT last_name , department_name , l.location_id , city
from employees e,departments d,locations l
WHERE e.department_id = d.department_id
AND d.location_id = l.location_id
AND e.commission_pct IS NOT NULL;

4. 选择city在Toronto工作的员工的
last_name , job_id , department_id , department_name

SELECT last_name , job_id , department_id , department_name
FROM employees e,departments d,locations l
WHERE e.department_id = d.department_id
AND d.location_id = l.location_id
AND city = 'Toronto';

5.查询每个工种.每个部门的部门名.工种名和最低工资
SELECT department_name,job_title,MIN(salary) 最低工资
FROM employees e,departments d,jobs j
WHERE e.department_id = d.department_id
AND e.job_id = j.job_id
GROUP BY department_name,job_title

#6.查询每个国家下的部门个数大于 2 的国家编号

SELECT country_id,COUNT(*) 部门个数
FROM departments d,locations l
WHERE d.location_id = l.location_id
GROUP BY country_id
HAVING 部门个数 > 2

#7.选择指定员工的姓名 ,员工号 ,以及他的管理者的姓名和员工号 ,结果类似于下面的格
式
employees Emp# manager Mgr#
kochhar 101 king 100

SELECT e.last_name,e.employee_id "Emp#",m.last_name,m.employee_id "Mgr#"
FROM employees e,employees m
WHERE e.employee_id = m.employee_id
AND e.last_name = "kochhar";



	********4月6号学习*****END****



	********4月10号学习*****START****
	#sql99语法 
	/*
	语法 
			SELECT 查询列表
			FROM 表1 别名 [连接类型]
			join 表2 别名
			on 连接条件
			WHERE 筛选条件
			GROUP BY 分组
			having 筛选条件
			ORDER BY 排序列表

	内连接 INNER
	外连接
				左外: left(OUTER)
				右外 right
				全外 :FULL
	交叉连接:cross
	*/


		#1.内连接 
			/**
			语法 
			SELECT 查询列表
			FROM 表1 别名
			inner join 表2 别名
			on 连接条件;

			分类 
			等值 
			非等值 
			自连接

			特点 
			1.添加排序 ,分组 ,筛选
			2 ,inner 可以省略
			3.筛选条件放在where 后面 ,连接条件放在on后面 ,提高分离性 ,便于阅读
			4.inner JOIN 连接和sql92语法中的等值连接效果是一样的 ,都是查询交集部门.




			*/

		#1.等值连接 
		案例一 查询员工名 ,部门名(调换位置)

		SELECT last_name,department_name
		from departments d
		INNER JOIN employees e
		ON e.department_id = d.department_id


		#案例二 查询名字中包含a的员工名和工种名(筛选)
		SELECT last_name,job_title
		from employees e
		INNER JOIN jobs j
		ON e.job_id = j.job_id
		WHERE e.last_name LIKE '%e%';

		#案例3 查询部门个数 > 3的城市名和部门个数 ,(添加分组+外加筛选)

		#1.查询每个城市的部门个数

		SELECT city,COUNT(*) 个数
		FROM departments d
		INNER JOIN locations l
		on d.location_id = l.location_id
		GROUP BY city
		HAVING COUNT(*) > 3;

		#案例4 查询每个部门的部门员工数>3的部门名和员工个数 ,并按个数降序(排序)

		1.查询每个部门的员工个数

		SELECT count(*),department_name
		FROM employees e
		INNER JOIN departments d ON e.department_id = d.department_id
		GROUP BY department_name;

		2.在1的结果上筛选员工个数>3的记录 ,并排序

		SELECT count(*),department_name
		FROM employees e
		INNER JOIN departments d ON e.department_id = d.department_id
		GROUP BY department_name
		HAVING COUNT(*) > 3
		ORDER BY COUNT(*) DESC

		#案例5 查询员工名,部门名 ,工种名 ,并按部门名降序.

		SELECT last_name,department_name,job_title
		FROM employees e
		INNER JOIN departments d ON e.department_id = d.department_id
		INNER JOIN jobs j on e.job_id = j.job_id
		ORDER BY department_name DESC;


		#二.非等值连接

			#查询员工的工资级别

			SELECT salary,grade_level
			FROM employees e
			JOIN job_grades g
			ON e.salary BETWEEN g.lowest_sal and g.highest_sal

			#查询每个工资级别 > 20的个数 ,并且按工资级别降序
			SELECT COUNT(*),salary,grade_level
			FROM employees e
			JOIN job_grades g
			ON e.salary BETWEEN g.lowest_sal and g.highest_sal
			GROUP BY grade_level
			HAVING COUNT(*) > 20
			ORDER BY grade_level DESC;

			三.自连接 

			#查询员工的名字 ,上级的名字

			SELECT e.last_name,m.last_name
			FROM employees e
			JOIN employees m ON e.manager_id = m.employee_id

			#查询姓名中包含字符K的员工的名字 ,上级的名字
			SELECT e.last_name,m.last_name
			FROM employees e
			JOIN employees m ON e.manager_id = m.employee_id
			WHERE e.last_name like '%k%';

			二.外连接

			/**
			应用场景 用于查询一个表中有 ,另一个表没有的记录

			特点 
						1.外链接的查询结果为主表中的所有记录
								如果从表中有和它匹配的 ,则显示匹配的值
								如果从表中没有和它匹配的值 ,则显示null,
								外链接查询结果=内连接结果+主表中有而从表中没有的记录
						2.左外连接 ,left join 左边的是主表
						  右外连接 ,right join 右边的是主表
						3.左外和右外交换两个表的顺序 ,可以实现同样的效果
						4.全外连接 = 内连接的结果+表1中有 ,但表2没有的+表2中有但表1没有的
			*/
			#引入 查询男朋友不在男生表的女神名
			SELECT * FROM beauty;
			SELECT * FROM boys;

			#左外连接实现
			SELECT b.name,bo.*
			FROM beauty b
			LEFT OUTER JOIN boys bo ON b.boyfriend_id = bo.id
			WHERE bo.id IS NULL;

			#右外连接实现
			SELECT b.name,bo.*
			FROM boys bo
			RIGHT OUTER JOIN beauty b ON b.boyfriend_id = bo.id
			WHERE bo.id IS NULL;

			SELECT b.name,bo.*
			FROM boys bo
			LEFT OUTER JOIN beauty b ON b.boyfriend_id = bo.id
			WHERE b.id IS NULL;


			#案例 查询哪个部门没有员工
			#左外 

			SELECT d.*,e.employee_id
			FROM departments d
			LEFT OUTER JOIN employees e ON d.department_id = e.department_id
			WHERE e.employee_id IS NULL;

			#右外 
			SELECT d.*,e.employee_id
			FROM employees e
			RIGHT OUTER JOIN departments d ON d.department_id = e.department_id
			WHERE e.employee_id IS NULL;

			#全外 Mysql不支持


			SELECT b.*,bo.*
			FROM beauty b
			FULL OUTER JOIN boys bo
			ON b.boyfriend_id = bo.id;

	********4月10号学习*****END****


******4月20号学习*****START****

#交叉连接 
SELECT b.*,bo.*
FROM beauty b
CROSS JOIN boys bo;

#sql92和sql99 PK 

#案例讲解 
#一.查询编号>3的女神的男朋友信息 ,如果有则详细列出 ,如果没有 ,用null填充

#查询哪个城市没有部门

#查询部门名为SAL 或IT的员工信息


进阶7 子查询 
/**
含义 
出现在其他语句中的select语句 ,称为子查询或内查询:
外部查询语句 , 称为主查询或外查询

分类:
按子查询出现的位置 

SELECT 后面 : 仅仅支持标量子查询
FROM 后面 支持表子查询
WHERE 或 having后面   标量子查询(单行) ,列子查询(多行) ,行子查询
EXISTS 后面(相关子查询)  表子查询

按结果集的行列式不同 
				标量子查询(结果集只有一行一列)
				列子查询(结果集只有一列多行)
				行子查询(结果集有一行多列)
				表子查询(结果集一般为多行多列)


*/

#一.where 或having后面
1.标量子查询(单行子查询)

2.列子查询(多行子查询)

3.行子查询(多列多行)

特点 
1.子查询都是放在小括号内
2.子查询一般放在条件的右侧
3.标量子查询 ,一般搭配这单行操作符使用
> < >= <= = <>

列子查询 ,一般搭配着多行操作符使用
IN ANY.SOME,ALL
4.子查询的执行优先于主查询执行 ,主查询的条件用到了子查询的结果.



1.标量子查询 

#案例1 谁的工资比Abel高

#1.查询Abel的工资
SELECT salary
FROM employees
where last_name = 'Abel'

#2.查询员工的信息 ,满足salary > #1结果
SELECT *
FROM employees
WHERE salary > (
SELECT salary
FROM employees
where last_name = 'Abel'
)

#案例2 返回job_id 与141号员工相同 ,salary 比 143 号员工多的员工 姓名 ,job_id,和工资

#1.查询141号员工的job_id
SELECT job_id
FROM employees
where employee_id = 141

#2.查询143号员工的salary
SELECT salary
FROM employees
WHERE employee_id = 143

#3.查询员工的姓名 ,job_id和工资 ,要求job_id = 1 并且salary > 2
SELECT last_name,job_id,salary
FROM employees
WHERE job_id = (
SELECT job_id
FROM employees
where employee_id = 141
) AND salary >(
SELECT salary
FROM employees
WHERE employee_id = 143
)

#案例3:返回公司工资最少的员工的last_name,job_id和salary

#1.查询公司的最低工资
SELECT MIN(salary)
FROM employees;

#2.查询last_name,job_id,和salary,要求salary = 1
SELECT last_name,job_id,salary
FROM employees
WHERE salary = (SELECT MIN(salary)
FROM employees);

#案例4 查询最低工资大于50号部门最低工资的部门id ,和其最低工资

#1.查询50号部门的最低工资
SELECT MIN(salary)
FROM employees
WHERE department_id = 50

#2.查询每个部门的最低工资
SELECT MIN(salary),department_id
FROM employees
GROUP BY department_id

#3.在2基础上进行筛选2 ,满足min(salary) > 1的结果
SELECT MIN(salary),department_id
FROM employees
GROUP BY department_id
HAVING MIN(salary) > (
			SELECT MIN(salary)
			FROM employees
			WHERE department_id = 50
)

#非法使用标量子查询
SELECT MIN(salary),department_id
FROM employees
GROUP BY department_id
HAVING MIN(salary) > (
			SELECT MIN(salary)
			FROM employees
			WHERE department_id = 50
);


******4月20号学习*****END****

******5月2号学习*****START****

#2.列子查询(多行子查询)

#案例1 返回location_id是1400或1700的部门中的所有员工姓名

#1.查询location_id 是 1400 或 1700 的部门编号
SELECT DISTINCT department_id
FROM departments
WHERE location_id in(1400,1700);

#2.查询员工姓名 ,要求部门号是1列表中的某一个
SELECT last_name
FROM employees
WHERE department_id IN(
SELECT DISTINCT department_id
FROM departments
WHERE location_id in(1400,1700)
);

#案例2 返回其它工种中比job_id为'IT_PROG'部门任一工资低的员工的员工号.姓名.job_id 以及salary

#查询job_id,为IT_PROG部门任一工资
SELECT DISTINCT salary
FROM employees
WHERE job_id = 'IT_PROG'

#2.查询员工名 ,姓名 ,job_id,以及 salary, salary < 1的任意一个
SELECT last_name,employee_id,job_id,salary
FROM employees
WHERE salary < ANY(SELECT DISTINCT salary
FROM employees
WHERE job_id = 'IT_PROG')
AND job_id <> 'IT_PROG';

或
SELECT last_name,employee_id,job_id,salary
FROM employees
WHERE salary < (SELECT MAX(salary)
FROM employees
WHERE job_id = 'IT_PROG')
AND job_id <> 'IT_PROG';


#案例3 返回其它工种中比job_id为'IT_PROG'部门所有工资低的员工的员工号.姓名.job_id 以及salary

SELECT last_name,employee_id,job_id,salary
FROM employees
WHERE salary < ALL(SELECT DISTINCT salary
FROM employees
WHERE job_id = 'IT_PROG')
AND job_id <> 'IT_PROG';


或
SELECT last_name,employee_id,job_id,salary
FROM employees
WHERE salary < (SELECT MIN(salary)
FROM employees
WHERE job_id = 'IT_PROG')
AND job_id <> 'IT_PROG';



#3.行子查询(结果集一行多列或多行多列)
#案例 查询员工编号最小并且工资最高的员工信息

SELECT *
FROM employees
WHERE (employee_id,salary) = (
SELECT MIN(employee_id),MAX(salary)
from employees
)

#1.查询最小的员工编号
SELECT MIN(employee_id)
FROM employees;
#2.查询最高工资
SELECT MAX(salary)
FROM employees;
#3.查询员工信息
SELECT *
from employees
WHERE employee_id = (SELECT MIN(employee_id)
FROM employees) AND salary = (SELECT MAX(salary)
FROM employees)


#二.select后面
/***
仅仅支持标量子查询
*/

#案例1 查询每个部门的员工个数
SELECT d.*,( SELECT COUNT(*) FROM employees e WHERE e.department_id = d.department_id ) 个数
FROM
	departments d;

#案例2 查询员工号 = 102的部门名

SELECT
	( SELECT department_name FROM departments d INNER JOIN employees e ON d.department_id = e.department_id WHERE e.employee_id = 102 ) 部门名;

#三.from 后面

/**
将子查询结果充当一张表 ,要求必须起别名.
*/

#案例  查询每个部门的平均工资的工资等级

#1查询每个部门的平均工资
SELECT AVG(salary) ,department_id
FROM employees
GROUP BY department_id

SELECT * FROM job_grades;

#2连接1的结果集和job_grades表 ,筛选条件平均工资 between lowest_sal and highest_sal

SELECT
	ag_dep.*,
	g.grade_level
FROM
	( SELECT AVG( salary ) ag, department_id FROM employees GROUP BY department_id ) ag_dep
	INNER JOIN job_grades g ON ag_dep.ag BETWEEN lowest_sal
	AND highest_sal;

	***********5月2号学习****end****


******5月3号学习*****START****


#四.exists 后面(相关子查询)


/**
语法 
exists(完整的查询语句)
结果 
1或0

*/
SELECT EXISTS(SELECT employee_id FROM employees)

#案例1 查询有员工的部门名

#in
SELECT department_name
FROM departments d
WHERE d.department_id in(SELECT department_id FROM employees)

	SELECT department_name
	FROM departments d
	WHERE EXISTS(
		SELECT * from employees e where d.department_id = e.department_id
	);


	#案例2 查询没有女朋友的男神信息

	#IN
	SELECT bo.*
	FROM boys bo
	WHERE bo.id not in(SELECT boyfriend_id FROM beauty)

	#exists
SELECT
	bo.*
FROM
	boys bo
WHERE
	NOT EXISTS (
	SELECT
		boyfriend_id
	FROM
		beauty b
	WHERE
	bo.id = b.boyfriend_id)

	#案例讲解

	#1.查询和Zlotkey相同部门的员工姓名和工资
		1.查询Zlotkey的部门
		SELECT department_id
		FROM employees
		WHERE last_name = "Zlotkey"

		2.查询部门号 = 1的姓名和工资
		SELECT last_name,salary
		FROM 	employees
		WHERE department_id = (
		SELECT department_id
		FROM employees
		WHERE last_name = "Zlotkey"
		)


	#2.查询工资比公司平均工资高的员工的员工号 ,姓名和工资
		1.查询平均工资
		SELECT AVG(salary)
		FROM employees

		2.查询工资 > 1的员工号 ,姓名和工资
		SELECT last_name,employee_id,salary
		FROM employees
		WHERE salary >(
			SELECT AVG(salary)
			FROM employees
		)


	#3.查询各部门中工资比本部门的平均工资高的员工的员工号 ,姓名和工资
		#1.各部门的平均工资
		SELECT AVG(salary),department_id
		FROM employees
		GROUP BY department_id

		#2.连接1结果集和employees表 ,进行筛选
		SELECT employee_id,last_name,salary,e.department_id
		FROM employees e
		INNER JOIN (SELECT AVG(salary) ag,department_id
		FROM employees
		GROUP BY department_id) ag_dep ON e.department_id = ag_dep.department_id
		WHERE salary > ag_dep.ag

	#4.查询和姓名中包含字母u的员工在相同部门的员工的员工号和姓名
		1.查询姓名中包含u的部门
		SELECT DISTINCT department_id
		FROM employees
		WHERE last_name LIKE '%u%';

		2.查询部门号 = 1中的任意一个的员工号和姓名
		SELECT last_name,employees_id
		FROM employees
		WHERE department_id IN(SELECT DISTINCT department_id
		FROM employees
		WHERE last_name LIKE '%u%');


	#5.查询在部门的location_id 为1700的部门工作的员工的员工号
		#1.查询localtion_id 为1700的部门
		SELECT DISTINCT department_id
		FROM departments
		where location_id = 1700

		#2.查询部门号 = #1中任意一个的员工号;
		SELECT employee_id
		from employees
		WHERE department_id = ANY(
		SELECT DISTINCT department_id
		FROM departments
		where location_id = 1700
		)

	#6.查询管理者是King的员工姓名和工资
			1.查询姓名为King的员工编号
		SELECT employee_id
	FROM employees
WHERE last_name = "K_ing"
			2.查询哪个员工的manger_id = 1
			SELECT last_name,salary
			FROM employees
			WHERE manager_id IN(
	SELECT
		employee_id
	FROM
		employees
	WHERE
		last_name = "K_ing"
			)

	#7.查询工资最高的员工的姓名 ,要求first_name和last_name显示为一列 ,列名为姓.名

	#1.查询最高工资
	SELECT MAX(salary)
	FROM employees;

	#2.查询工资 = #1 的姓.名

	SELECT CONCAT(first_name,last_name,) "姓.名"
	FROM employees
	WHERE salary = (SELECT MAX(salary) FROM employees)

	#进阶8 分页查询

	/*
	应用场景 当要显示的数据 ,一页显示不全 ,需要分页提交sql请求


	语法 
				SELECT 查询列表
				FROM 表
				JOIN TYPE JOIN 表2 ON 连接条件 WHERE 筛选条件
				GROUP BY 分组字段 HAVING 分组后的查询
				ORDER BY 排序的字段
				LIMIT OFFSET,size;
				OFFSET :要显示条目的起始索引 ,(起始索引从0开始)
				size:要显示的条目个数

		特点:
				1.limit语句放在查询语句的最后
				2.公式 
				要显示的页数 page 每页条目数size

				SELECT 查询列表
				FROM 表
				limit (page - 1) * size,size;

	*/

	#案例1 查询前5条员工信息

	SELECT * FROM employees LIMIT 0,5;
	SELECT * FROM employees LIMIT 5;

	#案例2 查询第11条-第25条:

	SELECT * FROM employees LIMIT 10,15;

	#案例3 有奖金的员工信息 ,并且工资较高的前10名显示出来
SELECT
	*
FROM
	employees
WHERE
	commission_pct IS NOT NULL
ORDER BY
	salary DESC
	LIMIT 10;

	#查询语句中涉及到的所有的关键字 ,以及执行先后顺序

	SELECT 查询列表
	FROM 表
	连接类型 JOIN 表2 ON 连接条件
	WHERE 筛选条件
	GROUP BY 分组列表
	HAVING 分组后的筛选
	ORDER BY 排序列表
	LIMIT 偏移 ,条目数;

	#子查询经典案例讲解 
	1.查询工资最低的员工信息 last_name,salary
			#1.查询最低工资
			SELECT MIN(salary) FROM employees;
			#2.查询last_name,salary,要求salary = 1
			SELECT last_name,salary
			FROM employees
			WHERE salary = (SELECT MIN(salary) FROM employees)
	2.查询平均工资最低的部门信息
			#1.查询各部门的平均工资
			SELECT AVG(salary),department_id
			FROM employees
			GROUP BY department_id

			#2.查询1结果上的最低平均工资
			SELECT MIN(ag),department_id
			FROM (
			SELECT AVG(salary) ag,department_id
			FROM employees
			GROUP BY department_id
			) ag_dep

			#3查询哪个部门编号的平均工资 =  2
			SELECT AVG(salary),department_id
			FROM employees
			GROUP BY department_id
			HAVING AVG(salary) = (
				SELECT MIN(ag),department_id
				FROM (
				SELECT AVG(salary) ag,department_id
				FROM employees
				GROUP BY department_id
				) ag_dep
			);

			#4.查询部门信息
			SELECT d.*
			FROM departments d
			WHERE d.department_id = (
			SELECT department_id
			FROM employees
			GROUP BY department_id
			HAVING AVG(salary) = (
				SELECT MIN(ag),department_id
				FROM (
				SELECT AVG(salary) ag,department_id
				FROM employees
				GROUP BY department_id
				) ag_dep
			)
		)

		###方式二 
		#1.各部门的平均工资
		SELECT AVG(salary),department_id
		FROM employees
		GROUP BY department_id

		#2.求出最低平均工资的部门编号
		SELECT department_id
		FROM employees
		GROUP BY department_id
		ORDER BY AVG(salary)
		LIMIT 1;

		#3.查询部门信息
		SELECT *
		FROM departments
		WHERE department_id = (
			SELECT department_id
			FROM employees
			GROUP BY department_id
			ORDER BY AVG(salary)
			LIMIT 1
		)


	3.查询平均工资最低的部门信息和该部门的平均工资
		#1.各部门的平均工资
		SELECT AVG(salary),department_id
		FROM employees
		GROUP BY department_id
		#2.求出最低平均工资的部门编号
		SELECT AVG(salary),department_id
		FROM employees
		GROUP BY department_id
		ORDER BY AVG(salary)
		LIMIT 1;
		#3.查询部门信息
		SELECT d.*
		FROM departments d
		JOIN (SELECT AVG(salary),department_id
		FROM employees
		GROUP BY department_id
		ORDER BY AVG(salary)
		LIMIT 1) ag_dep ON d.department_id = ag_dep.department_id



	4.查询平均工资最高的job信息
			#1.查询每个job的平均工资
			SELECT AVG(salary),job_id
			FROM employees
			GROUP BY job_id
			ORDER BY AVG(salary) DESC
			LIMIT 1

			#2.查询job信息
SELECT
	*
FROM
	jobs
WHERE
	job_id = (
	SELECT
		job_id
	FROM
		employees
	GROUP BY
		job_id
	ORDER BY
		AVG( salary ) DESC
		LIMIT 1
	)


	5.查询平均工资高于公司平均工资的部门有哪些?
			#1.查询平均工资
			SELECT AVG(salary) FROM employees

			#2.查询每个部门的平均工资
			SELECT AVG(salary),department_id from employees GROUP BY department_id

			#3.筛选2结果集 ,满足平均工资>1
SELECT
	AVG( salary ),
	department_id
FROM
	employees
GROUP BY
	department_id
HAVING
	AVG( salary ) >(
	SELECT
		AVG( salary )
	FROM
		employees
	)

	6.查询处公司中所有manger的详细信息?
				#1.查询所有manger的员工编号
				SELECT DISTINCT manager_id FROM employees
				#2.查询详细信息 ,满足employ_id = #1
				SELECT * FROM employees
				WHERE employee_id = ANY(
				SELECT DISTINCT manager_id from employees
				)


	7.各个部门中 ,最高工资中最低的那个部门的最低工资是多少?
			#1.查询各部门的最高工资Z中最低的
			SELECT department_id FROM employees GROUP BY department_id ORDER BY MAX(salary) LIMIT 1;
			#2.查询1结果的那个部门的最低工资
SELECT
	MIN( salary )
FROM
	employees
WHERE
	department_id = (
	SELECT
		department_id
	FROM
		employees
	GROUP BY
		department_id
	ORDER BY
		MAX( salary )
		LIMIT 1
	)

	8.查询平均工资最高的部门的manger的详细信息 , last_name,department_id,emailm,salary
			#1.查询平均工资最高的部门编号
			SELECT department_id
			FROM employees
			GROUP BY department_id
			ORDER BY AVG(salary) DESC
			LIMIT 1
			#2.将employees和deaprments连接查询 ,筛选条件是1
			SELECT last_name,d.department_id,email,salary
			FROM employees e
			INNER JOIN departments d ON d.manager_id = e.employee_id
			WHERE d.department_id = (
					SELECT department_id
					FROM employees
					GROUP BY department_id
					ORDER BY AVG(salary) DESC
					LIMIT 1
			);


	******5月3号学习*****#END#****

  ******5月4号学习*****START****

	4.查询生日在 "1988-1-1 "后的学生姓名 ,专业名称
	SELECT stuName,majorName
	FROM student s
	JOIN major m
	ON s.majorId = m.majorId
	WHERE DATEDIFF(bor,"1988-1-1")>0

	5.查询每个专业的男生人数和女生人数分别是多少?
	SELECT COUNT(*) 个数,sex,majorId
	FROM student
	GROUP BY sex,majorId

	方式二 
	SELECT majorId,
	(SELECT COUNT(*) FROM student WHERE sex = "男")男,
	(SELECT COUNT(*) FROM student WHERE sex = "女")女
	FROM student
	GROUP BY majorId;

	6.查询专业和张翠山一样的学生的最低分
		1 查询张翠山的专业编号
		SELECT majorId from student WHERE stuName = "张翠山"

		2.查询编号 = 1的所有学生编号
		SELECT studentNo
		FROM student
		WHERE majorId = (
		SELECT mojorId
		FROM student
		WHERE studentName = "张翠山"
		)
		3.查询最低分
SELECT
	MIN( score )
FROM
	result
WHERE
	STUDENTnO IN (
	SELECT
		studentNo
	FROM
		student
	WHERE
	majorId = ( SELECT mojorId FROM student WHERE studentName = "张翠山" ))

	查询哪个专业没有学生 ,分别用左连接和右连接实现
	#左
	SELECT m.mjoerID,m.majorName,s.studno
	FROM major m
	LEFT JOIN student s on m.majorId = s.majorId
	WHERE s.studenNo IS NULL

	#左
	SELECT m.mjoerID,m.majorName,s.studno
	FROM student s
	RIGHT JOIN major m on m.majorId = s.majorId
	WHERE s.studenNo IS NULL

	#进阶9 联合查询 
/**
union : 联合 合并  将多条查询语句的结果合并成一个结果

语法 
查询语句1
UNION
查询语句2
UNION
..

应用场景 
要查询的结果来自于多个表 ,且多个表没有直接的连接关系 ,但查询的信息一致时.

特点 
1.要求多条查询语句的查询列数是一致的
2.要求多条查询语句的查询的每一列的类型和顺序最好一致
3.UNION关键字默认去重 ,如果使用UNION ALL 可以包含重复项

*/

#引入的案例 查询部门编号 > 90或邮箱包含a的员工信息

SELECT * FROM employees WHERE email LIKE '%a%' OR department_id > 90;

SELECT
	*
FROM
	employees
WHERE
	email LIKE '%a%' UNION ALL
SELECT
	*
FROM
	employees
WHERE
	department_id > 90;

	#DML语言 

	/**
	数据操作语言 
	插入 insert
	修改 update
	删除 delete

	*/


	一.插入语言 
	方式一 经典的插入
	/**
	语法 
	INSERT INTO 表名(列名 ,....) VALUES(值1 ,值2 , ,);




	*/

	#1.插入的值的类型要与列的类型一致或兼容
	INSERT INTO beauty(id,name,sex,borndate,phone,photo,boyfriend_id)
	VALUES(13,'唐艺昕','女','1990-4-23','18999112',NULL,2);

	#2.可以为Null的列如何插入值.可以为NULL的列如何插入值？
	#方式1
	INSERT INTO beauty(id,name,sex,borndate,phone,photo,boyfriend_id)
	VALUES(13,'唐艺昕','女','1990-4-23','18999112',NULL,2);

	#方式2 
	INSERT INTO beauty(id,name,sex,borndate,phone,boyfriend_id)
	VALUES(14,'金星','女','1990-4-23','128299112',9);



	#3.列的顺序是否可以调换
	INSERT INTO beauty (name,sex,id,phone)
	VALUES('蒋欣','女' ,16,'110');

	#4.列数和值的个数必须一致
	INSERT INTO beauty (name,sex,id,phone,boyfriend_id)
	VALUES('蒋欣','女' ,17,'110');

	#5.可以省略列名 ,默认所有列 ,而且列的顺序和表中列的顺序一致
	INSERT INTO beauty
	VALUES(18,'张飞','男',NULL,'119',NULL,NULL);

	#方式二 
	/**
	语法 
	INSERT INTO 表名
	SET 列名 = 值,列名 = 值,.......
	*/

	INSERT INTO beauty
	SET id = 19,NAME = '刘涛',phone = '999';

	#两种方式大PK
	1.方式一支持插入多行,方式2不支持
	INSERT INTO beauty VALUES
	(20,'张飞','男',NULL,'119',NULL,NULL),
	(21,'张飞','男',NULL,'119',NULL,NULL),
	(22,'张飞','男',NULL,'119',NULL,NULL);

	2.方式一支持子查询 ,方式二不支持
	INSERT INTO beauty(id,name,phone)
	SELECT 26,'宋茜','1190888';

	INSERT INTO beauty(id,name,phone)
	SELECT id,boyName,'1190888'
	FROM boys
	WHERE id < 3;


	#二.修改语句

	/*
	1.修改单表中的记录
	语法 
	UPDATE 表名
	SET 列 = 新值,列 = 新值,......
	WHERE 筛选条件;

	2.修改多表的记录[补充]
	语法 

	UPDATE 表1 别名,表2 别名
	SET 列 = 值 ,..
	WHERE 连接条件
	and 筛选条件

	sql99语法 
	UPDATE 表1 别名
	inner left right join 表2 别名
	ON 连接条件
	set 列 = 值

	*/

	#1.修改单表的记录
	#案例1 修改beauty表中姓唐的女神的电话为1389999
	UPDATE beauty SET phone = '13882222'
	WHERE name LIKE '唐%';

	#案例2 修改boys表中id号为2的名称为张飞 ,魅力值为10
	UPDATE boys SET boyName = '张飞',userCP = 10
	WHERE id = 2;


	#2.修改多表的记录
	#案例1 修改张无忌的女朋友的手机号为114

	UPDATE boys bo
	INNER JOIN beauty b ON bo.id = b.boyfriend_id
	SET b.phone = '114'
	WHERE bo.boyName = '张无忌';

	#案例2 修改没有男朋友的女神的男朋友编号都是张飞2号
	UPDATE boys bo
	RIGHT JOIN beauty b ON bo.id = b.boyfriend_id
	SET b.boyfriend_id = 2
	WHERE b.id IS NULL;


	#三.删除语句

	/**
	方式1 delete
	语法 
	1.单表的删除
	DELETE FROM 表名 where 筛选条件

	2.多表的删除[补充]
	sql92语法 
	DELETE 表1的别名 ,表2的别名
	FROM 表1 别名 ,表2 别名
	WHERE 连接条件
	AND 筛选条件:

	sql99语法 

	DELETE 表1的别名 ,表2的别名
	FROM 表1 别名
	INNER|LEFT|right JOIN 表2 别名 ON 连接条件
	WHERE 筛选条件



	方式2 TRUNCATE
	语法 TRUNCATE table 表名:

	*/

	#方式一 
	1.单表的删除
	#案例1 删除手机号以9结尾的女神信息
	DELETE FROM beauty WHERE phone LIKE '%9';

	#2.多表的删除

	#案例 删除张无忌的女朋友的信息
	DELETE b
	FROM beauty b
	INNER JOIN boys bo ON b.boyfriend_id = bo.id
	WHERE bo.boyName = '张无忌';

	#删除黄晓明的信息以及他女朋友的信息
	DELETE b,bo
	FROM beauty b
	INNER JOIN boys bo ON b.boyfriend_id = bo.id
	WHERE bo.boyName = "黄晓明";

	#方式二 TRUNCATE 语句 

	#案例 将魅力值> 100的男神信息删除
	TRUNCATE TABLE boys;


	#DELETE pk TRUNCATE
	1.DELETE可以加where条件.TRUNCATE不能加

	2.TRUNCATE 删除.效率高一丢丢
	3.如果要删除的表中有自增长列 ,如果用delete删除后 ,再插入数据 ,自增长列的值从断点开始
	 而truncate删除后 ,再插入数据 ,自增长列的值从1开始.
 4.TRUNCATE删除没有返回值,DELETe 删除有返回值
 5.TRUNCATE删除不能回滚 ,DELETE删除可以回滚.

	 1. 运行以下脚本创建表 my_employees
Create table my_employees(
Id int(10),
First_name varchar(10),
Last_name varchar(10),
Userid varchar(10),
Salary double(10,2) )


create table users(
id int,
userid varchar(10),
department_id int
)
2. 显示表 my_employees 的结构
3. 向 my_employees 表中插入下列数据
ID FIRST_NAME LAST_NAME USERID SALARY
1 patel Ralph Rpatel 895
2 Dancs Betty Bdancs 860
3 Biri Ben Bbiri 1100
4 Newman Chad Cnewman 750
5 Ropeburn Audrey Aropebur 1550

INSERT INTO my_employees(ID FIRST_NAME LAST_NAME USERID SALARY)
VALUE();
4. 向 users 表中插入数据
5. 将 3 号员工的 last_name 修改为 "drelxer "

6. 将所有工资少于 900 的员工的工资修改为 1000

7. 将 userid 为 Bbiri 的 user 表和 my_employees 表的记录全部删除

8. 删除所有数据

9. 检查所作的修正

10. 清空表 my_employees

	#DDL语言 
	/**
	数据定义语言 

	库和表的管理 
	一.库的管理
	创建 ,修改 ,删除

	二.表的管理
	创建 ,修改 ,删除

	创建 create
	修改 alter
	删除 drop


	*/

	#库的管理 
	1.库的创建
	/**
	语法 
	create DATABASE 库名:

	*/

	#案例 创建库Books

	CREATE DATABASE IF NOT EXISTS books;

	#2.库的修改

	RENAME DATABASE books TO 新表名;

	#更改库的字符集

	ALTER DATABASE books CHARACTER SET gbk;

	#3.库的删除

	DROP DATABASE IF EXISTS books;


	#二/表的管理
	#1.表的创建

	CREATE table 表名(列名 列的类型(长度) 约束 ,)
	             表名(列名 列的类型(长度) 约束 ,
	             表名(列名 列的类型(长度) 约束 ,
	             表名(列名 列的类型(长度) 约束 ,
	             表名(列名 列的类型(长度) 约束 ,
	)

#案例 创建表Book

CREATE TABLE book(id INT,#编号
bName VARCHAR(20),#图书名
price DOUBLE,#价格
author VARCHAR(20),#作者编号
publishDate DATETIME#出版日期
);

#案例 创建表author
CREATE TABLE author(
id INT,
au_name VARCHAR(20),
nation VARCHAR(20)
)

DESC author;

#2.表的修改

/**
alter table 表名 add|drop|CHANGE|MODIFY COLUMN 列名 [列类型 约束]
*/
	#1.修改列名
	ALTER TABLE book CHANGE COLUMN publishDate pubDate DATETIME;

	#2.修改列的类型或约束
ALTER TABLE book MODIFY COLUMN pubDate TIMESTAMP;
	#3.添加新列
ALTER TABLE author ADD COLUMN annual DOUBLE;
	#4.删除列
ALTER TABLE author DROP COLUMN annual;
	#5.修改表名

ALTER TABLE author RENAME TO book_author;

#3.表的删除:

drop TABLE 	IF EXISTS book_author;


	SHOW TABLES;

通用的写法 
DROP DATABASE IF EXISTS 旧库名;
CREATE DATABASE 新库名;


DROP TABLE IF EXISTS 旧表名 
CREATE TABLE 表名();
#4.表的复制:
INSERT INTO author VALUES(1, '村上春树','日本'),
(2,'莫言','中国'),(3,'冯庸','中国'),(4,'金庸','中国');


#1.仅仅赋值表的结构

CREATE TABLE copy like author;

#2.赋值表的结构+数据
CREATE TABLE copy2 	SELECT * FROM author;

#3.只复制部分数据 
CREATE TABLE copy3
SELECT id,au_name
FROM author
where nation = "中国";


#仅仅复制某些字段
CREATE TABLE copy4
SELECT id,au_name
FROM author
WHERE 0;

测 试
1. 创建表 dept1
name Null? type
id int(7)
name varchar(25)
2. 将表 departments 中的数据插入新表 dept2 中
3. 创建表 emp5
name Null? type
id int(7)
First_name Varchar (25)
Last_name Varchar(25)
Dept_id int(7)
4. 将列 Last_name 的长度增加到 50
5. 根据表 employees 创建 employees2
6. 删除表 emp5
7. 将表 employees2 重命名为 emp5 8 在表 dept 和 emp5 中添加新列 test_column ,并检查所作的操作
9.直接删除表 emp5 中的列 dept_id


#常见的数据类型 
/**
数值型 
整型 ,
小数 
		定点数
		浮点数
字符型 
		较短的文本 char VARCHAR
		较长的文本 text /blob(较长的二进制数据)
日期型 

*/

#一.整型 
/**
分类 
TINYINT,SMALLINT,MEDIUMINT,Int/INTEGER,BIGINT
1        2        3         4           8
特点 
1.如果不设置无符号还是有符号 ,默认是有符号 ,如果设置无符号 ,需要添加unsigned关键字
2.如果插入的数值超出了整型的范围 ,会报异常 ,插入的是临界值
3.如果不设置长度 ,会有默认的长度
4.长度代表的意思为显示的最大宽度 ,如果不够会用0在左边填充 ,但必须用zeroFill搭配使用.

*/
#1.如何设置无符号和有符号
CREATE TABLE tab_int(
					t1 INT,
					t2 INT UNSIGNED
);

#二.小数

/*
分类 
1.浮点型 
	float (M,D)
	DOUBLE(M,D)
2.定点型
DEC(M,D)
DECIMAL(M,D)
特点 
1.M和D
M:整数部位+小数部位
D:小数部位
如果超出范围 ,则插入临界值
2.M,D都可以省略
如果是decimalm,则M默认为10 ,D默认为0
如果是float和double,则会根据插入的数据的精度来决定精度
3.定点型的精度较高 ,如果要求插入的数值的精度较高 ,如货币运算等考虑使用

*/
CREATE TABLE tab_float(
f1 FLOAT(5,2),
f2 DOUBLE(5,2),
f3 DECIMAL(5,2)
);

SELECT * FROM tab_float;

#原则 
/*
所选择的类型越简单越好 ,能保存数值的类型越小越好.
*/

  ******5月4号学习*****END****








