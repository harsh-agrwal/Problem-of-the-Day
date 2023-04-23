You are given an array arr of n elements. In one operation you can pick two indices i and j, such that arr[i] >= arr[j] and replace the value of arr[i] with (arr[i] - arr[j]). You have to minimize the values of the array after performing any number of such operations.
  Solution:
class Solution {
    public static int minimumNumber(int n, int[] arr) {
        // code here
        int GCD = 0;
        for(int i = 0 ; i < n ; i++){
            GCD = gcdByEuclidsAlgorithm(GCD , arr[i]);
        }
        return GCD;
    }
    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
