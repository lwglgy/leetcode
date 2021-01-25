public class Offer56 {
    public int[] singleNumbers(int[] nums) {
        int xor = 0;
        int n = nums.length;
        for(int i : nums){
            xor = xor ^ i;
        }
        int div = 1;
        while((xor & div) == 0){
            div <<= 1;
        }
        int a = 0;
        int b = 0;
        for(int i : nums){
            if((i & div) == 0){
                a = a ^ i;
            }else{
                b = b^i;
            }
        }
        return new int []{a,b};
    }
}
