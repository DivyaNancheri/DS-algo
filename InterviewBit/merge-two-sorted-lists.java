/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        ListNode d=new ListNode(0);
        ListNode td=d;
        while(h1!=null &&h2!=null){
            if(h1.val<h2.val){
                d.next=h1;
                h1=h1.next;
            }
            else{
                d.next=h2;
                h2=h2.next;
            }
            d=d.next;
        }
        
        if(h1!=null)
            d.next=h1;
        else
            d.next=h2;
        return td.next;
        
    }
}