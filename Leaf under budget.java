class Solution{
    ArrayList<Integer>al;
    public int getCount(Node node, int bud)
    {
        int cnt=0;
        al=new ArrayList<Integer>();
        vis_leaf(node,0);
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            if(bud-al.get(i)>=0){
                cnt++;
                bud-=al.get(i);
                
            }
            else return cnt;
        }
        return cnt;
    }
    void vis_leaf(Node node,int level){
        if(node==null)return;
        level++;
        if(node.left==null && node.right==null){
            al.add(level);
            return;
        }
        vis_leaf(node.left,level);
        vis_leaf(node.right,level);
    }
}
