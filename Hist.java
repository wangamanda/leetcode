import java.util.Stack;
import java.util.Arrays;

public class Hist{
	public static void main(String[] args){
		int[] h = {4,2,0,3,2,5};
		int res = largestRectangleArea(h);
		System.out.println("Largest area size is : "+res);
	}

	public static int largestRectangleArea(int[] height){
		int i = 0;
		int maxSize = 0;
		Stack<Integer> stack = new Stack<Integer>();
		int[] h = Arrays.copyOf(height, height.length+1);
		while(i < h.length){
			if(stack.isEmpty() || h[i] >= h[stack.peek()]){
				stack.push(i++);
			}else{
				int t = stack.pop();
				maxSize = Math.max(maxSize, h[t]*(stack.isEmpty() ? i:(i-stack.peek()-1)));
			}
		}
		return maxSize;
	}
}
