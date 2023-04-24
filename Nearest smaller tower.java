class Solution{
	int [] nearestSmallestTower(int [] arr){
		int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, -1);
        Arrays.fill(right, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();    
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek(); 
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();    
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();    
            }
            stack.push(i);
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int leftDist = left[i] == -1 ? Integer.MAX_VALUE : i - left[i]; 
            int rightDist = right[i] == -1 ? Integer.MAX_VALUE : right[i] - i;    
            if (leftDist < rightDist || (leftDist == rightDist && left[i] != -1 && arr[left[i]] <= arr[right[i]])) {
                result[i] = left[i];    
            }
            else
            if (leftDist > rightDist || (leftDist == rightDist && right[i] != -1 && arr[right[i]] < arr[left[i]])) {
                result[i] = right[i];   
            } 
            else {
                result[i] = -1;
            }
        }
        return result;
		//Write your code here
	}
}
