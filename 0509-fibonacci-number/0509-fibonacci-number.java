class Solution {
    public int fib(int n) {
       /* if(n == 1 || n == 0){
            return n;
        }
        return fib(n-1) + fib(n-2);*/
       int dp[] = new int[n+1];
       Arrays.fill(dp, -1);
        return fibMemo(n, dp);

        
    }
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
  
}