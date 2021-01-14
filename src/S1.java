public class S1 {
    public static int findLengthOfLCIS(int[] nums) {
        int l = nums.length;
        int start = 0;
        int max = 0;
        for(int i=1;i<l;i++){
            if(nums[i]>nums[start]){
                max = i-start < max?max:i-start;
            }else{
                start = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,1,2,3,1,2,3,4,5,6,7,8,9};
        System.out.println(findLengthOfLCIS(arr));
    }
}
