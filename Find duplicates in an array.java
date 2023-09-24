class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        TreeSet<Integer> a = new TreeSet<>();
        HashSet<Integer> b = new HashSet<>();
        for(int i : arr)
        {
            if(!b.add(i))
            {
                a.add(i);
            }
        }
        
        if(a.isEmpty())
        {
            a.add(-1);
        }
        return new ArrayList<>(a);
    }
}
