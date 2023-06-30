class Solution {
    int isDivisible(String s) {
        // code here
        int e=0,o=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!='0')
            {
                if(i%2==0)
                   o++;
                   else e++;
            }
        }
        int k=e-o;
        if(k%3==0) return 1;
        else return 0;
    }
}
