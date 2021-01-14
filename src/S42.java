public class S42 {
    public   int trap(int[] height) {
        int l = height.length;
        if (l <= 2) return 0;
        int[] ltr = new int[l];
        int[] rtl = new int[l];
        int max = 0;
        ltr[0] = 0;
        for (int i = 1; i < l; i++) {
            max = max < height[i - 1] ? height[i - 1] : max;
            ltr[i] = max;
        }
        max = 0;
        for (int i = l - 2; i >= 0; i--) {
            max = max < height[i + 1] ? height[i + 1] : max;
            rtl[i] = max;
        }
        int ans = 0;
        for (int i = 1; i < l - 1; i++) {
            int tempmin = Math.min(ltr[i], rtl[i]);
            if (height[i] < tempmin)
                ans = ans + (tempmin - height[i]);
        }
        return ans;
    }



}