package dp;

import java.util.Deque;
import java.util.LinkedList;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(input));
	}
	public static int trap(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int n = nums.length,sum=0;
        int[] leftNGE = new int[n], rightNGE = new int[n];
        Deque<Integer> stack = new LinkedList<>();
        leftNGE[n-1]  = -1;	rightNGE[0] = -1;
        //filling up leftNGE
        for(int i = 0; i < n -1 ; i++){
            if(stack.size() != 0 && nums[i] < stack.peek()){
                leftNGE[i] = stack.peek();
            }else{
                while(stack.size() != 0 && stack.peek() < nums[i])
                    stack.poll();
                leftNGE[i] = stack.size() != 0?stack.peek():-1;
            }
            stack.addFirst(nums[i]);
        }
        //filling up rightNGE
        for(int i = n-1; i > 0 ; i--){
            if(stack.size() != 0 && nums[i] < stack.peek()){
                rightNGE[i] = stack.peek();
            }else{
                while(stack.size() != 0 && stack.peek() < nums[i])
                    stack.poll();
                rightNGE[i] = stack.size() != 0?stack.peek():-1;
            }
            stack.addFirst(nums[i]);
        }
        //finding sum
        for(int i = 0; i < n; i++){
            if(leftNGE[i] == -1 || rightNGE[i] == -1)  continue;
            else    sum = sum + Math.min(leftNGE[i],rightNGE[i]) - nums[i];
        }
        return sum;
    }

}
