import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/2baa6aba39214d6ea91a2e03dff3fbeb
 */
public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String, Integer> map=new LinkedHashMap<>();
        while (sc.hasNext()){
            String str=sc.next();
            int n=sc.nextInt();
            String[] arr=str.split("\\\\");
            String s=arr[arr.length-1];
            if (s.length()>16){
                s=s.substring(s.length()-16);
            }
            String result=s+" "+n;
            int count=map.getOrDefault(result,0)+1;
            map.put(result,count);
        }
        int count=0;
        for(String s:map.keySet()){
            count++;
            if(count>(map.keySet().size()-8)){
                System.out.println(s+" "+map.get(s));
            }
        }
    }
}
