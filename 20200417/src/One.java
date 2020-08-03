import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/e8480ed7501640709354db1cc4ffd42a
 */
public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.next();
            int n=sc.nextInt();
            int max=0;
            if(n==str.length()){
                System.out.println(str);
            }
            String cur="";
            for(int i=0;i<=str.length()-n;i++){
                int count=0;
                for(int j=i;j<i+n;j++){
                    if(str.charAt(j)=='G'||str.charAt(j)=='C'){
                        count++;
                    }
                }
                if(max < count){
                    max=count;
                    cur=str.substring(i,i+n);
                }
            }
            System.out.println(cur);
        }
    }
}
