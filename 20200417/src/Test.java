/*
finalize的作用:
finalize()是Object的protected方法，子类可以覆盖该方法以实现资源清理工作，GC在回收对象之前调用该方法。
finalize()与C++中的析构函数不是对应的。C++中的析构函数调用的时机是确定的（对象离开作用域或delete掉），但Java中的finalize的调用具有不确定性
不建议用finalize方法完成“非内存资源”的清理工作，但建议用于：
① 清理本地对象(通过JNI创建的对象)；
② 作为确保某些非内存资源(如Socket、文件等)释放的一个补充：在finalize方法中显式调用其他资源释放方法。
 */
public class Test {
    public static void main(String[] args) {
        Integer i01=59;
        int i02=59;
        Integer i03=Integer.valueOf(59);
        Integer i04=new Integer(59);
        System.out.println(i02==i04);
        System.out.println(i01==i03);
        System.out.println(i01==i02);
        System.out.println(i03==i04);
    }
}
