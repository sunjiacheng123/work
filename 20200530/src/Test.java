/*
以下哪一句从表TABLE_NAME中提取前10条记录?
Sql server: select TOP N * from table_name.
 MySQL: select * from table_name limit 0,10;
 Oracle: select * from table_name where rownum＜=10

"_"匹配任何单个字符
"%"匹配任意数目字符（包括零个字符）
"*"匹配0个或多个在它前面的字符
"[]"匹配在方括号中的任意一个字符

RDBMS 是SQL 的基础，同样也是所有现代数据库系统的基础，比如MS SQL Server,
IBM DB2, Oracle, MySQL 以及Microsoft Access。而hadoop是分布式数据库
 */
public class Test {
}
