Given a mathematical equation that contains only numbers and +, -, *, /. Print the equation in reverse, such that the equation is reversed, but the numbers remain the same.
It is guaranteed that the given equation is valid, and there are no leading zeros.
  Solution:
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String S)
    {
        int n = S.length();
        ArrayDeque<Integer> st = new ArrayDeque<>();
        ArrayDeque<Character> stk = new ArrayDeque<>();
        int i = 0;

        while (i < n) {
            if (S.charAt(i) == '+' || S.charAt(i) == '-' || S.charAt(i) == '*' || S.charAt(i) == '/') {
                stk.push(S.charAt(i));
                i++;
            } else {
                int num = 0;
                while (i < n && Character.isDigit(S.charAt(i))) {
                    num = num * 10 + (S.charAt(i) - '0');
                    i++;
                }
                st.push(num);
            }
        }
         StringBuilder sb=new StringBuilder();
         while(!st.isEmpty() && !stk.isEmpty()){
             sb.append(st.pop());
             sb.append(stk.pop());
         }
         if(!st.isEmpty()){
             sb.append(st.pop());
         }
         return sb.toString();
    }
}
