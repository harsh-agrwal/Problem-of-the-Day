class Solution
{
    HashMap<Integer,HashSet<Integer>> r;
    HashMap<Integer,HashSet<Integer>> c;
    HashMap<Integer,HashSet<Integer>> g;
     boolean isSafe(int i,int j,int x)
    {
        if(r.get(i).contains(x) || c.get(j).contains(x) || g.get((i/3)*10+(j/3)).contains(x))
        return false;
        return true;
    }
     boolean solve(int grid[][],int i,int j)
    {
        if(i==8 && j==9)
        return true;
        if(j==9)
        {
            i++;
            j=0;
        }
        if(grid[i][j]!=0)
        return solve(grid,i,j+1);
        for(int x=1;x<=9;x++)
        {
            if(isSafe(i,j,x))
            {
                r.get(i).add(x);
                c.get(j).add(x);
                g.get((i/3)*10+(j/3)).add(x);
                grid[i][j]=x;
                if(solve(grid,i,j+1))
                return true;
                r.get(i).remove(x);
                c.get(j).remove(x);
                g.get((i/3)*10+(j/3)).remove(x);
            }
        }
        grid[i][j]=0;
        return false;
    }
     boolean SolveSudoku(int grid[][])
    {
        r=new HashMap<>();
        c=new HashMap<>();
        g=new HashMap<>();
        g.put(0,new HashSet<>());
        g.put(1,new HashSet<>());
        g.put(2,new HashSet<>());
        g.put(10,new HashSet<>());
        g.put(11,new HashSet<>());
        g.put(12,new HashSet<>());
        g.put(20,new HashSet<>());
        g.put(21,new HashSet<>());
        g.put(22,new HashSet<>());
        for(int i=0;i<9;i++)
        {
            r.put(i,new HashSet<>());
            c.put(i,new HashSet<>());
            for(int j=0;j<9;j++)
            {
                if(grid[i][j]!=0)
                r.get(i).add(grid[i][j]);
                if(grid[j][i]!=0)
                c.get(i).add(grid[j][i]);
                if(grid[i][j]!=0)
                g.get((i/3)*10+(j/3)).add(grid[i][j]);
            }
        }
        return solve(grid,0,0);
    }
     void printGrid (int grid[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            System.out.print(grid[i][j]+" ");
        }
    }
}
