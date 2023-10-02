class Solution {
    int mod = 1000000007;
    int distinctSubsequences(String S) {
        // code here
         int ans = 1;
        Map<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (mp.containsKey(c)) {
                int temp = ans;
                ans = ((ans * 2) % mod - mp.get(c) + mod) % mod;
                mp.put(c, temp);
            } else {
                mp.put(c, ans);
                ans = (ans * 2) % mod;
            }
        }

        return ans;
    }
}
