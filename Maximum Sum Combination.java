class Solution {
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
     
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0;i<K;i++){
            for(int j=0; j<K;j++){
                list.add(A[N-i-1]+B[N-j-1]);
            }
        }
        Collections.sort(list,Collections.reverseOrder());
        for(int i=0;i<K;i++){
            ans.add(list.get(i));
        }
        
        return ans;
        
    }
}
