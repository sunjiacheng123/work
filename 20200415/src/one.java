
/*
https://www.nowcoder.com/questionTerminal/5a0a2c7e431e4fbbbb1ff32ac6e8dfa0
 */
import java.util.Scanner;

/*


 */
public class one {
    public static int[] func(int[] num,int len){
        int[] sum=new int[num.length];
        int j=0;
        for(int i=0;i<sum.length;i++){
            sum[i++]=num[j];
            sum[i]=num[j+len];
            j++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            while(n>0){
                int len=sc.nextInt();
                int k=sc.nextInt();
                int[] num=new int[len*2];
                for(int i=0;i<len*2;i++){
                    num[i]=sc.nextInt();
                }
                for(int i=0;i<k;i++){
                    num=func(num,len);
                }

                for(int i=0;i<len*2;i++){
                    if(n==1 && i==len*2-1){
                        System.out.print(num[i]);
                    }else{
                        System.out.print(num[i]+" ");
                    }
                }
                System.out.println();
                n--;
            }
        }

    }

    public static void main0(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = sc.nextInt();
        while (groups-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] res = new int[2*n];
            for(int i=0;i<2*n;i++){
                int tmp = i + 1;
                for(int j = 0; j < k;j++){
                    if (tmp <= n) tmp = 2*tmp - 1;
                    else tmp = 2 * (tmp - n);
                }
                res[tmp - 1]=sc.nextInt();
            }
            //输出
            if(res.length> 0) System.out.print(res[0]);
            for(int i = 1;i< 2*n;i++){
                System.out.print(" "+res[i]);
            }
            System.out.println();
        }
    }
}
