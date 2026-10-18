//
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int[] dp = new int[n];
        java.util.Arrays.fill(dp,-1);
        return maxloot(n-1,nums,dp);
    }
    public int maxloot(int i,int[] nums,int[] dp){
        if(i==0)
        {
            return nums[0];
        }
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int pick = nums[i] + maxloot(i-2,nums,dp);
        int notpick = maxloot(i-1,nums,dp); 
        dp[i] = Math.max(pick,notpick);
                return dp[i];
    }
}
