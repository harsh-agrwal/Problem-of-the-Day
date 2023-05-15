class Solution {
    public static long countBits(long N) {
        long count=0;
        for(long i=1;i<=N;i++){
            count+=setBits(i);
        }
        return count;
    }
    public static long setBits(long num) {
        int count = 0;
      while (num > 0){
         num &= (num - 1);
         count++;
      }
      return count;
        // code here
    }
}
