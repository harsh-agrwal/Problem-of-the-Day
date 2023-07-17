Given an input stream A of n characters consisting only of lower case alphabets. While reading characters from the stream, you have to tell which character has appeared only once in the stream upto that point. If there are many characters that have appeared only once, you have to tell which one of them was the first one to appear. If there is no such character then append '#' to the answer.
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
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        HashMap<Character, Integer> countMap = new HashMap<>();

        // Queue to maintain the order of appearance
        Queue<Character> queue = new LinkedList<>();

        StringBuilder result = new StringBuilder();

        for (char ch : A.toCharArray()) {
            // Increment the count of the character
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);

            // Add the character to the queue
            queue.add(ch);

            // Remove characters from the queue until we find a non-repeating character
            while (!queue.isEmpty()) {
                char first = queue.peek();

                // If the count of the first character in the queue is more than 1, it's repeating
                // Remove it from the queue and continue to the next character
                if (countMap.get(first) > 1) {
                    queue.remove();
                } else {
                    // The first character in the queue is non-repeating
                    result.append(first);
                    break;
                }
            }

            // If the queue is empty, there are no non-repeating characters
            if (queue.isEmpty()) {
                result.append("#");
            }
        }

        return result.toString();
    }
}
