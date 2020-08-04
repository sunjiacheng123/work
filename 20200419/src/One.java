/*
https://www.nowcoder.com/questionTerminal/917a800d4de1423394827932f4725c68
 */
public class One {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] tmp=new boolean[p.length];
        for(int i=0;i<p.length;i++){
            tmp[i]=s.contains(p[i]);
        }
        return tmp;
    }

}
