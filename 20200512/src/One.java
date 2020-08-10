import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/58e7779c9f4e413cb80792d33ba6acaf
 */
public class One {
    private static final int[] W = {17*29,29,1};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s1=sc.next();
            String s2=sc.next();
            String[] strings1=s1.split("\\.");
            String[] strings2=s2.split("\\.");
            int[] P = {Integer.parseInt(strings1[0]),Integer.parseInt(strings1[1]),Integer.parseInt(strings1[2])};
            int[] A = {Integer.parseInt(strings2[0]),Integer.parseInt(strings2[1]),Integer.parseInt(strings2[2])};
            int ta = A[0]*W[0]+A[1]*W[1]+A[2]*W[2];
            int tp = P[0]*W[0]+P[1]*W[1]+P[2]*W[2];
            int t=ta-tp;
            if(ta<tp){
                System.out.print("-");
                t = -t;
            }
            System.out.println(t/W[0]+"."+t%W[0]/W[1]+"."+t%W[0]%W[1]/W[2]);
        }
    }
}
