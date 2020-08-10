import java.util.LinkedHashMap;
import java.util.Map;

/*
传输层的数据叫段  网络层叫包      数据链路层叫帧   物理层叫比特流


 */
public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        System.out.println(map.getOrDefault("sdas",0));

    }
}
