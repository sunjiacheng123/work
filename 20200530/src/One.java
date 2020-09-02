/*
https://www.nowcoder.com/questionTerminal/f5805cc389394cf69d89b29c0430ff27
 */
public class One {
    public static int findMaxGap(int[] A, int n) {
        int max=-1,min;
        for(int i=0;i<n;i++)
            if(A[i]>max)
                max=A[i];
        min = A[0]>A[n-1]?A[n-1]:A[0];
        return max-min;
    }

    public static void main(String[] args) {
        int[] A = {2, 7, 3, 1, 1};
        System.out.println(findMaxGap(A, 5));
    }
}
