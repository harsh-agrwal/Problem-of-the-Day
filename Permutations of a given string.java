class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        char[] chars = S.toCharArray();
        Set<String> uniquePermutations = new HashSet<>();
        generatePermutations(chars, 0, uniquePermutations);
        List<String> sortedPermutations = new ArrayList<>(uniquePermutations);
        sortedPermutations.sort(null);
        return sortedPermutations;
    }

    private static void generatePermutations(char[] chars, int start, Set<String> uniquePermutations) {
        if (start == chars.length) {
            uniquePermutations.add(new String(chars));
            return;
        }

        for (int i = start; i < chars.length; i++) {
            swap(chars, start, i);
            generatePermutations(chars, start + 1, uniquePermutations);
            swap(chars, start, i); // backtrack
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    
    }
}
