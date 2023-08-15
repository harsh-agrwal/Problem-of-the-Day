class Solution {
    public static int maxOnes(int a[], int n) {
        // Your code goes here
        int zero=0;
        int one=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0){
                zero++;
            }
            else{
                one++;
                zero--;
            }
              max=Math.max(max,zero);
           if(zero<0){
                zero=0;
            }
        }
        return one+max;
    }
}
