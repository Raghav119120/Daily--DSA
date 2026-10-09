//leetcode t.c ->O(n) s.c->O(n)
 class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        return fibo(n,dp);
    }
    private int fibo(int n,int[] dp){
        if(n == 0) return 0;
        if(n<=2) return 1;
        if(dp[n]!=0)
            return dp[n];
        dp[n] = fibo(n-1,dp)+fibo(n-2,dp)+fibo(n-3,dp);
        return dp[n];
    }
}
