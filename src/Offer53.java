public class Offer53 {
    //两个错误信息：1.大小关系和lr变换的顺序搞反了，事实证明+1和-1全都需要有，否则会陷入无限循环 2. 一定要记住，循环遍历的条件是》=0而不是。0
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        while(l<=r){
            int temp = (l+r)/2;
            if(nums[temp] == target){
                int a = temp;
                int b = temp;
                while(a+1<n && nums[a+1] == nums[temp])a++;
                while (b-1>=0 && nums[b-1] == nums[temp])b--;
                return a-b+1;
            }
            if(nums[temp] < target){
                l = temp + 1;
            }else if(nums[temp] > target){
                r = temp - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
