/*
alter 是针对表整体，modify是对表中的某一项字段进行修改。
1、增加字段：ALTER TABLE 表名 ADD 字段名 字段类型；
2、删除字段：ALTER TABLE 表名 DROP COLUMN 字段列名；
3、增加约束：ALTER TABLE 表名 ADD CHECK(字段名<>'')或者 ALTER TABLE 表名 ADD CONSTRAINT 约束名 UNIQUE(字段名)；
4、删除约束：ALTER TABLE 表名 DROP CONSTRAINT 约束名；
5、修改字段缺省值：ALTER TABLE 表名 ALTER COLUMN 字段名 SET DEFAULT 默认值；
6、 修改字段数据类型：ALTER TABLE 表名 ALTER COLUMN 字段名TYPE l类型；
7、重命名字段：ALTER TABLE 表名 RENAME COLUMN 旧字段名TO 新字段名；
8、重命名表：ALTER TABLE 表名 RENAME TO 新表名。


Select语句完整的执行顺序： 1、from子句组装来自不同数据源的数据；
2、where子句基于指定的条件对记录行进行筛选； 3、group by子句将数据划分为多个分组；
4、使用聚集函数进行计算； 5、使用having子句筛选分组； 6、计算所有的表达式；
7、使用order by对结果集进行排序。 8、select 集合输出。
查询中用到的关键词主要包含六个，并且他们的顺序依次为  select--from--where--group by--having--order by
其中select和from是必须的，其他关键词是可选的，
这六个关键词的执行顺序  与sql语句的书写顺序并不是一样的，
而是按照下面的顺序来执行  from--where--group by--having--select--order by,
from:需要从哪个数据表检索数据  where:过滤表中数据的条件
group by:如何将上面过滤出的数据分组  having:对上面已经分组的数据进行过滤的条件
select:查看结果集中的哪个列，或列的计算结果
order by :按照什么样的顺序来查看返回的数据
2.from后面的表关联，是自右向左解析的  而where条件的解析顺序是自下而上的。
也就是说，在写SQL文的时候，尽量把数据量大的表放在最右边来进行关联，
而把能筛选出大量数据的条件放在where语句的最下面。
where 最先执行，然后按group by分组，之后满足having条件的组被留下，执行select筛选。

DATEADD() 函数在日期中添加或减去指定的时间间隔。
语法
DATEADD(datepart,number,date)
    datapart参数的取值范围是{yy/yyyy,qq/q,mm/m,dy/y,dd/d,wk/ww,dw/w,hh,mi/n,ss/s,ms,mcs,ns}
    number 是您希望添加的间隔数
    date 参数是合法的日期表达式

between and 查询数字是包含左右边界，查询日期时不包含右边界；
interval(n,n1,n2)是比较函数，返回比n大的位置
interval也可以用来处理时间
 */
public class Test {

}
