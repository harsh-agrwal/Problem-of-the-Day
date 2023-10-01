class Solution
{
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        ArrayList<Integer> ayu= new ArrayList<Integer>();
        int a=0;
        int b=0;
        if(n==1)
        {
             for(int j=0;j<m;j++)
        {
            ayu.add(matrix[0][j]);
        }
        return ayu;
        }
        if(m==1)
        {
             for(int j=0;j<n;j++)
        {
            ayu.add(matrix[j][0]);
        }
        return ayu;
        }
        for(int j=0;j<m;j++)
        {
            ayu.add(matrix[a][j]);
        }
        b=m-1;
        for(int i=1;i<n;i++)
        {
            ayu.add(matrix[i][b]);
        }
        a=n-1;
        for(int j=b-1;j>=0;j--)
        {
             ayu.add(matrix[a][j]); 
        }
          for(int i=a-1;i>0;i--)
        {
             ayu.add(matrix[i][0]); 
        }
return ayu;
    }
}
