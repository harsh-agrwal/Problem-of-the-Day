class Solution 
{ 
    boolean wifiRange(int N, String S, int X) 
    { 
        // code here
         int count=X;
        int i=N-1;
        //check if range is going out from last like 001100000000000000
        while(i>=0&&S.charAt(i)=='0')
        {
            count--;
            if(count<0)
            return false;
            i--;
        }
        //for middle array like 1000000001
        for(;i>=0;i--)
        {
            if(S.charAt(i)=='0')
            {
                count--;
            }
            if(S.charAt(i)=='0'&&count<(X*-1))
            {
                return false;
            }
            else if(S.charAt(i)=='1') {
                count=X;
            }
        }
        //starting part like 000000001111
        if(count<(0))
        return false;
        
    return true;
    }
} 
