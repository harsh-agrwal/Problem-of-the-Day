class Solution {
    public static ArrayList<Character> easyTask(int n,String s,int q,query queries[])
    {
        StringBuilder sb = new StringBuilder(s);
        ArrayList<Character> list = new ArrayList<>();
        PriorityQueue<Character> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i< queries.length; i++){
            query Q = queries[i];
            if(Q.type == "1"){
                sb.setCharAt(Integer.valueOf(Q.a), Q.b.charAt(0));
            }else{
                int left = Integer.valueOf(Q.a);
                int right = Integer.valueOf(Q.b);
                int k = Integer.valueOf(Q.c);
                String substr = sb.substring(left, right+1);
                int [] arr= new int[26];
                for(int ind=left; ind<= right; ind++) arr[sb.charAt(ind)-'a']++;
                for(int ind=25; ind>=0; ind--){
                    k-= arr[ind];
                    if(k<=0) {
                        list.add((char)(ind+'a'));
                        break;
                    }
                }
                
            }
        }
        return list;
    }
}

class query
{
    String type;
    String a;
    String b;
    String c;
    public query(String type,String a,String b,String c)
    {
        this.type=type;
        this.a=a;
        this.b=b;
        this.c=c;
    }
}
