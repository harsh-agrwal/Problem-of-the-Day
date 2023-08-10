class Solution{
    static long largestPrimeFactor(int N) {
        int max=0;
        if(isprime(N))
        {
            return N;
        }
        while (N%2==0) {
            max= 2;
            N/=2;
        }
        for(int i=3;i<=N;i+=2)
        {
            if(N%i==0)
            {
            if(isprime(i))
            {
                    max=i;
            }
            N=N/i;
            }
        }
        return max;
    }
    public static boolean isprime(int n)
    {
        int j=(int )Math.sqrt(n);
        for(int i=2;i<=j;i++)
        {
            if(n%i==0)
            {
                return false;
                
            }
        }
        return true;
    }
}
