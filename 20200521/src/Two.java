import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/48b3cb4e3c694d9da5526e6255bb73c3
 */
public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            String[] str=s.split(" ");
            System.out.println(str.length);
            String cur=null;
            for(int i=str.length-1;i>=0;i--){
                cur=cur+str[i]+" ";
            }
            System.out.println(cur.substring(4,cur.length()-1));

        }
    }
}
