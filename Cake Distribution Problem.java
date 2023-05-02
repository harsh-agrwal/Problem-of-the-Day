Geek is organizing a birthday party, so his friends brought a cake for him. The cake consists of N chunks, whose individual sweetness is represented by the sweetness array. Now at the time of distribution, Geek cuts the cake into K + 1 pieces to distribute among his K friends. One piece he took for himself. Each piece consists of some consecutive chunks. He is very kind, so he left the piece with minimum sweetness for him.

You need to find the maximum sweetness that the Geek can get if he distributes the cake optimally.
  Solution:
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			int [] sweetness = new int[n];
			str = br.readLine().trim().split(" ");
			int i = 0;
			for(String s: str) {
				sweetness[i++] = Integer.parseInt(s);
			}
			Solution obj = new Solution();
			System.out.println(obj.maxSweetness(sweetness, n, k));
		}
	}
}

// } Driver Code Ends





//User function Template for Java

class Solution{
    int maxSweetness(int [] sweetness, int N, int K) {
        int left = 1, right = 0;
        for(int i=0; i<N; i++) {
            right += sweetness[i];
        }
        int ans = 0;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int count = 0, sum = 0;
            for(int i=0; i<N; i++) {
                sum += sweetness[i];
                if(sum >= mid) {
                    count++;
                    sum = 0;
                }
            }
            if(count >= K+1) {
                ans = mid;
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return ans;
    }
}
