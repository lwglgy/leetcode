public class Offer11 {
    public int minArray(int[] numbers) {
        int n = numbers.length;
        if(n == 1)return numbers[0];
        int l = numbers[0];
        int r = numbers[n-1];
        int right = 0;
        int left = n-1;
        int  i = n/2;
        while(i>=0 && i<n){
            if(numbers[i]<=r && numbers[i-1]>=l){
                return numbers[i];
            }
            if(numbers[i]>l){
                left =
                i = (i+1+right)/2;
            }
        }
        return 0;
    }
}
