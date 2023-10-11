class Tree
{
    int height(Node root){
        if(root==null)
        return 0;
        else{
            int r=height(root.right);
            int l=height(root.left);
            if(r>l)
            return 1+r;
            else
            return 1+l;
        }
    }
    boolean isBalanced(Node root)
    {
	    if(root==null)
	    return true;
	    else{
	        if (Math.abs(height(root.left)-height(root.right))>1)
	        return false;
	        else
	        return isBalanced(root.left) && isBalanced(root.right);
	    }
    }
}
