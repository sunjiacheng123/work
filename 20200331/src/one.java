import java.util.Scanner;
/*
汽水瓶问题：
有这样一道智力题: "商店规定:三个空汽水瓶可以换一瓶汽水。小张
手上有十个空.水瓶，她最多可以换多少瓶汽水喝? "答案是5瓶，方法
如下:先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，
用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先
借给你瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给
老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝?
 */
public class one {
    public static int sum(int a){
        int num=0;
        if(a<=0){
            return 0;
        }
        while(a>0){
            if(a==2){
                num++;
                break;
            }
            if(a==1){
                break;
            }
            num=num + a/3;
            a=a%3+a/3;
        }
        return  num;
    }

    public static void main(String[] args) {

        int i=0;
        Scanner in=new Scanner(System.in);
        //hasNext()方法可以判断是否会继续输入
        while (in.hasNext()){
            i=in.nextInt();
            System.out.println(sum(i));
        }
    }

}
