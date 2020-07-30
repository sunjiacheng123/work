import java.util.Scanner;
/*
验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
例如：
1^3=1
2^3=3+5
3^3=7+9+11
4^3=13+15+17+19
输入描述:
输入一个int整数
输出描述:
输出分解后的string
示例1
输入
6
输出
31+33+35+37+39+41
 */
public class Twom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int n=sc.nextInt();
            String str="";
            int x=n*(n-1)+1;
            for(int i=0;i<n;i++){
                str=str+String.valueOf(x)+'+';
                x=x+2;
            }
            System.out.println(str.substring(0,str.length()-1));
        }

    }
}
