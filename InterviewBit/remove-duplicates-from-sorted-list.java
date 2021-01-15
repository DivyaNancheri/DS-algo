/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode h) {
        ListNode thead=h;
        if(h==null)
            return h;
        while(h.next!=null){
            if(h.next.val==h.val){
                h.next=h.next.next;
            }
            else
                h=h.next;
        }
        return thead;
    }
}
