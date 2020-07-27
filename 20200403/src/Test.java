import java.util.Scanner;

/*
神奇的口袋：
有一个神奇的口袋，总的容积是40，用这个口袋可以变出一些物品，
这些物品的总体积必须是40。John现在有n个想要得到的物品，
每个物品的体积分别是a1，a2……an。John可以从这些物品中选择一些，
如果选出的物体的总体积是40，那么利用这个神奇的口袋，
John就可以得到这些物品。现在的问题是，
John有多少种不同的选择物品的方式。

 */
public class Test {
//    public static void main0(String[] args) {
//        String s;
//        //编译不能通过
//
//        System.out.println(s);
//    }
    static int n=0;
    static int[] pre;
    static int count=0;

    //递归的方式
    public static int fun(int i,int sum){
        if(sum==0){
            //刚刚好40
            return 1;
        }

        if(i==n || sum<0){
            //到最后一个都不满足、减到负数
            return 0;
        }
        //递归：当前开始、下一个开始
        return fun(i+1,sum-pre[i])+fun(i+1,sum);

    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        pre=new int[n];
        for(int i=0;i<pre.length;i++){
            pre[i]=in.nextInt();
        }
        int count=fun(0,40);
        System.out.println(count);
    }
}
