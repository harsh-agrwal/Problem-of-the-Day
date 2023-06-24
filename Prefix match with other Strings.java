Given an array of strings arr[] of size n, a string str and an integer k. The task is to find the count of strings in arr[] whose prefix of length k matches with the k-length prefix of str.
  Solution:
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.next();
            }
            
            int k = Integer.parseInt(sc.next());
            
            String str = sc.next();
            
            Solution obj = new Solution();
            int ans = obj.klengthpref(arr,n,k,str);
            System.out.println(ans);
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
        if(str.length()<k)

           return 0;

        String s=str.substring(0,k);

        int c=0;

        for(String st : arr){

            if(st.length()>=k){

                String strnew=st.substring(0,k);

                if(s.equals(strnew)){

                    c++;

                }

            }

        }

        return c;
    }
}
