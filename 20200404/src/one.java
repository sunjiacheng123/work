import java.util.Scanner;
/*
输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，
用空格隔开。 范围均在-30到30之间(闭区间)。
输出为一行，如果存在满足的整数A，B，C则按顺序输出A，B，C，
用空格隔开，行末无空格。 如果不存在这样的整数A，B，C，则输出No
 */
public class one {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A, B, C;
        int[] sum = new int[4];
        for (int i = 0; i < 4; i++) {
            sum[i] = in.nextInt();
        }
        for (int i = 0; i <= sum[2] + sum[3]; i++) {
            for (int j = 0; j <= sum[2] + sum[3]; j++) {
                for (int k = 0; k <= sum[2] + sum[3]; k++){
                    if (i - j == sum[0] && j - k == sum[1] && i + j == sum[2] && j + k == sum[3]) {
                        System.out.println(i + " " + j + " " + k);
                        return;
                    }
                }

            }
            if(i==sum[2] + sum[3]){
                System.out.println("No");
            }
        }
    }
}
