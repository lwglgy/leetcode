import java.util.Comparator;
import java.util.PriorityQueue;

public class S23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        PriorityQueue<ListNode> queue =  new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for(int i = 0 ; i<lists.length;i++){
            if(lists[i] != null)
            queue.add(lists[i]);
        }

        while(queue.size()>0){
           temp.next = queue.poll();
           temp = temp.next;
           if(temp.next != null){
               queue.add(temp.next);
           }
        }
        return head.next;
    }
}
