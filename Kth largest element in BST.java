class Solution
{
    public int kthLargest(Node root,int K)
    {
        ArrayList <Integer> list = new ArrayList<>();
        list = inorder(root, list);
        return list.get(list.size()-K);
    }
    public ArrayList <Integer> inorder(Node root, ArrayList <Integer> list){
        if(root == null){
            return list;
        }
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
        return list;
    }
}
