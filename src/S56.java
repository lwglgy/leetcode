import java.util.Arrays;
import java.util.Comparator;

public class S56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1) return intervals;
        int n = intervals.length;
        int[][] ans = new int[n][2];
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1]-o2[1];
                return o1[0]-o2[0];
            }
        });
        int last = -1;
        for(int i = 0;i<n;i++){
            if(i == 0 || intervals[i][0] > ans[last][1]){
                ans[++last] = intervals[i];
            }else{
                if(ans[last][1] < intervals[i][1])
                ans[last][1] = intervals[i][1];
            }
        }
        return Arrays.copyOf(ans,last+1);
    }

}
