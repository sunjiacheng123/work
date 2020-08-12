/*
DOS攻击：发送无效的请求，使得正确的请求无法被响应

将一个C类网络划分20个子网，最适合的子网掩码是多少（）
答案很明显是  B： 255.255.255.248
首先    2^4<20<2^5
所以至少需要5位来表示网络号（向主机号借5位），
也就是说子网掩码部分应该是 11111111 11111111 11111111 11111000
也就是255.255.255.248

 DNS是域名解析协议
IP地址转换成MAC地址是ARP协议的作用

http状态码：
304未修改（表示客户机缓存的版本是最新的，客户机应该继续使用它。）
404找不到改页面
302暂时重定向
400代表客户端发起的请求不符合服务器对请求的某些限制，或者请求本身存在一定的错误。

路由信息是由{目的主机所在的网络地址，下一跳地址，子网掩码}组成

1.DNS解析的设置文件在： /etc/resolv.conf
2.邮件服务的设置文件： /etc/mail.rc
3.DHCP的设置文件： /etc/dhcpd.conf
4.网络路由的设置文件： /etc/gateways

状态码分为5类，如下：
    1××(“继续努力”) => 表示接收到请求并且继续处理
    2××（“开心”） => 表示动作被成功接收、理解和接受
    3××（“又要跑一趟”） => 为了完成指定的动作，必须接受进一步处理
    4××（“自己的问题自己解决”） => 客户端发生错误，请求中包含错误语法，请求不能被正确执行
    5××（“服务不到位”） => 服务端出现错误，服务器不能正确地执行请求。
常见的状态码：
    200 => 表明该请求被成功地完成，所请求的资源发送回了客户端
    301 => 永久转移
    304 => 服务端文件未做修改，客户端利用本地的缓存文件即可
    403 => 禁止访问
    404 => 请求的资源不存在（eg: 输错了网址、资源被删除）
    503 => 服务器暂时无法提供服务。
 */
public class Test {
}
