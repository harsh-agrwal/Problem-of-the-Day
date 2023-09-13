class Solution{
    static String findLargest(int N, int S){
        // code here
        if(N>1 && S==0)
        return "-1";
        StringBuffer ans=new StringBuffer("");
        for(int i=0;i<N;i++){
            if(S>=9){
                ans.append('9');
                S-=9;
            }
            else{
                ans.append(S);
                S=0;
            }
        }
        if(S>0)
        return "-1";
        return ans.toString();
    }
}
