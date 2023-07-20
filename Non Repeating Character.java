class Solution
{
     static char nonrepeatingCharacter(String S)
    {
       Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];
        for(int i=0 ; i<S.length(); i++){
            char ch = S.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
        }
        while(!q.isEmpty()){
            if(freq[q.peek()-'a']==1){
                return q.peek();
            }
            q.remove();
        }
        return '$';
    }
}
