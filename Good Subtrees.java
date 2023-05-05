class Solution
{   int ans = 0;
    public  int goodSubtrees(Node root,int k)
    {
        solve(root, k);
        return ans;
    }
    
     HashSet<Integer> solve(Node root,int k){
        
        HashSet<Integer> set = new HashSet<>();
        if(root.left!= null) {
             set.addAll(solve(root.left,  k));
        }
        
        if(root.right!= null){
            set.addAll(solve(root.right,  k));
        }
        set.add(root.data);
      
        if(set.size()<= k) ans++;
        return set;
    }
}
