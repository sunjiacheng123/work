import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/655a43d702cd466093022383c24a38bf
 */
public class Two {

    public static boolean func(String s){
        return new StringBuffer(s).reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            for(int i=0;i<s.length();i++){
                String str;
                if(i==0){
                    str=s.substring(i+1);
                }else if(i==s.length()-1){
                    str=s.substring(0,s.length()-1);
                }else {
                    str=s.substring(0,i)+s.substring(i+1);
                }
                if(func(str)){
                    System.out.println("YES");
                    break;
                }else if(i==s.length()-1){
                    System.out.println("NO");

                }

            }
        }
    }
}
