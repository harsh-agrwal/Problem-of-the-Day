Given a 2D board of letters and a word. Check if the word exists in the board. The word can be constructed from letters of adjacent cells only. ie - horizontal or vertical neighbors. The same letter cell can not be used more than once.
  Solution:
//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            char [][] board = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    board[i][j] = s[j].charAt(0);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(board, word);
            if(ans)
                System.out.println("1");
            else
                System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        int N=board.length;
        int M=board[0].length;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(board[i][j]==word.charAt(0)){
                    board[i][j]='.';
                    int a=recurse(word,board,i,j,1);
                    if(a==1) return true;
                    else board[i][j]=word.charAt(0);
                }
            }
        }
        return false;
        
    }
    
    static int recurse(String word,char arr[][],int i,int j,int k){
        if(k==word.length()) return(1);
      //  System.out.println(k);
       if(i<arr.length-1 && arr[i+1][j]==word.charAt(k)){
           arr[i+1][j]='.';
           int ans=recurse(word,arr,i+1,j,k+1);
           if(ans==1) return(1);
           else arr[i+1][j]=word.charAt(k);
           
       }
       if(i>0 && arr[i-1][j]==word.charAt(k)){
           arr[i-1][j]='.';
           int ans=recurse(word,arr,i-1,j,k+1);
           if(ans==1) return(1);
           else arr[i-1][j]=word.charAt(k);
       }
       if(j<arr[0].length-1 &&arr[i][j+1]==word.charAt(k)){
           arr[i][j+1]='.';
           int ans=recurse(word,arr,i,j+1,k+1);
           if(ans==1) return(1);
           else arr[i][j+1]=word.charAt(k);
       }
       if(j>0 && arr[i][j-1]==word.charAt(k)){
           arr[i][j-1]='.';
           int ans=recurse(word,arr,i,j-1,k+1);
           if(ans==1)  return(1);
           else arr[i][j-1]=word.charAt(k);
       }
       return(0);
    }
}
