class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {
        int sum = 0;
        int count = 0;
        for(int i = 0;i < arr.length ; i++){
            sum = (arr[i] * start)%100000;
            start = sum;
            count++;
             if(start == end) break;
        }
        return count;
    }
}
