/*
链接：https://www.nowcoder.com/questionTerminal/7f0661ace6df48d0af3f924950d57126
来源：牛客网

public class GoUpstairs {
    public int countWays(int n) {
        if(n<1) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        int array[] =new int[n];
        array[0] =1;
        array[1] =2;
        array[2] =4;
        for(int i=3;i<n;i++){
            array[i]=((array[i-1]+array[i-2])%1000000007+array[i-3]%1000000007)%1000000007;
        }
        return array[n-1];
    }
}
 */
public class Two {
    public static long tiao(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else if(n==3){
            return 4;
        }
        return tiao(n-1)+tiao(n-2)+tiao(n-3);
    }

    public static long countWays(int n) {
        // write code here
        return tiao(n);
    }

    public static void main(String[] args) {
        System.out.println(countWays(3));
    }

        public int countWays1(int n) {
            if(n<1) return 0;
            if(n==1) return 1;
            if(n==2) return 2;
            if(n==3) return 4;
            int array[] =new int[n];
            array[0] =1;
            array[1] =2;
            array[2] =4;
            for(int i=3;i<n;i++){
                array[i]=((array[i-1]+array[i-2])%1000000007+array[i-3]%1000000007)%1000000007;
            }
            return array[n-1];
        }

}
