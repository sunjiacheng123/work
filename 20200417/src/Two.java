/*
https://www.nowcoder.com/questionTerminal/9fe25b6cf93e46dcb09ba67aeef2c4cc
 */
public class Two {
    public static void main(String[] args) {
        int sum=30*10;
        long num=0;
        for(int i=0;i<30;i++){
            num=num+(long)Math.pow(2,i);
            float s=num;
        }
        System.out.println(sum+" "+num);
    }
}
