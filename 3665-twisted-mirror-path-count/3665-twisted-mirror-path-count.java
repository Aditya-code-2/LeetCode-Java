
class Solution {
    static final int MOD = 1_000_000_007;

    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long[][] dp = new long[m][n];
        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (dp[i][j] == 0) continue;

                // Move right
                int row = i;
                int col = j + 1;
                int dir = 0; // 0 = right, 1 = down

                while (row < m && col < n &&
                       grid[row][col] == 1) {

                    if (dir == 0) {
                        row++;
                        dir = 1;
                    } else {
                        col++;
                        dir = 0;
                    }
                }

                if (row < m && col < n) {
                    dp[row][col] =
                        (dp[row][col] + dp[i][j]) % MOD;
                }

                // Move down
                row = i + 1;
                col = j;
                dir = 1;

                while (row < m && col < n &&
                       grid[row][col] == 1) {

                    if (dir == 0) {
                        row++;
                        dir = 1;
                    } else {
                        col++;
                        dir = 0;
                    }
                }

                if (row < m && col < n) {
                    dp[row][col] =
                        (dp[row][col] + dp[i][j]) % MOD;
                }
            }
        }

        return (int) dp[m - 1][n - 1];
    }
}
