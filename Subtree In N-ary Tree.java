class Solution{
    HashMap<String,Integer> hm;
    public int duplicateSubtreeNaryTree(Node root){
        this.hm = new HashMap<>();
        int dub = 0;
        dub(root);
        for(Map.Entry<String , Integer> en : hm.entrySet()){
            if(en.getValue()>1){
                dub+=1;
            }
        }
        return dub;
    }
    private String dub(Node root){
        String s = ""+root.data+"+";
        
        for(int i = 0 ; i < root.children.size() ; i++){
            Node nd = root.children.get(i);
            s+=i+"-"+dub(nd)+"-";
        }
        hm.merge(s,1,Integer::sum);
        return "("+s+")";
    }
    
}
