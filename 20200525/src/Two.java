import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/81544a4989df4109b33c2d65037c5836
[^a-zA-Z]是去匹配目标字符串中非a—z也非A—Z的字符
^[a-zA-Z]是去匹配目标字符串中以中括号中的a—z或者A—Z开头的字符
 */
public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            String[] str=s.split(" ");
            for(int i=str.length-1;i>=0;i--){
                if(i==0){
                    System.out.print(str[i]);
                }else {
                    System.out.print(str[i]+" ");
                }
            }
        }
    }
}
