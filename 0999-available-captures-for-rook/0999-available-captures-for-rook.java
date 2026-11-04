class Solution {
    public int numRookCaptures(char[][] board) {
        int r = 0, c=0;
        int count = 0;
        for(int i = 0; i<8; i++){
            for(int j = 0; j < 8; j++){
                if(board[i][j] == 'R'){
                    r = i;
                    c = j;
                }
            }
        }
        int[][] dir = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };
        for(int[] d  : dir){
            int i = r;
            int j = c;

            
            while (true) {
                i += d[0];
                j += d[1];

                if (i < 0 || i >= 8 || j < 0 || j >= 8)
                    break;

                if (board[i][j] == 'B')
                    break;

                if (board[i][j] == 'p') {
                    count++;
                    break;
                }
            }
        }
        return count;
        
    }
}