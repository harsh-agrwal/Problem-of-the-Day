class Solution {
    private static int[][][] dp;
    private static boolean solve(int idx, int k, int target, int[] coins) {
        if (k == 0 && target == 0)
            return true;
        if (idx == coins.length || k == 0)
            return false;
        if (dp[idx][k][target] != -1)
            return dp[idx][k][target] == 1;
        for (int i = 1;; i++) {
            if (k - i < 0 || (coins[idx] * i > target))
                break;
            if (solve(idx + 1, k - i, target - (coins[idx] * i), coins)) {
                dp[idx][k][target] = 1;
                return true;
            }
        }
        dp[idx][k][target] = solve(idx + 1, k, target, coins) ? 1 : 0;
        return dp[idx][k][target] == 1;
    }
    public static boolean makeChanges(int N, int K, int target, int[] coins) {
        dp = new int[N][K + 1][target + 1];
        for (int[][] x : dp) {
            for (int[] y : x) {
                Arrays.fill(y, -1);
            }
        }
        return solve(0, K, target, coins);
    }
}
