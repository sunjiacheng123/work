import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
/*
https://www.nowcoder.com/questionTerminal/3350d379a5d44054b219de7af6708894
 */
public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            String[] str=new String[n];
            Map<String,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                str[i]=sc.next();
                map.put(str[i],0);
            }
            int m=sc.nextInt();
            for(int i=0;i<m;i++){
                int count=map.getOrDefault(sc.next(),0);
                map.put(sc.next(),++count);
            }
            int sum=0;
            for(int i=0;i<n;i++){
                System.out.println(str[i]+" : "+map.get(str[i]));
                sum+=map.get(str[i]);
            }
            System.out.println("Invalid : "+(m-sum));
        }
    }
}

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            Map<String, Integer> map = new LinkedHashMap<String, Integer>();
            for(int i=0; i<n; i++) {
                map.put(sc.next(),0);
            }
            int vote = sc.nextInt();
            int invalid = 0;
            for(int j=0; j<vote; j++) {
                String temp = sc.next();
                if(map.get(temp) == null) {
                    invalid ++;
                } else {
                    map.put(temp,map.get(temp)+1);
                }
            }
            for(Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
            System.out.println("Invalid : "+invalid);
        }
    }
}