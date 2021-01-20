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