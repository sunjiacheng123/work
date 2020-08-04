import javax.sound.midi.Soundbank;
import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/1221ec77125d4370833fd3ad5ba72395
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=1,b=0,c=0;
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            for (int i=1;i<n;i++){
                c=c+b;
                b=a;
                a=c;
            }
            System.out.println(a+b+c);
        }
    }
}
