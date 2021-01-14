
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int x) { val = x; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



public class S25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)return l2;
        if(l2 == null)return l1;
        ListNode head = new ListNode(-1);
        ListNode pre = head;
        ListNode h1 = l1;
        ListNode h2 = l2;
        while(h1 != null && h2 != null){
            if(h1.val<h2.val){
                pre.next = h1;
                h1 = h1.next;
            }else{
                pre.next = h2;
                h2 = h2.next;
            }
            pre = pre.next;
        }
        if(h1 == null) pre.next = h2;
        else  pre.next = h1;
        return head.next;
    }
}
