public class S24 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode root = recursive(head,null);
        return root;
    }

    public ListNode recursive(ListNode head, ListNode headpre){

        ListNode hnext = head.next;
        head.next = headpre;
        if(hnext == null) return head;
        ListNode node = recursive(hnext,head);
        return node;
    }
}
