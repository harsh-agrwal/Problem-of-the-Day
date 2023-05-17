class Solution{
    static int isPossible(int n, int m, String s){
        // code here
        int imin=0;
        int imax=0;
        int jmin=0;
        int jmax=0;        
        int di=0;
        int dj=0;
        int len=s.length();
        for(int i=0; i<len; i++){
            char move=s.charAt(i);
            if(move=='L') dj--;
            else if(move=='R') dj++;
            else if(move=='U') di++;
            else di--;
            imin=Math.min(imin, di);
            imax=Math.max(imax, di);
            jmin=Math.min(jmin, dj);
            jmax=Math.max(jmax, dj);
        }
        if(Math.abs(imax-imin+1)<=n && Math.abs(jmax-jmin+1)<=m){
            return 1;
        }
        return 0;
    }
}
