import javafx.scene.transform.Scale;
/*
https://www.nowcoder.com/questionTerminal/2f13c507654b4f878b703cfbb5cdf3a5
 */
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextLine()){
            String str=sc.nextLine();
            String cur=sc.nextLine();
            char[] ch=str.toCharArray();
            int yes=0,no=0;
            for(int i=0;i<cur.length();i++){
                int tmp=yes;
                for(int j=0;j<ch.length;j++){
                    if(cur.charAt(i)==ch[j]){
                        yes++;
                        ch[j]=' ';
                        break;
                    }
                }
                if(tmp==yes){
                    no++;
                }
            }
            if(no!=0){
                System.out.println("No"+" "+no);
            }else {
                System.out.println("Yes"+" "+(str.length()-yes));
            }
        }
    }
}
