public class test {
    private static int x=100;
    public static int fun(){
        x++;
        return x;
    }

    public static void main(String[] args) {
        test t=new test();
        t.x++;
        System.out.println(x);
    }
}
