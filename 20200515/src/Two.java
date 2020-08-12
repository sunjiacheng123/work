import java.util.Scanner;

/*
进制转换博客：https://www.cnblogs.com/sunshinezhgx/p/6115569.html

 */
public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(Integer.valueOf(s.substring(2),16).toString());
        }
    }
}
