class Solution 
{
    static int longestSubsequence(int size, int arr[])
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<size;i++){
            hs.add(arr[i]);
        }
        int k=0;
        int arr2[]= new int[hs.size()];
        for(int num:hs){
            arr2[k++]=num;
        }
        Arrays.sort(arr2);
        int n=arr.length;
        int m=arr2.length;
        int dp[][]= new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr[i-1]==arr2[j-1]){
                    dp[i][j]= dp[i-1][j-1]+1;
                }else{
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}
