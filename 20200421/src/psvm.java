import java.util.Scanner;

public class psvm {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();

        char[] cur=new char[str.length()];
        for(int i=0;i<str.length();i++){
                cur[i]=str.charAt(i);
        }
        System.out.println(new String(cur));
    }
}
