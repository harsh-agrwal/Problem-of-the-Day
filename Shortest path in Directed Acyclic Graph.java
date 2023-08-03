class Solution {

	public int[] shortestPath(int N,int M, int[][] edges) {
		//Code here
		List<Map<Integer,Integer>> l=new ArrayList<>();
		int vis[]=new int[N];
		for(int i=0;i<N;i++){
		    l.add(new HashMap<>());
		    vis[i]=-1;
		}
		
		Map<Integer,Integer> m;
		for(int i[]:edges){
		    m=l.get(i[0]);
		    m.put(i[1],i[2]);
		}
		dfs(0,l,vis,0);
		return vis;
	}
	void dfs(int i,List<Map<Integer,Integer>> g,int vis[],int target){
	    if(vis[i]!=-1){
	        if(target>vis[i]){
	            return;
	        }
	        else{
	            vis[i]=Integer.min(target,vis[i]);
	        }
	    }
	    else{
	        vis[i]=target;
	    }
	    for(Map.Entry<Integer,Integer> mp:g.get(i).entrySet()){
	            dfs(mp.getKey(),g,vis,target+mp.getValue());
	    }
	}
}
