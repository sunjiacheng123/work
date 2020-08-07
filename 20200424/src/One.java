import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/fe6c73cb899c4fe1bdd773f8d3b42c3d
 */
public class One {
    public static int fun(int a,int b){
        if(a<b){
            int tmp=a;
            a=b;
            b=tmp;
        }
        while(a%b!=0){
            int tmp=a%b;
            a=b;
            b=tmp;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int[] cur=new int[n];
            for(int i=0;i<n;i++){
                cur[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(a>=cur[i]){
                    a=a+cur[i];
                }else {
                    a=a+fun(a,cur[i]);
                }
            }
            System.out.println(a);
        }
    }
}
