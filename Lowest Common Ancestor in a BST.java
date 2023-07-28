class BST
{   
    Node LCA(Node root, int n1, int n2)
	{
	    int min = Math.min(n1, n2);
	    int max = Math.max(n1,n2);
        if(root.data > n1 && root.data < n2)
            return root;
        else if(root.data > max)
        {
            return LCA(root.left, n1, n2);
        }
        else if(root.data < min)
            return LCA(root.right, n1, n2);
        else
            return root;
    }
}
