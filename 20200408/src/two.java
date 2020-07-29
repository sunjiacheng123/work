/*

有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，
要从左上角走到右下角。请设计一个算法，计算机器人有多少种走法。
给定两个正整数int x,int y，请返回机器人的走法数目。保证x＋y小于等于12。

由于题目中x+y<=12，所以不必担心递归超时问题，对于每一步，只要没有走到
边缘（x==1||y==1）就会有两种选择：向下走（x-1）or 向右走（y-1），终
止条件即走到边缘，只能一直走下去，即此时只有一种走法。
 */
import java.util.*;
public class two {
    public int countWays(int x, int y) {
        // write code here
        if(x<=0||y<=0) return 0;
        if(x==1||y==1) return 1;
        return countWays(x-1,y)+countWays(x,y-1);
    }
}
