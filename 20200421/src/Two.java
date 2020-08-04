import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
/*
https://www.nowcoder.com/questionTerminal/9f6b8f6ec26d44cfb8fc8c664b0edb6b
 */
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();

            char[] cur=new char[str.length()];
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='A'){
                    cur[i]=(char) (str.charAt(i)>'E'?(str.charAt(i)-5):(str.charAt(i)+21));
                }else {
                    cur[i]=str.charAt(i);
                }
                //cur[i]=str.charAt(i);
            }
            System.out.print(new String(cur));
        }
    }
}
