public class Leetcode55 {
    public boolean canJump(int[] nums) {
        if(nums.length == 1)return true;
        if(nums[0] == 0)return false;
        int n = nums.length;
        int max = n-1;
        for(int i=0;i<=n;i++){
            for(int x=0;x<max;x++){
                if(nums[x]+x >= max)
                    max = Math.min(max,x);
            }

            if(i == 0 && max == n-1)return false;
        }
        if(max<=1)return true;
        else return false;
    }
}
