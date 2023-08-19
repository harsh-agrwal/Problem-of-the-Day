class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> list= new ArrayList<>();
        int i=0, j=0, sum = 0;
        while(j<n && i<=j){
            while(j<n && sum<s){
                sum = sum + arr[j++];
            }
            while(i<=j && sum>s){
                sum = sum-arr[i++];
            }
            if(sum==s){
                if(i==0 && j==0) break;
                list.add(i+1);
                list.add(j);
                break;
            }
        }
        if(list.size()==0) list.add(-1);
        return list;
    }
}
