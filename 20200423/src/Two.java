/*
https://www.nowcoder.com/questionTerminal/473c219f9e4d4ab2851ed388895a9c86
 */
import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        //保留1位小数
        double d1 = 3.02545646;
        System.out.println(d1);
        //利用字符串格式化的方式实现 四舍五入,保留1位小数
        String str1 = String.format("%.1f",d1);// 1代表小数点后面的位数, 不足补0 . f代表,后面的数据d1是浮点类型
        System.out.println(str1);
    }

    public static void main0(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int n=sc.nextInt();
            int A1=0,A2=0,A3=0,A5=0;
            double A4=0;
            int[] lis=new int[n];
            for(int i=0;i<n;i++){
                lis[i]=sc.nextInt();
            }
            int num=1;
            int sum=0;
            for(int i=0;i<n;i++){
                if(lis[i]%5==0 && lis[i]%2==0){
                    A1=A1+lis[i];
                }
                if(num%2==1 && lis[i]%5==1){
                    num++;
                    A2=A2+lis[i];
                }else if(num%2==0 && lis[i]%5==1){
                    num++;
                    A2=A2-lis[i];
                }
                if(lis[i]%5==2){
                    A3++;
                }
                if(lis[i]%5==3){
                    A4=A4+lis[i];
                    sum++;
                }
                if(lis[i]%5==4){
                    if(lis[i]>A5){
                        A5=lis[i];
                    }
                }
            }
            if(A1==0){
                System.out.print("N"+" ");
            }else{
                System.out.print(A1+" ");
            }
            if(A2==0){
                System.out.print("N"+" ");
            }else{
                System.out.print(A2+" ");
            }
            if(A3==0){
                System.out.print("N"+" ");
            }else{
                System.out.print(A3+" ");
            }
            if(A4==0){
                System.out.print("N"+" ");
            }else{
                System.out.print(new BigDecimal(A4/sum).setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue()+" ");
            }
            if(A5==0){
                System.out.print("N");
            }else{
                System.out.print(A5);
            }

            //System.out.println(A1+" "+A2+" "+A3+" "+new BigDecimal(A4/sum).setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue()+" "+A5);
        }
    }
}
