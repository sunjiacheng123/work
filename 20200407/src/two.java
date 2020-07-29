import java.util.Scanner;
/*
 输入一个整数，将这个整数以字符串的形式逆序输出
程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，
如输入为100，则输出为001
 */
public class two {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s1=in.nextLine();
        StringBuffer s2=new StringBuffer(s1);
        s2.reverse();
        System.out.println(s2);

    }
}
