/*

有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环
至开头继续进行，求最后一个被删掉的数的原始下标位置。以8个数(N=7)为例:
｛0，1，2，3，4，5，6，7｝，0->1->2(删除)->3->4->5(删除)->6->7->0(删除),
如此循环直到最后一个数被删除。
输入描述:
每组数据为一行一个整数n(小于等于1000)，为数组成员数,如果大于1000，则对a[999]进行计算。
输出描述:
一行输出最后一个被删掉的数的原始下标位置。
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class one {
    public static void main1(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        Queue<Integer> q=new LinkedList<>();
        if(a>1000){
            a=999;
        }
        for (int i=0;i<a;i++)
        {
            q.offer(i);
        }
        int count=0;
        while (q.size()>1){
            for(int i=0;i<2;i++){
                int b=q.poll();
                q.offer(b);
            }
            q.poll();
        }
        System.out.println(q.poll());
    }
    public static void main(String [] args){

        Scanner  sc=new Scanner(System.in);
        while(sc.hasNext()){
            int  input=sc.nextInt();
            Queue  list=new LinkedList();
            if(input>1000)input=999;
            for(int i=0;i<input;i++){
                list.offer(i);
            }
            while(list.size()!=1){
                for(int j=0;j<2;j++){
                    list.offer(list.poll());
                }
                list.poll();
            }
            System.out.println(list.poll());

        }

    }

}
