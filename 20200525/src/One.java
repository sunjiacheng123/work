import java.util.Scanner;
/*
驼峰命名法：
从C/C++转到Java的程序员，一开始最 不习惯的就是变量命名方式的改
变。C语言风格使用下划线分隔多个单词，例如"hello_ _world"; 而Java则
采用一种叫骆驼命名法的规则:除首个单词以外，所有单词的首字母大
例收"helloWorld"

 */
public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            while (s.contains("-")){
                int index=s.indexOf("-");
                s=s.substring(0,index)+(char)(s.charAt(index+1)-32)+s.substring(index+2);
            }
            System.out.println(s);
        }
    }
}
