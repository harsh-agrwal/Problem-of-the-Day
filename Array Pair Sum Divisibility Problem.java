class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        
        int n = nums.length;
        if(n%2 ==1 ){
            return false;
            
        }
        int freq[] = new int[k];
        for (int i : nums) {
            int y = i % k;
            if (freq[(k - y) % k] != 0)
                freq[(k - y) % k]--;
            else
                freq[y]++;
        }
        for (int i : freq) {
            if (i != 0)
                return false;
        }
        return true;
        
    }
}
