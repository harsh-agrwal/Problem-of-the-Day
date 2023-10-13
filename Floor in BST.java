class Solution {
    public static int floor(Node root, int x) {
        int ans = -1;
        while(root != null){
            if(root.data <= x){
                ans = root.data;
                root = root.right;
            }
            else if(root.data > x){
                root = root.left;
            }
        }
        return ans;
    }
}
