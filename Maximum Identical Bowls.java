class Solution {
    public static int getMaximum(int N, int[] arr) {
        // code here
        long s=0;
        for(int i=0;i<N;i++){
            s+=arr[i];
        }
        while(s%N!=0){
            N--;
        }
        return N;
    }
}
