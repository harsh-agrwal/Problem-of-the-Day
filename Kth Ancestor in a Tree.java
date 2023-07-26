class Solution
{
    int num_node = 0;
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        // size of the tree
        length(root);
        
        // parent
        int parent[] = new int[num_node + 1];
        fill_parent(root, parent);
        
        // k moves 
        int cnt = 0;
        while(node != -1) {
            node = parent[node];
            cnt++;
            if(cnt == k) 
            return  node;
        }
        return -1;
    }
    
    void length(Node root) {
        if(root == null) return;
        length(root.right);
        num_node++;
        length(root.left);
    }
    
    void fill_parent(Node root, int parent[]) {
        parent[root.data] = -1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            Node curr = q.poll();
            if(curr.left != null) {
                q.add(curr.left);
                parent[curr.left.data] = curr.data;
            }
            
            if(curr.right != null) {
                q.add(curr.right);
                parent[curr.right.data] = curr.data;
            }
        }
    }
}
