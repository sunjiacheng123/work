import java.util.Scanner;
/*
输入描述:
每个输入包含1个测试用例。每个测试用例在一行中给出10个非负整数，顺序表示我们拥有数字0、数字1、……数字9的个数。整数间用一个空
格分隔。10个数字的总个数不超过50，且至少拥有1个非0的数字。
输出描述:
在一行中输出能够组成的最小的数。
示例1
输入
2 2 0 0 0 3 0 0 1 0
输出
10015558
 */
public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int[] a=new int[10];
        while (sc.hasNextInt()){
            a[i]=sc.nextInt();
            i++;
        }
        String str="";
        for(i=1;i<10;i++){
            if(a[i]!=0){
                a[i]--;
                str=str+String.valueOf(i);
                break;
            }
        }
        for (i=0;i<10;i++){
            for(int j=0;j<a[i];j++){
                str=str+String.valueOf(i);
            }
        }
        System.out.println(str);
    }


}
