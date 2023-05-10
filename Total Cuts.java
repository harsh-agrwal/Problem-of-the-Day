class Solution {
    public static int totalCuts(int N, int K, int[] A) {
        // code here
        int count=0;
       int left[]=new int[N];
       int right[]=new int[N];
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<N;i++)
       {
           max=Math.max(max,A[i]);
           left[i]=max;
       }
       for(int i=N-1;i>=0;i--)
       {
           min=Math.min(min,A[i]);
           right[i]=min;
       }
       for(int i=0;i<N-1;i++)
           if((left[i]+right[i+1])>=K)
           count++;
       return count;
        
    }
}
