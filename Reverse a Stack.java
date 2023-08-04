class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
    ArrayList<Integer> ans=new ArrayList<>();
        reverse(s,ans);
    }
   static void reverse(Stack<Integer> s,ArrayList<Integer> ans){
       if(s.isEmpty()){
           return ;
       }
       ans.add(s.pop());
       reverse(s,ans);
       s.push(ans.get(0));
       ans.remove(0);
   }
}
