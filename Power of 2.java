class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if(n!=0){
       while(n>0){

                if(n%2 !=0 && n!=1)
                    return false;
                else
                    n=n/2;
            }
            return true;
    }
    else
    return false;
    
}
}
