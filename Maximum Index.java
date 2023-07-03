class Solution {
    int maxIndexDiff(int arr[], int n) {
        int [] maxarr = new int[n];
        int [] minarr = new int[n];
        minarr[0] = arr[0];
        maxarr[n-1] = arr[n-1];
        for(int i=1; i<n; i++) minarr[i] = Math.min(minarr[i-1], arr[i]);
        for(int i=n-2; i>=0; i--) maxarr[i] = Math.max(arr[i], maxarr[i+1]);
        int i=0,j=0;
        int diff=-1;
        while(i<n && j<n){
            if(minarr[i] <= maxarr[j]){
                diff = Math.max(diff, j-i);
                j++;
               
            }else i++;
        }
        return diff;
    }
}
