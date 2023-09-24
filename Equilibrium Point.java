class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n == 1)
        return 1;
        long sum = 0;
        for(int i = 0 ; i < n; i++)
        {
            sum += arr[i];
        }
        long rahee = 0;
        for(int i = 0 ; i<n ; i++)
        {
            rahee += arr[i];
            if(rahee == sum)
            return i + 1;
            
            sum -= arr[i];
        }
        return -1;
    }
}
