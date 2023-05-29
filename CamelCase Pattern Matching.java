Given a dictionary of words where each word follows CamelCase notation, print all words (in lexicographical order) in the dictionary that match with a given pattern consisting of uppercase characters only.

Example: GeeksForGeeks matches the pattern "GFG", because if we combine all the capital letters in GeeksForGeeks they become GFG.

CamelCase is the practice of writing compound words or phrases such that each word or abbreviation begins with a capital letter. Common examples include PowerPoint and Wikipedia, GeeksForGeeks, CodeBlocks, etc
Solution:
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        ArrayList<String> ans =new ArrayList<>();
        for(int i=0;i<N;i++){
            String s=Dictionary[i];
            // int[] arr=new int[26];
            int l=0;
            int count=0;
            int count1=0;
            for(int j=0;j<s.length();j++){
                char c =s.charAt(j);
                if(c>='A' && c<='Z'){
                    if(c==Pattern.charAt(l)){
                        count++;
                        l++;
                    }
                    else{
                        count1++;
                    }
                }
                if(count == Pattern.length()){
                        break;
                }
            
            }
           
            if(count == Pattern.length() && count1==0){
                ans.add(s);
            }
        }
        if(ans.isEmpty()){
            ans.add("-1");
        }
        Collections.sort(ans);
        return ans;
    }
}
