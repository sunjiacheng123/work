import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Character,Integer> map=new TreeMap<>();

        while (sc.hasNext()){
            String s=sc.nextLine();
            for (char i='A';i<='Z';i++){
                map.put( i,0);
            }
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                    int count=map.get(s.charAt(i));
                    map.put(s.charAt(i),++count);
                }
            }
            for(char i='A';i<='Z';i++){
                System.out.println(i+":"+map.get(i));
            }
        }
    }
}

