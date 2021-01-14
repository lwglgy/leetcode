public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int m = matrix.length;
        if(m == 0)return false;
        int n = matrix[0].length;
        if(n == 0)return false;
        int i = m-1;
        int j = 0;
        while (i>0 && j<n-1){
            if(target>matrix[i][j]){
                j++;
            }else if(target<matrix[i][j]){
                i--;
            }else return true;
        }
        return false;
    }

}
