import javafx.concurrent.Worker;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.HashMap;
/*
ArrayList list=new ArrayList(); 这种是默认创建大小为10的数组，每次扩容大小为1.5倍
ArrayList list=new ArrayList(20); 这种是指定数组大小的创建，创建时直接分配其大小，没有扩充。
所以，扩充为0次

相应的调用t.run()，只是调用一个实例的方法而已，并未启动线程，因此run()会被立即执行
 run()相当于线程的任务处理逻辑的入口方法
 start()的作用是启动相应的线程

A，CopyOnWriteArrayList适用于写少读多的并发场景
B，ReadWriteLock即为读写锁，他要求写与写之间互斥，读与写之间互斥，
   读与读之间可以并发执行。在读多写少的情况下可以提高效率
C，ConcurrentHashMap是同步的HashMap，读写都加锁
D，volatile只保证多线程操作的可见性，不保证原子性
 */

public class Test {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put("name",null);
        map.put("12","jack");
        System.out.println(map.size());
    }

    public static void main0(String[] args) {
        Thread t=new Thread(){
            public void run(){
                pong();
            }
        };
        t.run();
        System.out.println("ping");
    }
    static void pong(){
        System.out.println("pong");
    }
}
