import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/610e6c0387a0401fb96675f58cda8559
*/
public class One {
    public static float func(int a){
        if(a==0){
            return 1;
        }
        return a*func(a-1);
    }
    public static float fun(int a){
        if(a==1){
            return 0;
        }
        if(a==2){
            return 1;
        }else {
            return (a-1)*(fun(a-1)+fun(a-2));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            float result=(fun(n)/func(n))*100;
            System.out.println(String.format("%.2f",result)+"%");
        }
    }
}
