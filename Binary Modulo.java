You are given a binary string s and an integer m. You need to return an integer r. Where r = k%m, k is the binary equivalent of string s.
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
			String s = str[0];
			int m = Integer.parseInt(str[1]);
			Solution obj = new Solution();
			System.out.println(obj.modulo(s,m));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
	int modulo(String s, int m) {
		int a =0; 
         for(int i =0; i<s.length();i++){ 
             int b = s.charAt(i) -'0'; 
             a = (a *2 +b)%m ;
         }
         return a;
	}
}
