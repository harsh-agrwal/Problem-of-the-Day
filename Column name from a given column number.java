class Solution
{
    String colName (long n)
    {
       StringBuilder colnames=new StringBuilder();
       while(n>0){
           long rem=n%26;
           if(rem==0){
               colnames.append("Z");
               n=(n/26)-1;
           }
           else{
               colnames.append((char)((rem-1)+'A'));
               n=n/26;
           }
       }
       String ans=colnames.reverse().toString();
       return ans;
    }
}
