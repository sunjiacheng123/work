/*
https://www.nowcoder.com/questionTerminal/31a9495eb02844fb8c0e9ab101053f53
leetcode上有数一的个数，可以推广至求任意数字的个数。
 */
public class Two {
    public int countNumberOf2s(int n) {
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i,b = n % i;
            //之所以补8，是因为当百位为0，则a/10==(a+8)/10，
            //当百位>=2，补8会产生进位位，效果等同于(a/10+1)
            count += (a + 7) / 10 * i + ((a % 10 == 2) ? b + 1 : 0);
        }
        return count;
    }
}
