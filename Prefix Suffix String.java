class Solution
{
    public int prefixSuffixString(String s1[],String s2[])
    {
        int count = 0;
        for (String s : s2) {
            for (String t : s1) {
                if (t.startsWith(s) || t.endsWith(s)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
