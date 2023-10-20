class Solution {
    static int isPossible(int N, int arr[]) {
        // code here

        int rem=0;
        
        for(int i:arr)
        {
            rem+=i%3;
        }
        
        return rem%3==0?1:0;
    }
}
