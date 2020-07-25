import java.util.Scanner;

public class one {
    public static boolean huiwen(StringBuffer ab){
        for(int i=0,j=ab.length()-1;i<j;i++,j--){
            if(ab.charAt(i)!=ab.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String a=in.nextLine();

        String b=in.nextLine();
        int num=0;
        for(int i =0;i<=a.length();i++){
            StringBuffer ab=new StringBuffer(a).insert(i,b);
            if(huiwen(ab)){
                num++;
            }
        }
        System.out.println(num);
    }
}
