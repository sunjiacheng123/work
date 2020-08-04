import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
https://www.nowcoder.com/questionTerminal/fbcf95ed620f42a88be24eb2cd57ec54

 */
public class One {
    public int getValue(int[] gifts, int n) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            int count=m.getOrDefault(gifts[i],0);
            m.put(gifts[i],++count);
        }
        int num=n/2;
        for(int i=0;i<n;i++){
            if(m.get(gifts[i])>num){
                return gifts[i];
            }
        }
        return 0;
    }
}
