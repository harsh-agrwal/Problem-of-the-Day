class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = m - 1;
        int a = -1, b = -1;
        while(i<n && j>=0){
            int sum = arr[i] + brr[j];
            int diff = Math.abs(x - sum);
            if(diff < min){
                min = diff;
                a = arr[i];
                b = brr[j];
            }
            if(sum > x)
            j--;
            else if(sum < x)
            i++;
            else
            break;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);
        return ans;
    }
}
