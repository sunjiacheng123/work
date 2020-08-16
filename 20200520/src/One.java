/*
https://www.nowcoder.com/questionTerminal/6fadc1dac83a443c9434f350a5803b51
 */
public class One {
    public int[] arrayPrint(int[][] arr, int n) {
        int curX=0;
        int curY=n-1;
        int[] tmp=new int[n*n];
        int index=0;
        while (curX<n){
            int x=curX;
            int y=curY;
            while (x<n && y<n){
                tmp[index++]=arr[x++][y++];
            }
            if(curY>0){
                curY--;
            }else {
                curX++;
            }
        }
        return tmp;
    }
}
