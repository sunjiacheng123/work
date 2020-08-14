import java.util.*;
//https://www.nowcoder.com/questionTerminal/8bbc9415216d47459c425b5e19164365
public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Long> lis=new LinkedList<>();
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            long b=sc.nextInt();
            if(a==1){
                sum+=b;
                lis.add(b);
            }else if(a==2){
                lis.remove("b");
                //lis.remove(lis.indexOf(b));
                sum-=b;
            }
            if(lis.size()<3){
                System.out.println("No");
            }else {
                long max= Collections.max(lis);
                if(sum-max>max){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }
    }
}
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        List<Long> lis=new LinkedList<>();
//        int n=sc.nextInt();
//
//        for(int i=0;i<n;i++){
//            int a=sc.nextInt();
//            long b=sc.nextInt();
//            if(a==1){
//
//                lis.add(b);
//            }else if(a==2){
//                lis.remove(lis.indexOf(b));
//            }
//            if(lis.size()<3){
//                System.out.println("No");
//            }else {
//                Collections.sort(lis,Collections.reverseOrder());
//                long max = lis.get(0);
//                int sum = 0;
//                for (int j=1;j<lis.size();j++){
//                    sum += lis.get(j);
//                }
//                if(sum>max){
//                    System.out.println("Yes");
//                }else{
//                    System.out.println("No");
//                }
//            }
//        }
//    }
//}