import java.util.Scanner;
/*
replaceAll:第一个参数为正则表达式：
https://www.nowcoder.com/questionTerminal/f0db4c36573d459cae44ac90b90c6212
 */

public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            String cur="["+s2+"]";
            String result=s1.replaceAll(s2,"");
            System.out.println(result);
        }
    }
}
