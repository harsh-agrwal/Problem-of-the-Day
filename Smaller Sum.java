class Solution
{
    public long[] smallerSum(int n,int arr[])
    {
        HashMap <Long, Long> map = new HashMap<>();
        long sum = 0;
        long [] finalArr = new long [n];
        
        for(int i = 0; i<n; i++){
            finalArr[i] = arr[i];
        }
        
        Arrays.sort(finalArr);
        map.put(finalArr[0],0l);
        
        for(int i = 1; i<n; i++){
            
            sum += finalArr[i-1];
            if(!map.containsKey(finalArr[i])){
                map.put(finalArr[i], sum);
            }
        }
        
        for(int i = 0; i<n; i++){
            finalArr[i] = map.get((long)arr[i]);
        }
        return finalArr;
    }
}
