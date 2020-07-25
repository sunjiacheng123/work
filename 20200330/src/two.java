public class two {
    链接：https://www.nowcoder.com/questionTerminal/e016ad9b7f0b45048c58a9f27ba618bf
    来源：牛客网

    public int findKth(int[] a, int n, int K) {
        return findKth(a, 0, n-1, K);
    }

    public int findKth(int[] a, int low, int high, int k) {
        int part = partation(a, low, high);

        if(k == part - low + 1) return a[part];
        else if(k > part - low + 1) return findKth(a, part + 1, high, k - part + low -1);
        else return findKth(a, low, part -1, k);

    }

    public int partation(int[] a, int low, int high) {
        int key = a[low];

        while(low < high) {
            while(low < high && a[high] <= key) high--;
            a[low] = a[high];
            while(low < high && a[low] >= key) low++;
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }

    public static void main(String[] args) {
        int[] a={1,3,5,2,2};
        int sum=findKth(a,5,3);
        System.out.println(sum);
    }
}
