class Solution{
    static String longestPalin(String S){
        // code here
        if (s == null || s.length() < 2) {
            return s;
        }
        int start = 0; 
        int maxLength = 1; 
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2); 
            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + maxLength);
    }
    private static int expandAroundCenter(String s, int left, int right) {
        int L = left;
        int R = right;
        
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
