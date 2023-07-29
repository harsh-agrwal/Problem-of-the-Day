class Tree
{
    public static void inorder(Node root,ArrayList<Integer> arr)
    {
        if(root == null )
            return;
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public static float findMedian(Node root)
    {
        ArrayList<Integer> arrList= new ArrayList<Integer>();
        inorder(root,arrList);
        int size = arrList.size();
        int mid,mid_index;
        if(size % 2 != 0)
        {
            mid_index = size/2;
            mid = arrList.get(mid_index);
            return (float)mid;
        }
        else if(size % 2 == 0)
            {
                int mid_l_index=(size/2)-1;
                int mid_r_index=size/2;
                float mid_val1=arrList.get(mid_l_index);
                float mid_val2=arrList.get(mid_r_index);
                return (float)((mid_val1+mid_val2)/2);
                
            }
        return -1; 
    }
}
