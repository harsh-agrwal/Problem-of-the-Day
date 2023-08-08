class Solution {
    public static int countFractions(int n, int[] numerator, int[] denominator) {
       
        HashMap<String,Integer> hm= new HashMap<>();
        int res=0;
        
        int a1,a2;
        String s1,s2;
        
        for(int i=0;i<n;i++){
            
            int gcd= getGcd(numerator[i], denominator[i] );
            
            a1=numerator[i]/gcd;
            a2=denominator[i]/gcd;
            
            s1= a1+"/"+a2;
            s2= (a2-a1)+"/"+a2;
            
            if(hm.containsKey(s2)) res += hm.get(s2);

            hm.put(s1, hm.getOrDefault(s1,0)+1);
  
        }
        
        return res;
    }
    
    public static int getGcd(int i, int j){
        
        if(j==0) return i;
        
        else return getGcd(j,i%j);
   
    }
}
