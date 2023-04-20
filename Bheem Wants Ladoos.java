class Solution{
    static Node search(Node root,int home)
    {
        if(root==null)return null;
        if(root.data==home) return root;
        
        Node l=search(root.left,home);
        if(l!=null)return l;
        Node r=search(root.right,home);
        return r;
    }
    static void CreateConnection(Node root,HashMap<Node,Node> parent,Node p)
    {
        if(root==null)return;
        parent.put(root,p);
        CreateConnection(root.left,parent,root);
        CreateConnection(root.right,parent,root);
    }
    static int ladoos(Node root, int home, int k)
    {
        Node target = search(root,home);
        HashMap<Node,Node> parent= new HashMap<>();
        CreateConnection(root,parent,null);
        HashSet<Node> visited= new HashSet<>();
        int Sum=0;
        Queue<Node>q= new LinkedList<>();
        q.add(target);
        visited.add(target);
        while(q.size()>0)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node temp= q.poll();
                Sum+=temp.data;
                if(temp.left!=null && !visited.contains(temp.left))
                {
                    q.add(temp.left);
                    visited.add(temp.left);
                }
                if(temp.right!=null && !visited.contains(temp.right))
                {
                    q.add(temp.right);
                    visited.add(temp.right);
                }
                if(parent.get(temp)!=null &&!visited.contains(parent.get(temp)))
                {
                    q.add(parent.get(temp));
                    visited.add(parent.get(temp));
                }
            }
            k--;
            if(k<0)break;
        }
        return Sum;
    }
}
