/*
输入描述:
输入两个正整数A和B。
输出描述:
输出A和B的最小公倍数。
 */
import java.util.Scanner;
/*
1.两个数的乘积等于这两个数的最大公约数与最小公倍数的积
2.先求最大公约数fun（辗转相除法）
3.a*b的积取除以fun
 */
public class one {
    public static int func(int a,int b){
        if(b==0){
            return a;
        }
        return func(b,a%b);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int fun=func(a,b);
        System.out.println(a*b/fun);
    }
}
