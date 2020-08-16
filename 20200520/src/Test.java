/*
一般是客户端先向服务器发送请求：
第一次握手发送一个序列号；
第二次握手的序列号是单独发送的，第二次握手的确认号是第一次握手序列号+1；
第三次握手的序列号是第二次握手的确认号，第三次握手的确认号是是第二次握手的序列号+1；

Ping 命令是通过向计算机发送 ICMP 应答报文并且监听回应报文的返回，以校验与远程计算机或本地计算机的连接。

当一个IP数据报封装成链路层的帧时，此数据报的总长度（即报头区加上数据部分）一定不能超过下层的数据链路层的MTU值，否则无法传输。
 因此，我们需要对IP包进行分片，其中IP数据报的首部中，和IP数据包分片有关的字段为——总长度、标识、标志以及位偏移.分片由网络层的路由器完成
目的主机收到所有分片后，对分片进行重新组装还原的过程叫做IP数据报重组。IP协议规定，
只有最终的目的主机才可以对分片进行重组。目的主机接收到所有的数据包的分包之后，
根据数据包首部中保存的信息，还原最初的数据包。这就是数据包的重组过程。

1xx（临时响应）
2xx（成功）
3xx（已重定向）
    301 永久重定向
    302 临时重定向
4xx（请求错误）
    404 找不到网页
    403 已禁止
    401 未授权
    400 请求失败；服务器不理解请求语法

数据链路层层：差错控制
网络层：网络互连、路由选择、拥塞控制，通过寻址建立节点间连接
传输层：流量控制
 */
public class Test {
}
