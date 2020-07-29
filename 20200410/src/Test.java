/*
无缓存交换数据
 */

public class Test {
    public int[] exchangeAB(int[] AB) {
        AB[0]=AB[0]+AB[1];
        AB[1]=AB[0]-AB[1];
        AB[0]=AB[0]-AB[1];
        return AB;
    }
}
