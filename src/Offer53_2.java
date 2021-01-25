public class Offer53_2 {
    public int missingNumber(int[] nums) {
        if(nums[nums.length-1] == nums.length-1)return nums.length;
        if(nums[0] == 1)return 0;
        int n = nums.length;
        int l = 0;
        int r = n-1;
        while(l<=r){
            int temp = (l+r)/2;
            if(temp-1 >= 0 && nums[temp-1] == temp-1 && nums[temp] == temp+1)return temp;
            if(nums[temp] == temp) l = temp + 1;
            else if(nums[temp] == temp + 1) r = temp - 1;
        }
        return 0;
    }
}
