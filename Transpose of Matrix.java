class Solution
{
    public void transpose(int n,int a[][])
    {
        for(int i=0; i<=n-2; i++){
            for(int j=i+1; j<n; j++ ){
              int temp = 0;
              temp = a[i][j];
              a[i][j] = a[j][i];
              a[j][i] = temp;
            }
        }
    }
}
