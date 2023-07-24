class Solution{
     ArrayList<Integer> rightView(Node node) {
        
        Queue<Node> qq= new LinkedList<>();
        ArrayList<Integer> aa =new ArrayList<>();
        Node dummy= new Node(-1);
        
        qq.add(dummy);
        qq.add(node);
        
        while(!qq.isEmpty()){
            Node x= qq.poll();
            
            if(x==dummy && qq.size()>0){
                qq.add(dummy);
                aa.add(qq.peek().data);
            }
            
            if(x.right!=null) qq.add(x.right);
            if(x.left!=null) qq.add(x.left);
        }
        return aa;
    }
}
