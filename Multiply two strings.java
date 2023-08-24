class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }
        
        boolean isNeg = false;
        
        if(s1.charAt(0) == '-') {
            s1 = s1.substring(1);
            isNeg = !(isNeg);
        }
        
        if(s2.charAt(0) == '-') {
            s2 = s2.substring(1);
            isNeg = !(isNeg);
        }

        int len1 = s1.length();
        int len2 = s2.length();
        int[] result = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            int digit1 = s1.charAt(i) - '0';
            
            for (int j = len2 - 1; j >= 0; j--) {
                int digit2 = s2.charAt(j) - '0';
                int product = digit1 * digit2 + result[i + j + 1];
                
                result[i + j + 1] = product % 10;
                result[i + j] += product / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            sb.append(digit);
        }

        String ans = sb.toString().replaceFirst("^0+(?!$)", "");
        if(isNeg) ans = "-"+ans;
        return ans;
    }
}
