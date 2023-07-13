class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.get(arr[i])==null)
            {
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        HashSet<Integer>set=new HashSet<>();
        for(Map.Entry<Integer,Integer>m:map.entrySet())
        {
           if(set.contains(m.getValue())) 
           {
               return false;
           }
           set.add(m.getValue());
        }
        return true;
    }
}
