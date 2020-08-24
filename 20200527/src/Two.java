import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            String[] str=s.split(" ");
            char[] str1=str[0].
            for(int i=0;i<str[2].length();i++){
                for(int j=0;j<str[1].length();j++){

                    if(str[1].charAt(j)==str[2].charAt(i)){
                        str[1].replaceFirst(str[1].charAt(j)," ")
                    }
                }
            }
        }
    }
}
