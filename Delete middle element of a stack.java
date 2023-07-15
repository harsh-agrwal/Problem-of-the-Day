class Solution
{
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        int midIndex = sizeOfStack / 2;
        Stack<Integer> tempStack = new Stack<>();
        for (int i = 0; i < midIndex; i++) {
            tempStack.push(s.pop());
        }
        s.pop();
        while (!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
    } 
}
