class Solution {
    public static void update(int a[], int n, int updates[], int k)
    {
        // Your code goes here
        int i=0;
        while(i<k){
            int temp = updates[i]-1;
            if(temp < n){
                a[temp] += 1;
            }
            i++;
        }
        int j=1;
        while(j<n){
            a[j] += a[j-1];
            j++;
        }
    }
}
