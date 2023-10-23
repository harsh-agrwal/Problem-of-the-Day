class Solution {
    public int maxSumIS(int arr[], int n) {
        int[] dp = new int[n];
       
        // Initialize dp array with the values of the input array arr
        for (int i = 0; i < n; i++) {
            dp[i] = arr[i];
          
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i],dp[j] + arr[i]);
                }
            }
        }
        int maxValue = 0;
        for (int i = 0; i < n; i++) {
            if (maxValue < dp[i]) {
                maxValue = dp[i];
            }
        }
        return maxValue;
    }
}
