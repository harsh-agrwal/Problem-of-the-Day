Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.
  Solution:
//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
         int start = 0;
        int end = n-1;
        int occur = 0;
        while(start<=end){
            if(start == end){
                if(arr[start] == x || arr[end] == x){
                    occur++;
                }
            }
               else{
                    if(arr[start] == x){
                    occur++;
                }
                if(arr[end] == x){
                    occur++;
                }
           }
            start++;
            end--;
        }
        return occur;
    }
}
