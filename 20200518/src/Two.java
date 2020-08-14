/*
https://www.nowcoder.com/questionTerminal/b0850698cb41449188344cdb647f3e99
 */
public class Two {
    public static String replaceSpace(String iniString, int length) {
        String str=iniString.replaceAll(" ","%20");
        return str;
    }

    public static void main(String[] args) {
        String iniString="Mr John Smith";
        System.out.println(replaceSpace(iniString,13));
    }
}
