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
