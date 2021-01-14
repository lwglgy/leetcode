public class Leetcode72 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[0][i] = i;
        }
        for (int i = 0; i < m + 1; i++) {
            dp[i][0] = i;
        }
        for (int x = 1; x <= m; x++) {
            for (int y = 1; y <= n; y++) {
                if (word1.charAt(x - 1) == word2.charAt(y - 1)) {
                    int temp = Math.min(dp[x - 1][y] + 1, dp[x][y - 1] + 1);
                    dp[x][y] = Math.min(temp, dp[x-1][y-1]);
                } else {
                    int temp = Math.min(dp[x - 1][y] + 1, dp[x][y - 1] + 1);
                    dp[x][y] = Math.min(temp, dp[x - 1][y - 1] + 1);
                }
            }
        }






        return dp[m][n];
    }


//    }

    public static void main(String[] args) {
        new Leetcode72().minDistance("horse","ros");
    }
}
