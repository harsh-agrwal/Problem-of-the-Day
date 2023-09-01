class Tree
{
    public static void printCorner(Node root)
    {
        Deque<Node> dq = new ArrayDeque<>();
        System.out.print(root.data+" ");
        dq.add(root);
        while(!dq.isEmpty()){
            int k = dq.size();
            for(int i=0;i<k;i++){
                Node n = dq.pollFirst();
                if(n.left!=null) dq.add(n.left);
                if(n.right!=null) dq.add(n.right);
            }
            if(dq.size()>=2){
                System.out.print(dq.peekFirst().data+" ");
                System.out.print(dq.peekLast().data+" ");
            }
            if(dq.size()==1){
                System.out.print(dq.peekFirst().data+" ");
            }
        }
    }
}
