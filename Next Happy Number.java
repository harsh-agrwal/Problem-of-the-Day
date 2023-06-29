class Solution{
    static int nextHappy(int N){
        while(true){
            if(isHappy(++N)) return N;
        }
    }
    
    static boolean isHappy(int n){
        if(n>9){
            int res = 0;
            while(n>0){
                res+= (n%10)*(n%10);
                n/=10;
            }
            return isHappy(res);
        }
        
        if(n == 7 || n == 1) return true;
        else return false;
      
    }
}
