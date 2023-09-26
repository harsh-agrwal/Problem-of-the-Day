class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int K) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n-3; i++){
            for(int j=i+1; j<n-2; j++){
                int left=j+1,right=n-1;
                while(left<right)
                {
                    if(arr[i]+arr[j]+arr[left]+arr[right]==K)
                    {
                        ArrayList<Integer> temp=new ArrayList<Integer>(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        if(!ans.contains(temp))
                            ans.add(temp);
                        left++;
                        right--;
                    }
                    else if(arr[i]+arr[j]+arr[left]+arr[right]<K)
                        left++;
                    else
                        right--;
                }
            }
        }
        return ans;
    }
}
