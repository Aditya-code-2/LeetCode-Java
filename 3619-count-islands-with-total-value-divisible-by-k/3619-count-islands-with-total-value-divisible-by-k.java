class Solution {
    int row, col;
    long sum;

    public int countIslands(int[][] grid, int k) {
        row = grid.length;
        col = grid[0].length;
        int count = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] > 0){
                    sum = 0;

                    dfs(grid, i, j);

                    if(sum % k == 0){
                        count++;
                    }
                }
            }
        }
        return count;
        
    }
    void dfs(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == 0){
            return;
        }

        sum += grid[i][j];
        grid[i][j] = 0;

        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);

    }
   
}