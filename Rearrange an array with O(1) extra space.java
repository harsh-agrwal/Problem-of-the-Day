class Solution
{
    static void arrange(long arr[], int n)
    {
        // your code here
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=arr[i];
        }
        for(int j=0;j<n;j++){
            arr[j]=a[(int)a[j]];
        }
    }
}
