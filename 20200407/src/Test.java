public class Test {

    public static void main(String[] args) {
        String s="sadd";
        StringBuffer s1=new StringBuffer();
        s1.append(s);
        System.out.println(s1);
        //s.toUpperCase();
        System.out.println(s);
    }

    private static void test(){
        System.out.println("test");
    }

    public static void main2(String[] args) {
        ((Test)null).test();
    }

    public static void main1(String[] args) {
        Employee e=new Employee("123");
        System.out.println(e.ID);
    }
}
class Employee {
    String ID="0000";
    public Employee(String id){
        ID=id;
    }
}