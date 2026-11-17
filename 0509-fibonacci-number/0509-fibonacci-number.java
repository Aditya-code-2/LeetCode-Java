class Solution {
    public int fib(int n) {
       /* if(n == 1 || n == 0){
            return n;
        }
        return fib(n-1) + fib(n-2);*/
      // int dp[] = new int[n+1];
       //Arrays.fill(dp, -1);
        //return fibMemo(n, dp);
        return fiboOpti(n);
        
    }
    //DP memoization
    public  int fibMemo(int n, int[] dp) {

        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = fibMemo(n - 1, dp) + fibMemo(n - 2, dp);

        return dp[n];
    }
    //DP Optimal subStructure
    public int fiboOpti(int n){
        int dp[] = new int[n+1];
        if(n == 0 || n == 1) return n;

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i < dp.length; i++){
            dp[i] = dp[i-1] + dp[i - 2];
        }
        return dp[n];
    }
  
}