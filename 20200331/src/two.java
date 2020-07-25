/*
数组中的逆序对：
有一组数，对于其中任意两个数组，若前面一个大于后面一个数字，则
这两个数字组成一个逆序对。 请设计-个效的算法，计算给定数组中的逆序对个数。

给定一 个int数组A和它的大小n,请返回A中的逆序对个数。保证n小于等于5000。
 */
public class two {
    public static int count(int[] A, int n) {
        int sum=0;
        for(int j=A.length-1;j>=0;j--){
            for(int i=j-1;i>=0;i--){
                if(A[i]>A[j]){
                    sum++;
                }
            }
        }
        return sum;
        // write code here
    }

    public static void main(String[] args) {
        int[] A={1,2,3,4,5,6,7,0};
        System.out.println(count(A,8));
    }
}
