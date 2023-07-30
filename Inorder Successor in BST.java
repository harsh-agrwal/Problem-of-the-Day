class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public static void inorder(Node root,ArrayList<Node> arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
    }
    public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
              ArrayList<Node> arr= new ArrayList<>();
              inorder(root,arr);
              int i=arr.indexOf(x);
              if(i==arr.size()-1){
                  return new Node(-1);
              }else{
                  return arr.get(i+1);
              }
         }
}
