class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        //sort 
        Arrays.sort(arr, (a, b) -> Integer.compare(b.profit, a.profit));
        
        //store deadlines
        Map<Integer, Integer> map=new HashMap<>();
        int totalProfits=0;
        int totalJobs=0;
        
        for(int i=0; i<n; i++){
            int profit=arr[i].profit;
            int deadline=arr[i].deadline;
            
            for(int j=deadline; j>=1; j--){
                //check if deadline is stored
                if(map.containsKey(j)==false){
                    totalProfits=totalProfits+profit;
                    totalJobs=totalJobs+1;
                    
                    map.put(j, 1);
                    break;
                }
            }
        }
        
        //make res
        int[] res=new int[2];
        res[0]=totalJobs;
        res[1]=totalProfits;
        
        return res;
        // Your code here
    }
}
