
import java.util.*;

class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

       // return topDown(n, dp);
       //return topUp(n);
       return opti(n);
    }
    //Top Down Approach
    public int topDown(int n, int[] dp) {

        // Base cases
        if (n == 0) return 1;
        if (n < 0) return 0;

        // Already calculated
        if (dp[n] != -1) {
            return dp[n];
        }

        // Recurrence relation
        return dp[n] = topDown(n - 1, dp)
                     + topDown(n - 2, dp);
    }
    //Top Up Approach
   
    public int topUp(int n) {

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
    public int opti(int n){
        
        if(n == 0) return 1;
        if(n <= 2) return n;

        int first = 1;
        int sec = 1;
        for(int i = 2; i <= n; i++){
           int res = first + sec;
           first = sec;
           sec = res;

        }
        return sec;
    }

}
