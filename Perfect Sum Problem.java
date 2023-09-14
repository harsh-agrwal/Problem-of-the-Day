class Solution{
    long count = 0 ;
    public int perfectSum(int arr[],int n, int sum) 
    { 
        int s = 0;  
        for(int i= 0 ;i<n;i++){
            s += arr[i];
        }
        long dp[][] = new long[n+ 1][s+1];
         for(int i= 0 ;i<=n;i++){
           Arrays.fill(dp[i] , -1);
        }
        count  = subset(arr ,  0 , sum , 0 , dp);
        
        return (int) count % (int)(1e9 + 7);
    } 
    public long subset(int arr[] , int i  , int sum , int currsum , long dp[][]){
        if(i == arr.length){
            if(currsum == sum){
                return 1;
            }
            return 0;
        }
        if(dp[i][currsum] != -1)return dp[i][currsum]  % (int)(1e9 + 7);
        long include = subset(arr , i + 1 , sum , currsum + arr[i] , dp);
        long exclude = subset(arr , i + 1 , sum , currsum , dp);
        return dp[i][currsum] = (include + exclude) % (int)(1e9 + 7) ;
    }
}
