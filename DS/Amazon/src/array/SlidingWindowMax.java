package array;

import java.util.LinkedList;

public class SlidingWindowMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {5,2,3,6,7,3,8};
		int[] input2 = {7,2,4};
		int[] result = maxSlidingWindow(input2,2);
		System.out.println(result);
	}
	
	public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return nums;
        }
        int[] result = new int[n - k + 1];
        LinkedList<Integer> dq = new LinkedList<>();
        
        for(int i = 0; i < n; i++){
        	if(!dq.isEmpty() && i-k +1 > dq.peek())
        		dq.poll();
        	
        	while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
        		dq.pollLast();
        	
        	dq.offer(i);
        	
        	if(i-k+1>=0){
        		result[i-k+1] = nums[dq.peek()];
        	}
        }
        return result;
    }

}
