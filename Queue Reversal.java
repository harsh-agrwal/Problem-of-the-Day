class GfG{
    public Queue<Integer> rev(Queue<Integer> q){
        public  void reverse(queue<Integer> q) 
           if (q.size() == 0) 
           return ;
           int fr = q.peek();
           q.remove();
           rev(q);
           q.add(fr);
    }
    return q;
}
