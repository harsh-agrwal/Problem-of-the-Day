class Solution {
    public static int arrayOperations(int n, int[] arr) {
        int count=0;
        int left=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                if(i-left>1) count++;
                left=i;
            }
        }
        if(left==-1) return -1;
        return (left==n-1)?count:count+1;
        // code here
    }
}
