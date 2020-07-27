import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
每个测试输入包含 n个空格分割的n个整数，n不超过100，
其中有一个整数出现次数大于等于n/2。

输出出现次数大于等于n/2的数。
 */
public class teo {


    public static void main1(String[] args) {

        Scanner cin = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(cin.hasNextInt()){
            list.add(cin.nextInt());
        }
        //堆集合进行排序
        Collections.sort(list);
        //要求输出出现次数大于等于N/2的数
        //排序后，输出中间那个数即可
        System.out.println(list.get(list.size()/2-1));

    }

}
