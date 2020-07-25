/*
在结构化程序设计方法中，三种基本结构是:顺序、选择、循环
 */


/*
买苹果：
输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。 例
如，输入"They are students."和"aeiou",则删除之后的第一个字符串变
成"Thy r stdnts.'
 */

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int num=0;
        if(a<6){
            System.out.println(-1);
            return;
        }
        if(a==6){
            System.out.println(1);
            return;
        }
        if (a%2==1){
            System.out.println(-1);
        }else if(a%8==0){
            System.out.println(a/8);
        }else if(a<16){
            if(a==12 || a==14){
                System.out.println(2);
            }else{
                System.out.println(-1);
            }
        }else{
            System.out.println(a/8+1);
        }
    }
}
