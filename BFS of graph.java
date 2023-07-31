class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer>q=new LinkedList<>();
        ArrayList<Integer>list=new ArrayList<>();
        boolean visited[]=new boolean[v];
        q.add(0);
        list.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int curr=q.remove();
            for(int i=0;i<adj.get(curr).size();i++){
                int neighbor=adj.get(curr).get(i);
                if(visited[neighbor]==false){
                    q.add(neighbor);
                    list.add(neighbor);
                    visited[neighbor]=true;
                }
            }
        }
        return list;
    }
}
