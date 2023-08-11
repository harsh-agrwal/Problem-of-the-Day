class Solution {
    static long f(int i,int j,int sum,int[] coins,long[][] dp){
        if(i<0) return 0;
        if(j==0) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        long nottake = f(i-1,j,sum,coins,dp);
        long take = 0;
        if(coins[i]<=sum){
            take = f(i,j-coins[i],sum-coins[i],coins,dp);
        }
        return dp[i][j] = take + nottake;
    }
    public long count(int coins[], int n, int sum) {
        long[][] dp = new long[n][sum+1];
        for(long[] row : dp) Arrays.fill(row,-1);
        return f(n-1,sum,sum,coins,dp);
    }
}
