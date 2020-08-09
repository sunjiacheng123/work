import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/ae759916631f4711a90c4d4d9657f4b0
 */
public class One {
    public static int func(int n){
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.print(func(n)+" ");
            System.out.println(func(n*n));
        }
    }
}
