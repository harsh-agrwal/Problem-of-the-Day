class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n){
        if(n==1) return 1L;
        
        int[] dp=new int[n+1];
        dp[0]=1;
        
        int mod=1000000007;
        
        for(int i=1;i<=n;i++){
            int one=dp[i-1];
            int two=0,three=0;
            if(i>=2) two=dp[i-2];
            if(i>=3) three=dp[i-3];
            dp[i]=((one%mod+two%mod)%mod+three%mod)%mod;
        }
        
        return dp[n];
    }
}
