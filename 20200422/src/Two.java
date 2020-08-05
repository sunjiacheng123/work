/*
https://www.nowcoder.com/questionTerminal/ed85a09f0df047119e94fb3e5569855a
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Two {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        int i=0;
        int numA=0,numB=0;
        ListNode cur=a;
        ListNode tmp=b;
        while(cur!=null){
            numA=numA+cur.val*(int) Math.pow(10,i++);
            cur=cur.next;
        }
        i=0;
        while(tmp!=null){
            numB=numB+tmp.val*(int) Math.pow(10,i++);
            tmp=tmp.next;
        }
        int num=numA+numB;
        ListNode node=new ListNode(-1);
        cur=node;
        while(num!=0){
            ListNode res=new ListNode(num%10);
            cur.next=res;
            cur=cur.next;
            num=num/10;
        }
        return node.next;
    }
}
