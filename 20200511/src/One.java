import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/aced908691df4ebca6744f9fbd437749
 */
public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            String[] s1=s.split(" ");
            for(int i=s1.length-1;i>=0;i--){
                if(i!=0){
                    System.out.print(s1[i]+" ");
                }else {
                    System.out.print(s1[i]);
                }
            }
        }
    }
}
