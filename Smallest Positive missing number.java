class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int n)
    {
        // Your code here
        boolean vis[] = new boolean[n+1];
         for(int i=0;i<n;i++){
             if(arr[i]>0 && arr[i]<=n){
                    vis[arr[i]] = true;
             }
         }
         for(int i = 1;i<=n;i++){
             if(!vis[i])
             return i;
         }
         return n+1;
    }
}
