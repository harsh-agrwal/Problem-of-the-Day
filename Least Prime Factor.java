class Solution
{
    public int[] leastPrimeFactor(int n)
    {
        // code here
        int ans[] = new int[n+1];
        ArrayList<Integer> primeNoList = new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                primeNoList.add(i);
            }
        }
        
        for(int i=0;i<=n;i++){
            if(i==0)
                ans[i]=0;
            else if(i==1)
                ans[i]=1;
            else {
                int j=0;
                while(j<primeNoList.size() && i%primeNoList.get(j)!=0){
                    j++;
                }
                ans[i] = primeNoList.get(j);
            }
        }
        
        return ans;
    }
    
    public static boolean isPrime(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
