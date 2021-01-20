public ListNode static rev(ListNode h){
    ListNode p=null;
    while(h!=null){
        ListNode t=h.next;
        h.next=p;
        p=h;
        h=t;
    }
    return p;
}

static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

    HashSet<SinglyLinkedListNode> hs = new HashSet<SinglyLinkedListNode>();
    while (head1 != null) {
        hs.add(head1);
        head1 = head1.next;
    }
    while (head2 != null) {
        if (hs.contains(head2)) {
            return head2.data;
        }
        head2 = head2.next;
    }
    return -1;
}

static void printLinkedList(SinglyLinkedListNode head) {
    SinglyLinkedListNode curr=head;
    while(curr!=null){
        System.out.println(curr.data);
        curr=curr.next;
    }

}

static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode new_node = new SinglyLinkedListNode(data); 
    new_node.next = null; 
    SinglyLinkedListNode curr=head;
    if(head==null){
        return new_node;
    }
    else{
        while(head.next!=null){
            head=head.next;
        }
        head.next=new_node;
    }
    return curr;
}

static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
    SinglyLinkedListNode new_node = new SinglyLinkedListNode(data); 
    new_node.next = null; 
    new_node.next=llist;
    return new_node;
    
}
