import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class S239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();
        int n = nums.length;
        int[] ans = new int[n];
        int flag = -1;//代表要剔除的元素
        for(int i = 0;i<n;i++){
            if(i>=k){

                flag++;
            }
            if (flag >= 0) {
                if(queue.getFirst() == nums[flag]){
                    queue.removeFirst();
                }
            }

            if(queue.size()>0&&queue.getLast()>=nums[i]){
                queue.add(nums[i]);
            } else if(queue.size()>0&&queue.getLast()<nums[i]){
                while(queue.size()>0&&queue.getLast()<nums[i]){
                    queue.removeLast();
                }
                queue.add(nums[i]);
            } else if(queue.size() == 0) queue.add(nums[i]);
            ans[i] = queue.getFirst();
        }
        return Arrays.copyOfRange(ans,k-1,ans.length);
    }
}
