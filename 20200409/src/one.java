import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.util.Scanner;

/*

给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)，
请编写程序统计每种不同的个位数字出现的次数。
例如：给定N = 100311，则有2个0，3个1，和1个3。

输入描述:
每个输入包含1个测试用例，即一个不超过1000位的正整数N。

输出描述:
对N中每一种不同的个位数字，以D:M的格式在一行中输出
该位数字D及其在N中出现的次数M。要求按D的升序输出。

 */
public class one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            //题目要求输入不超过1000位的正整数
            //接收成int型的会超出范围，所以改用成string
            String n = sc.next();
            //int n=sc.nextInt();
            int[] a=new int[10];
            for(int i=0;i<n.length();i++){
                //将字符'0'-'9'转换为数字：只需将字符变量减去'0'就行了。
                a[n.charAt(i)-'0']++;
            }
//            while(n>0){
//                a[n%10]++;
//                n=n/10;
//            }
            for(int i=0;i<10;i++){
                if(a[i]!=0){
                    System.out.println(i+":"+a[i]);
                }
            }
        }

    }
}
