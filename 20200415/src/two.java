import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/987123efea5f43709f31ad79a318ca69
 */
public class two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int count=0;
            int n=sc.nextInt();
            int[] num=new int[n];
            for (int i=0;i<n;i++){
                num[i]=sc.nextInt();
            }
            int cur=sc.nextInt();
            for(int i=0;i<n;i++){
                if(num[i]>cur){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
