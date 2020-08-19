import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/119bcca3befb405fbe58abe9c532eb29
 */
public class Two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] A = str.split(";");
            int x = 0, y = 0;
            for (String string : A) {
                //https://blog.csdn.net/victoryckl/article/details/6930409
                //matches的用法
                if (string.charAt(0) == 'D' && string.substring(1).matches("[0-9]+"))
                    x += Integer.parseInt(string.substring(1));

                if (string.charAt(0) == 'W' && string.substring(1).matches("[0-9]+"))
                    y += Integer.parseInt(string.substring(1));

                if (string.charAt(0) == 'S' && string.substring(1).matches("[0-9]+"))
                    y -= Integer.parseInt(string.substring(1));

                if (string.charAt(0) == 'A' && string.substring(1).matches("[0-9]+"))
                    x -= Integer.parseInt(string.substring(1));

            }
            System.out.println(x + "," + y);
        }
    }
}
