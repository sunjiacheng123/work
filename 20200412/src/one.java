import java.util.Scanner;
/*
跟奥巴马一起编程:
输入描述:
输入在一行中给出正方形边长N（3<=N<=20）和组成正方形边的某种字符C，间隔一个空格。
输出描述:
输出由给定字符C画出的正方形。但是注意到行间距比列间距大，所以为了让结果看上去更像正方形，我们输出的行数实际上是列数的50%
（四舍五入取整）。
示例1
输入
10 a
输出
aaaaaaaaaa
a        a
a        a
a        a
aaaaaaaaaa
 */
public class one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int cur=n/2;
        if(n%2!=0){
            cur=n/2+1;
        }
        if(cur==2){
            for(int i=0;i<n;i++){
                System.out.print(str);
            }
            System.out.println();
            for(int i=0;i<n;i++){
                System.out.print(str);
            }
        }else{
            for(int i=0;i<n;i++){
                System.out.print(str);
            }
            System.out.println();
            for(int i=0;i<cur-2;i++){
                System.out.print(str);
                for(int j=0;j<n-2;j++){
                    System.out.print(" ");
                }
                System.out.print(str);
                System.out.println();
            }
            for(int i=0;i<n;i++){
                System.out.print(str);
            }
        }
    }
}
