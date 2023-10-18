class Solution {
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
        List<Integer> res=new ArrayList<>();
        boolean[] visit=new boolean[V];
        for(int i=0;i<V;i++){
            if(!isCycle(i,adj,visit)){
                res.add(i);
            }
        }
        return res;
    }
    private static boolean isCycle(int source,List<List<Integer>> adj,boolean[] visit){
       
        visit[source]=true;
        
        for(Integer it:adj.get(source)){
            if(!visit[it]){
                if(isCycle(it,adj,visit)) return true;
            }else return true;
    
        }
        visit[source]=false;
        return false;
    }
}
