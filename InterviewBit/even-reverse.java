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
        int len=0;
        ListNode p=A;
        while(p!=null){
            p=p.next;
            len++;
        }
        if(len<3){
            return A;
        }
        ListNode p1=A;
        int n1=1;
        Stack<Integer> st= new Stack<Integer>();
        while(p1!=null){
            if(n1%2==0){
                st.push(p1.val);
            }
            n1++;
            p1=p1.next;
        }
        ListNode p2=A;
        int n2=1;
        while(p2!=null){
            if(n2%2==0){
                p2.val=st.pop();
            }
            n2++;
            p2=p2.next;
        }
        return A;
    }
}


// Example Input
// Input 1:

// A = 1 -> 2 -> 3 -> 4
// Input 2:

// A = 1 -> 2 -> 3


// Example Output
// Output 1:

//  1 -> 4 -> 3 -> 2
// Output 2:

//  1 -> 2 -> 3