import java.util.Scanner;

/*
输入一个正整数n,求n!(即阶乘)末尾有多少个0？
 比如: n = 10; n! = 3628800,所以答案为2
 */
public class one {
    public static int func(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n*func(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=5;i<=n;i++){
            int cur=i;
            while(cur%5==0){
                sum++;
                cur=cur/5;
            }
        }
        System.out.println(sum);
    }
    public static void main0(String[] args) {
        Scanner in =new Scanner(System.in);

            int a=in.nextInt();
            if(a<0){
                return;
            }

            if(a>=1 && a<=1000){
                int sum=func(a);
                int n=0;
                System.out.println(sum);
                while (sum!=0){
                    if(sum%10==0){
                        n++;
                        sum=sum/10;
                    }else{
                        break;
                    }
                }
                System.out.println(n);
            }


    }
}
