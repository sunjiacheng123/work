/*
先复习一下,类方法（static方法）
在类方法中，不能引用实例变量
不能使用super、this关键字
不能调用类方法

不考虑访问修饰符的话，
实例方法可以通过super.方法名，对象名.方法名调用父类的实例方法
实例方法可以通过类名.方法名，super.方法名调用父类的静态方法
实例方法通过this.方法名调用本类的其他方法
本类的静态方法还可以用类名.方法名调用。
在本题中，如果是私有的，ABC都不能访问   所以选D

二、java中super关键字
1.在子类构造器中显示调用父类构造器（super必须出现在子类构造器的第一行）
2..可以在子类中充当临时父类对象，super.方法名调用父类的方法


三、java中this关键字
1.代表当前对象，指向成员变量和成员方法
2.指向某个构造方法，通过this调用其他构造方法。
this();//代表无参构造方法
 */


/*
读入一个字符串str，输出字符串str中的连续最长的数字串
输入描述: 个测试输入包含1个测试用例，一个字符串str，长度不超过255。
输出描述: 在一行内输出str中里连续最长的数字串。
示例1 输入 abcd12345ed125ss123456789 输出 123456789

 */
import java.util.Scanner;

public class one {
//    public static String Sum(String s){
//        char[] tmp = {0};
//        int max=0;
//        String end=null;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
//                tmp[0]=s.charAt(i);
//                String cur=new String(tmp);
//                while(i+1<s.length() && s.charAt(i+1)>='0' && s.charAt(i+1)<='9'){
//                    i++;
//                    cur+=s.charAt(i);
//                }
//                if(cur.length()>=max){
//                    end=cur;
//                }
//            }
//        }
//        return end;
//    }


    //字符串中找出连续最长的数字串

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            //while(scanner.hasNext()){
                String str= scanner.nextLine();
                int max=0;int count=0;int end=0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i)>='0'&&str.charAt(i)<='9') {
                        count++;
                        if(max<count){
                            max=count;
                            end=i;
                        }
                    }
                    else{
                        count=0;
                    }
                }
                System.out.println(str.substring(end-max+1,end+1));
            //}
        }

}
