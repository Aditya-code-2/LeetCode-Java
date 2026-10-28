class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int mod = 1_000_000_007;

        int[][][] dp = new int[m][n][k];

        dp[0][0][grid[0][0] % k] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    continue;
                }

                for (int r = 0; r < k; r++) {
                    int nr = (r + grid[i][j]) % k;

                    if (i > 0) {
                        dp[i][j][nr] =
                            (int) ((dp[i][j][nr]
                            + (long) dp[i - 1][j][r]) % mod);
                    }

                    if (j > 0) {
                        dp[i][j][nr] =
                            (int) ((dp[i][j][nr]
                            + (long) dp[i][j - 1][r]) % mod);
                    }
                }
            }
        }

        return dp[m - 1][n - 1][0];
    }
}