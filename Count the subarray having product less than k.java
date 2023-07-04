Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number k.
  Solution:
  //{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            
            long a[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.countSubArrayProductLessThanK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        if (k <= 1)
            return 0;
        
        int count = 0;      // Initialize the count of valid subarrays
        int end = 0;        // Pointer to the end of the current subarray
        long product = 1;   // Variable to store the product of the current subarray
        int start = 0;      // Pointer to the start of the current subarray
        
        while (end < n) {
            product *= a[end];      // Extend the subarray to the right by including a[end]
            
            // If the product is greater than or equal to k, we need to shrink the subarray
            // from the left until the product becomes less than k.
            while (product >= k) {
                product /= a[start]; // Shrink the subarray by excluding a[start]
                start++;             // Move the start pointer to the right
            }
            
            // At this point, the product of the subarray from start to end is less than k.
            // So, all subarrays with end as the last element and start as the first element
            // (including the whole subarray itself) will have a product less than k.
            // We add the count of such subarrays to the result.
            count += end - start + 1;
            
            // Move the end pointer to the right to consider the next element in the array.
            end++;
        }
        
        // Return the total count of valid subarrays with product less than k.
        return count;
    }
}
