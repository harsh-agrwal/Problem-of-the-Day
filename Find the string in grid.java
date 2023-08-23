class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {
        // Code here
        int m=grid.length;
        int n=grid[0].length;
        ArrayList<int[]> ar=new ArrayList<>();
        int[] drow={-1,-1,0,1,1,1,0,-1};
        int[] dcol={0,1,1,1,0,-1,-1,-1};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==word.charAt(0)){
                    for(int k=0;k<8;k++){
                       if(istrue(i,j,drow[k],dcol[k],word,grid,0)){
                        ar.add(new int[]{i,j});
                        break;
                    } 
                    }
                    
                }
            }
        }
        int s=ar.size();
        int[][] ans=new int[s][2];
        int i=0;
        for(int[] it:ar){
          ans[i++]=it;
        }
        return ans;
    }
        boolean istrue(int i,int j,int dr,int dc,String word,char[][] grid,int ind){
            
           if(ind==word.length())return true;
           int m=grid.length;
           int n=grid[0].length;
           if(i<0 || j<0 || i>=m || j>=n)return false;
           if(word.charAt(ind)!=grid[i][j])return false;
           else if(istrue(i+dr,j+dc,dr,dc,word,grid,ind+1)){
               return true;
           }
           return false;
        }
}
