class Solution{

    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int grid[][])
    {
		for(int k=0;k<grid.length;k++) {
			for(int i=0;i<grid.length;i++) {
				for(int j=0;j<grid.length;j++) {
					if(i == j) {
						grid[i][j] = 1;
					}
					if((grid[i][k]==1 && grid[k][j]==1) && grid[i][j] == 0) {
						grid[i][j] = 1;
					}
				}
			}
		}
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		ArrayList<Integer> list ;
		for(int i=0;i<grid.length;i++) {
			list = new ArrayList<>();
			for(int j=0;j<grid[0].length;j++) {
				list.add(grid[i][j]);
			}
			ans.add(list);
		}
		return ans;
    }
}
