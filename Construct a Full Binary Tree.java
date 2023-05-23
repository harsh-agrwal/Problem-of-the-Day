class Solution
{
    public Node construct(int l1, int r1, int l2, int r2, int[] pre, int[] preM){
        if(l1==r1 && l2==r2){
            return new Node(pre[l1]);
        }
        int val=pre[l1];
        Node root=new Node(val);
        int m1=(l1+r1+2)/2;
        int m2=(l2+r2+2)/2;
        root.left=construct(l1+1, m1-1, m2, r2, pre, preM);
        root.right=construct(m1, r1, l2+1, m2-1, pre, preM);
        return root;
    }
    public Node constructBTree(int pre[], int preM[], int size)
    {
        return construct(0, size-1, 0, size-1, pre, preM);
    }
}
