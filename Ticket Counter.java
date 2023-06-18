class Solution {
    public static int distributeTicket(int N,int K)
    {
        Deque<Integer>q=new LinkedList<>();
        for(int i=1;i<=N;i++)
        q.addLast(i);
        int t=0;
        int ans=0;
        while(q.size()>1){
            if(t==0){
                int in=0;
                while(q.size()>1 && in<K){
                    ans=q.pollFirst();
                    in++;
                }
            }
            else{
                int in=0;
                while(q.size()>1 && in<K){
                    ans=q.pollLast();
                    in++;
                }
            }
            t^=1;
        }
        return q.pollFirst();
    }
}
