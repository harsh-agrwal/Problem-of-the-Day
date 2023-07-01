 class Solution {
    static int setBits(int N) {
        // code here
        int count = 0;
        while (N > 0) {
            if (N % 2 == 1) {
                count++;
            }
            N = N / 2;
        }
        return count;
    }
}
