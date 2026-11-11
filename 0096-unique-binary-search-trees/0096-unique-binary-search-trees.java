class Solution {
    public int numTrees(int n) {

       /* int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int nodes = 2; nodes <= n; nodes++){
            for(int root = 1; root <= nodes; root++){
                int left = root - 1;
                int right = nodes - root;
                dp[nodes] += dp[left] * dp[right];
            }
        }
        return dp[n];*/
        int ans = 0;
        if(n<=1) return 1;

        for(int i = 1; i <= n; i++){
            ans += numTrees(i-1) * numTrees(n-i);
        }
        return ans;
        
    }
}