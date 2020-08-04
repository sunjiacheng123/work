import java.awt.*;
/*
https://www.nowcoder.com/questionTerminal/0e27e0b064de4eacac178676ef9c9d70
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Two {

    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead==null){
            return null;
        }
        ListNode small=new ListNode(-1);
        ListNode big=new ListNode(-1);
        ListNode a=small,b=big,cur=pHead;
        while(cur!=null){
            if(cur.val>=x){
                b.next=cur;
                b=b.next;
            }else{
                a.next=cur;
                a=a.next;
            }
            cur=cur.next;
        }
//        if(small.next!=null){
////            a.next=big.next;
////            return small.next;
////        }else {
////            return big.next;
////        }
        a.next=big.next;
        b.next=null;
        return small.next;
    }
}
