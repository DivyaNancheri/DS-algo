/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode h=null;
        int c=0;
        while(A!=null && B!=null){
            int sum=c+A.val+B.val;
            ListNode n=new ListNode(sum%10);
            n.next=h;
            h=n;
            c=sum/10;
            A=A.next;
            B=B.next;
        }
        while(A!=null){
            int sum=c+A.val;
            ListNode n=new ListNode(sum%10);
            n.next=h;
            h=n;
            c=sum/10;
            A=A.next;
        }
        while(B!=null){
            int sum=c+B.val;
            ListNode n=new ListNode(sum%10);
            n.next=h;
            h=n;
            c=sum/10;
            B=B.next;
        }
        if(c!=0){
            ListNode n=new ListNode(c);
            n.next=h;
            h=n;
        }
        ListNode p=null;
        while(h!=null){
            ListNode t=h.next;
            h.next=p;
            p=h;
            h=t;
        }
        return p;
    }
}
