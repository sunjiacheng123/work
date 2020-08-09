import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/069e2130430c41229ab25e47fa0949a6
 */
public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        while (sc.hasNext()){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            int i=0;
            for(i=0;i<n;i++){
                if(a[i]==x){
                    System.out.println(i);
                }
            }
            if(i==n){
                System.out.println(-1);
            }
        }
    }
}
