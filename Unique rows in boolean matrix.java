class GfG {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c) {
        HashSet<String> hm = new HashSet<String>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < r; i++) {
            ArrayList<Integer> container = new ArrayList<Integer>();
            String sample = "";
            for (int j = 0; j < c; j++) {
                sample += (char) a[i][j];
                container.add(a[i][j]);
            }
            if (!hm.contains(sample)) {
                ans.add(container);
                hm.add(sample);
            }
        }
        return ans;
    }
}
