import java.util.Scanner;
/*
请设计一个算法完成两个超长正整数的加法。
输入描述:
输入两个字符串数字
输出描述:
输出相加后的结果，string型
示例1
输入
99999999999999999999999999999999999999999999999999
1
输出
100000000000000000000000000000000000000000000000000
 */


public class Two {
    /*
    把这两个字符串
    5412365768
    214125
    补成
    05412365768
    00000214125
    设置一个进位标志int t
    从后往前逐个往前判断
    每一个对应位的整数相加+标志位t是否大于10
    >10的话    -10加到一个新的string里，把标志位设为1
    <10的话     直接加到一个新的string里，把标志位设为0
    最后把string倒过来，减去开头（为0的话）
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String addend=sc.next();
            String augend=sc.next();
            while (addend.length()!=augend.length()) {
                if (addend.length() > augend.length()) {
                    augend = "0" + augend;
                } else {
                    addend = "0" + addend;
                }
            }
            augend = "0" + augend;
            addend = "0" + addend;
            int t=0;
            String str="";
            for(int i=augend.length()-1;i>=0;i--){
                int x=(addend.charAt(i)-'0')+(augend.charAt(i)-'0')+t;
                if(x>9){
                    t=1;
                    str=str+String.valueOf(x-10);
                }else {
                    t=0;
                    str=str+String.valueOf(x);
                }
            }
            StringBuffer sb=new StringBuffer(str);
            str=sb.reverse().toString();
            if(str.charAt(0)=='0'){

                System.out.println(str.substring(1));;
            }else{
                System.out.println(str);;
            }

        }

    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String xString = sc.nextLine();
            String yString = sc.nextLine();
            while (xString.length() != yString.length())
            {
                if (xString.length() < yString.length())
                    xString = "0" + xString;
                else
                    yString = "0" + yString;
            }
            xString = "0" + xString;
            yString = "0" + yString;
            int len1 = xString.length() - 1;
            int len2 = yString.length() - 1;
            String result = "";
            int t = 0;
            while (len1 != -1 && len2 != -1) {
                int x = (xString.charAt(len1) - '0') + (yString.charAt(len2) - '0') + t;
                if (x > 9) {
                    result += String.valueOf(x - 10);
                     t = 1;
                } else {
                    result += String.valueOf(x);
                    t = 0;
                }
                len1--;
                len2--;
            }
            StringBuffer sb = new StringBuffer(result);
            result=sb.reverse().toString();
            if(result.charAt(0)=='0')
                System.out.println(result.substring(1));
            else
                System.out.println(result);
        }
    }
}
