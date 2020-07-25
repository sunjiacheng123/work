import javax.lang.model.util.ElementScanner6;

/*
括号串问题：
对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。

给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串
 */
public class two {
    public static boolean chkParenthesis(String A, int n) {
        int num=0;
        int sum=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='(' && A.charAt(i)==')'){

                if(A.charAt(i)=='('){
                    num++;
                }else {
                    sum++;
                }
            }else{
                return false;
            }
            if(num==sum){
                return true;
            }
            return false;
        }
    }
}
