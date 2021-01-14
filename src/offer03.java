import java.util.HashSet;

public class offer03 { //3min15sec
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set =  new HashSet<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }else {
                set.add(nums[i]);
            }
        }
        return 0;
    }
}
