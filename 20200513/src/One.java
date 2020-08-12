import java.util.Scanner;
/*
https://blog.csdn.net/weixin_30646505/article/details/98898654
 */
public class One {
    public static char max(int a,int b,int c){
        if (a >= b&&a >= c)
        {
            return 'B';
        }
        if (b >= a&&b >= c)
        {
            return 'C';
        }

            return 'J';

    }

    public static void main(String[] args) {
        int[] A=new int[3];
        int[] numB=new int[3];// BCJ
        int[] numA=new int[3];// BCJ
        Scanner sc=new Scanner(System.in );
        String s;
        while (sc.hasNext()){
            String n=sc.nextLine();
            for (int i=0;i<Integer.parseInt(n);i++){
                s=sc.nextLine();
                //System.out.println(s);
                //System.out.println(s.length());
                if(s.charAt(0)=='C'&&s.charAt(2)=='J'||s.charAt(0)=='J'&&s.charAt(2)=='B'||s.charAt(0)=='B'&&s.charAt(2)=='C'){
                    if(s.charAt(0)=='B'){
                        numA[0]++;
                    }
                    if(s.charAt(0)=='C'){
                        numA[1]++;
                    }
                    if(s.charAt(0)=='J'){
                        numA[2]++;
                    }
                    A[0]++;

                }else if(s.charAt(0)=='J'&&s.charAt(2)=='C'||s.charAt(0)=='B'&&s.charAt(0)=='J'||s.charAt(0)=='C'&&s.charAt(2)=='B'){
                    A[2]++;
                    if(s.charAt(2)=='B'){
                        numB[0]++;
                    }
                    if(s.charAt(2)=='C'){
                        numB[1]++;
                    }
                    if(s.charAt(2)=='J'){
                        numB[2]++;
                    }
                }else {
                    A[1]++;

                }
            }
            System.out.println(A[0]+" "+A[1]+" "+A[2]);
            System.out.println(A[2]+" "+A[1]+" "+A[0]);
            System.out.println(max(numA[0],numA[1],numA[2])+" "+max(numB[0],numB[1],numB[2]));
        }
    }
}
