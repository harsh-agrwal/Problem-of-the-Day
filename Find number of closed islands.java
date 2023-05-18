class Solution
{
    public int closedIslands(int[][] matrix, int n, int m)
    {
        int count = 0;
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if( !visited[i][j] && matrix[i][j]==1 && DFS(i,j,matrix,visited,n,m) )
                    count++;
        return count;
    }
    boolean DFS(int i,int j,int[][] matrix,boolean[][] visited,int n,int m){
        if(i>=n-1 || i==0 || j>=m-1 || j==0)
            return false;
        visited[i][j] = true;   
        boolean flag = true;
        if(matrix[i-1][j]==1 && !visited[i-1][j])
            flag &= DFS(i-1,j,matrix,visited,n,m);
        if(matrix[i+1][j]==1 && !visited[i+1][j])
            flag &= DFS(i+1,j,matrix,visited,n,m);
        if(matrix[i][j-1]==1 && !visited[i][j-1])
            flag &= DFS(i,j-1,matrix,visited,n,m);
        if(matrix[i][j+1]==1 && !visited[i][j+1])
            flag &= DFS(i,j+1,matrix,visited,n,m);
        return flag;    
    }
}
