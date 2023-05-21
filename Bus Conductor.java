class Solution {
    public static int findMoves(int n, int[] c, int[] p) {
        // code here
        Arrays.sort(c);
        Arrays.sort(p);
        int count=0;
        for(int i=0;i<n;i++){
            if(c[i]!=p[i]) count+=Math.abs(c[i]-p[i]);
        }
        return count;
    }
}
