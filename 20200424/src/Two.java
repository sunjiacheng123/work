import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/3897c2bcc87943ed98d8e0b9e18c4666
 */
public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] cur=new int[n];
            for(int i=0;i<n;i++){
                cur[i]=sc.nextInt();
            }
            for(int i=0;sc.hasNext() && i<m;i++){
                String cs=sc.next();
                int a=sc.nextInt();
                int b=sc.nextInt();
                if("Q".equals(cs)){
                    int max=0;
                    if(a>b){
                        int tmp=a;
                        a=b;
                        b=tmp;
                    }
                    for(int j=a-1;j<=b-1;j++){
                        if(cur[j]>max){
                            max=cur[j];
                        }
                    }
                    System.out.println(max);
                }else if("U".equals(cs)){
                    cur[a-1]=b;
                }
            }

        }
    }
}
