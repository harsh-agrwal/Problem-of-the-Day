class Solution {
    
    public void Rearrange(int a[], int n)
    {
        // Your code goes here
        int temp[] = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] < 0) {
                temp[k++] = a[i];
            }
        }
        for(int i = 0; i < n; i++) {
            if(a[i] >= 0) {
                temp[k++] = a[i];
            }
        }
        for(int i = 0; i < n; i++) {
            a[i] = temp[i];
        }
    }
}
