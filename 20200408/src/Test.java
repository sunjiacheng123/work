import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

import java.security.PublicKey;

/*


成员变量（方法之外，类的内部）：存放于堆区的对象里面，有垃圾回收器回收；
局部变量（方法块内部）：存放于栈区，随方法的消失而消失。
Test test = new Test(); test是对象的引用，存放于栈区，而 new Test()存放于堆区；
public Data(int a,int b,int c){},其中a,b,c为形参，
为局部变量存放于栈区，当Data方法执行完毕之后，a,b,c就会从栈区中移除。
有static,所以为静态区

finally 执行的时机是在方法返回之前(try 或者 catch 中如果有 return
会在这个 return 之前执行 finally). 但是如果finally 中也存在 return 语句,
那么就会执行 finally 中的 return, 从而不会执行到 try 中原有的 return.

native主要用于方法上
1、一个native方法就是一个Java调用非Java代码的接口。一个native方法是指该方法的实现由非Java语言实现，比如用C或C++实现。
2、在定义一个native方法时，并不提供实现体（比较像定义一个Java Interface），因为其实现体是由非Java语言在外面实现的。

 */
public class Test {
    public static void main0(String[] args) {
        byte b1=1,b2=2,b3,b6;
        final byte b4=4,b5=5;
        String se=new String();
        b6=b4+b5;
        //b3=(b1+b2);//(b1+b2)变成了整形？
        System.out.println(b1);
    }

    public final static native int w();
    abstract double d;

    public static void main(String[] args) {

        Object o=new Object(){
            @Override
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(o.equals("fda"));
    }
}
