class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        int non_zero = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                non_zero++;
            }
        }
        int pos = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[pos] = arr[i];
                pos++;
            }    
        }
        for(int i=non_zero;i<n;i++){
            arr[i] = 0;
        }
    }
}
