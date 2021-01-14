import java.util.List;

public class Offer6 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public int[] reversePrint(ListNode head) {
        ListNode pre,post;
        if(head.next == null){
            return new int[]{head.val};
        }
        pre = head;
        post = pre.next;
        int n = 2;
        while(post.next != null){
            ListNode temp = post.next;
            post.next = pre;
            pre = post;
            post = temp;
            n++;
        }
        int[] ans = new int [n];
        int index = 0;
        while(post.next!=null){
            ans[index++] = post.val;
        }
        return ans;
    }
}
