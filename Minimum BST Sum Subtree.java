class Solution {
    static int co=Integer.MAX_VALUE;
    public static int minSubtreeSumBST(int tar, Node root) {
        // code here
        co=Integer.MAX_VALUE;
        // array for returning count and sum.
       int[] c=sol(tar,root);
        return co==Integer.MAX_VALUE ? -1 : co;
    }


    static int[] sol(int t,Node root){


                      //index0-count   1-index-sum     

               if(root==null) return new int[]{0,0};
        //left  number of nodes and number of nodes.
        int[] lsum=sol(t,root.left);


        if(lsum[1]==t){
            if(isBST(root.left,Integer.MIN_VALUE,Integer.MAX_VALUE))
            co=Math.min(lsum[0],co);
        }
         int[] rsum=sol(t,root.right);
           if(rsum[1]==t){
            if(isBST(root.right,Integer.MIN_VALUE,Integer.MAX_VALUE))
            co=Math.min(rsum[0],co);
        }
       
        if((rsum[1]+lsum[1]+root.data)==t){
             if(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
             co=Math.min(rsum[0]+lsum[0]+1,co);
        }
        // System.out.println(lsum[1]+" "+rsum[1]+" "+(rsum[1]+lsum[1]+root.data));
        return new int[]{rsum[0]+lsum[0]+1,(rsum[1]+lsum[1]+root.data)};
    }


     static boolean isBST(Node root,int le,int ri){
       if(root==null) return true;


       //checking if right and left are in the specified range.


       if(root.data<=le || root.data>=ri) return false;
       return isBST(root.left,le,root.data) && isBST(root.right,root.data,ri);
    }
}
