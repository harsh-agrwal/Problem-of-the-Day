class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        if(m>n)
            return -1;
        if(n==0 || m==0){
            return 0;
        }
        Collections.sort(a);
        long min_diff=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            long diff=a.get(i+m-1)-a.get(i);
            if(diff<min_diff){
                min_diff=diff;
            }
        }
        return min_diff;
    }
}
