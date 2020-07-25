/*
删除公共字符串：
小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋
和8个每袋的包装(包装不可拆分)。可是小易现在只想购买恰好n个苹
果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小
易将不会购买。
 */

import java.util.Scanner;

public class two {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String pattern = "[" + s2 + "]";
            //replaceAll方法传入的第一个参数是正则表达式，
            // 字符串形式的正则表达式是[abcd...]，所以加[]
            String result = s1.replaceAll(pattern, "");
            System.out.println(result);
        }
    }
}
