class Solution {
    public static int finLength(int N, int[] color, int[] radius) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            if (!stack.isEmpty() && color[i] == color[stack.peek()] && radius[i] == radius[stack.peek()]) {
                stack.pop();
            } 
            else {
                stack.push(i);
            }
        }
        return stack.size();
    }
}
