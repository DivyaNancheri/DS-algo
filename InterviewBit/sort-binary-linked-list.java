/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        ListNode p=A;
        int len=0;
        while(p!=null){
            p=p.next;
            len++;
        }
        int[] ar= new int[len];
        ListNode cur=A;
        int i=0;
        while(cur!=null){
            ar[i++]=cur.val;
            cur=cur.next;
        }
        Arrays.sort(ar);
        cur=A;
        i=0;
        while(cur!=null){
            cur.val=ar[i++];
            cur=cur.next;
        }
        return A;
    }
}

optmized
public class Solution {
    public ListNode solve(ListNode A) {
        
        ListNode cur = A;
        int count = 0;
        int len = 0;
        while(cur!=null){
            if(cur.val==0){
                ++count;
            }
            cur = cur.next;
            ++len;
        }
        
        cur = A;
        for(int i=0; i<len; i++){
            if(i<count){
              cur.val = 0;  
            }else{
                cur.val = 1;
            }
            
            cur = cur.next;
        }
        
        return A;
    }
}



// Input 1:

//  1 -> 0 -> 0 -> 1
// Input 2:

//  0 -> 0 -> 1 -> 1 -> 0


// Example Output
// Output 1:

//  0 -> 0 -> 1 -> 1
// Output 2:

//  0 -> 0 -> 0 -> 1 -> 1