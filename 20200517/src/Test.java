import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
https://www.nowcoder.com/questionTerminal/d7c1ff50fab44443b61903eccd791f1d?orderByHotValue=0&mutiTagIds=643_604&page=2&onlyReference=false

子网掩码前面全是1,后面为0,必须是连续的
 224是1 1 1 0 0 0 0 0 0 可行
 240是1 1 1 1 0 0 0 0 0 可行
 248是1 1 1 1 1 1 0 0 0 可行
 250是1 1 1 1 1 1 0 1 0 不可行

 子网掩码写成二进制形式则为：1111 1111 1111 1111 1111 1111 1111 11110 0000 0000；
 可用地址为2^9=512；但是要减去全0和全1，并且要减去一个网关设备，所以512-3=509.

1、因为ping的话 后面跟的是地址，所以要先将域名转换为ip地址，即用到了DNS
2、获取到ip地址后，在数据链路层是根据MAC地址传输的，所以要用到ARP解析服务，获取到MAC地址
3、ping功能是测试另一台主机是否可达，程序发送一份ICMP回显请求给目标主机，并等待返回ICMP回显应答，（ICMP主要是用于ip主机、路由器之间传递控制信息，控制信息是指网络通不通，主机是否科大）
4、TCP的话，不涉及数据传输，不会用到
 */
public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        List<String> all=  new ArrayList<String>() ;	//
        all.add("hello") ;
        all.add("_") ;
        all.add("world") ;
        Iterator<String> iterator = all.iterator() ;	// 为Iterator接口实例化
        while(iterator.hasNext())	// 判断是否有内容
            sb.append(iterator.next() + ",");
//        if (sb.length() > 0)
//                sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
