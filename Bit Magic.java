class Solution {
    public static int bitMagic(int n, int[] arr) {
         int cnt=0;
        for(int i=0;i<n/2;i++)
        {
            if(arr[i]!=arr[n-i-1]){
              cnt++;
            }
        }
        return (cnt+1)/2;
        // code here
    }
}
