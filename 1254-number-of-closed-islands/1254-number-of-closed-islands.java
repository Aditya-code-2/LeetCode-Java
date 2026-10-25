
class Solution {
    int rows, cols;
    boolean isClosed;

    public int closedIsland(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 0) {
                    isClosed = true;

                    dfs(grid, i, j);

                    if (isClosed) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    void dfs(int[][] grid, int i, int j) {

        // Boundary touch ki toh closed island nahi hai
        if (i < 0 || j < 0 || i >= rows || j >= cols) {
            isClosed = false;
            return;
        }

        // Water ya already visited cell
        if (grid[i][j] == 1) {
            return;
        }

        // Visited mark kar diya
        grid[i][j] = 1;

        // 4 directions mein DFS
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}
