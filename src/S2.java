import java.util.HashSet;

public class S2 {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<Integer>();
        int currentLength = 1;
        int max = 1;
        for(int x:nums){
            set.add(x);
        }
        for(int x:nums){
            if(!set.contains(x-1)){
                int currentNum = x+1;
                while(true){
                    if(set.contains(currentNum)){
                        currentLength++;
                        max = max>currentLength?max:currentLength;
                        currentNum++;
                    }else{
                        currentLength = 1;

                        break;
                    }
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,100,200};
        System.out.println(longestConsecutive(arr));
    }
}
