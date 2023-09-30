class Solution
{
    void booleanMatrix(int m[][])
    {
        int r = m.length;
        int c = m[0].length;
        int row[] = new int[m.length];
        int col[] = new int[m[0].length];
        
        //check row and column.
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j] == 1){
                    row[i] = 1;
                    col[j] = 1;
                }        
            }
        }
        
        //fill row's 
        for(int i=0;i<r;i++){
            if(row[i] == 1){
                for(int j=0;j<c;j++){
                    m[i][j] = 1;
                }
            }
        }
        
        //fill column's
        for(int j=0;j<c;j++){
            if(col[j] == 1){
                for(int i=0;i<r;i++){
                    m[i][j] = 1;
                }
            }
        }
        
    }
}
