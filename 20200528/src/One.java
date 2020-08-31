import java.util.Arrays;
/*
数组中是否有一个数字出现次数大于数组长度的一般，有则返回此数字，无则返回0
 */
public class One {
    public static int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int a=array[array.length/2];
        System.out.println(Arrays.toString(array));
        int i=0;
        int count=0;
        for(i=0;i<array.length;i++){
            if(array[i]==a){
                count++;
            }
        }
        if(count>array.length/2){
            return a;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(a));
    }
}
