class Solution {
    public static int findCatalan(int n) {
        int dp[] =new int[n+1];
        if(n == 0 || n == 1) return 1;
        dp[0] = 1;
        dp[1] = 1;
        int mod= (int)1e9 + 7;
        for(int i=2; i<=n; i++){
            for(int j=0; j<i; j++){
                dp[i] = (dp[i] + (int)( (long)dp[j] * dp[i-1-j]%mod))%mod; 
            }
        }
        return dp[n];
    }
}
