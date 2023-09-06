class Solution
{
    public void dfs(int node, ArrayList<ArrayList<Integer>>adj, boolean[] vis){
        vis[node] = true;
        for(Integer it: adj.get(node)){
            if(!vis[it]){
                dfs(it, adj, vis);
            }
        }
    }
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        boolean[] vis = new boolean[V];
        int ans  = -1;
        for(int i=0; i<V; i++){
            if(vis[i] == false){
                dfs(i,adj,vis);
                ans = i;
            }
        }
        Arrays.fill(vis, false);
        dfs(ans, adj, vis);
        
        for(int i=0; i<V; i++){
            if(!vis[i]) return -1;
        }
        return ans;
    }
}
