/*
https://www.nowcoder.com/questionTerminal/e7e0d226f1e84ba7ab8b28efc6e1aebc
 */
public class one {
    public static int addAB(int A, int B) {
        int cur,tmp;
        while (B!=0){
            cur= A^B;
            B=(A&B)<<1;
            A=cur;
        }
        return A;
        // write code here
    }

    public static void main(String[] args) {
        int a=addAB(1,2);
        System.out.println(a);
    }
}
