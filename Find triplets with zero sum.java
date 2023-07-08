class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
    public boolean findTriplets(int arr[] , int n)
    {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                HashSet<Integer> set=map.get(arr[i]);
                set.add(i);
                map.put(arr[i],set);
            }
            else
            {
                HashSet<Integer> set=new HashSet<>();
                set.add(i);
                map.put(arr[i],set);
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int req=-(arr[i]+arr[j]);
                
                if(map.containsKey(req))
                {
                    
                    if(map.get(req).size()>2)
                    return true;
                    if(!map.get(req).contains(i) && !map.get(req).contains(j))
                    return true;
                    
                    
                }
            }
        }
        return false;
        //add code here.
    }
}
