class Asdd{
    private int count;
    Asdd(int a){
        count=a;
    }
}
public class Test {
    private int count;
    public static void main(String[] args){
        Asdd a=new Asdd(33);
        System.out.println(a.count);
        Test t=new Test(88);
        System.out.println(t.count);
    }
    Test(int a){
        count=a;
    }
}
