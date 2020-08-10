import java.util.Scanner;
/*
toBinaryString（int i）方法，此方法返回int变量的二进制表示的字符串。
toHexString（int i）方法和toOctalString（int i）方法来分别返回int变量的16进制表示和8进制表示字符串。
 Integer.parseInt(s)的作用就是把字符串s解析成有符号的int基本类型。

tring.format("%07d",Integer.parseInt(s1));数字前面补0(加密常用)补足7位
 */
public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.next();
            char[] array=s.toCharArray();
            for(int i=0;i<array.length;i++){
                String s1=Integer.toBinaryString(array[i]);
                //System.out.println(s1);
                String s2=String.format("%07d",Integer.parseInt(s1));
                int count=0;
                for(int j=0;j<7;j++){
                    if(s2.charAt(j)=='1'){
                        count++;
                    }
                }
                if(count%2==0){
                    System.out.println('1'+s2);
                }else {
                    System.out.println('0'+s2);
                }
            }

        }
    }
}
