import java.util.PriorityQueue;
import java.util.Scanner;
/*
TOP-K问题
输入：输入一组数据，最后一个数为要求输出的个数K
输出：最小的K个数
 */
public class two {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        Scanner in=new Scanner(System.in);
        int[] a=new int[100];
        int size=0;
        while(in.hasNextInt()){
            a[size]=in.nextInt();
            size++;
        }
        int n=a[size-1];
        for(int j=0;j<size-1;j++){
            p.add(a[j]);
        }
        for(int j=0;j<n;j++){
            System.out.print(p.poll()+" ");
        }
    }
}
