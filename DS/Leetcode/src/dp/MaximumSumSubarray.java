package dp;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,-1,-3};
		System.out.println(maxSubArray(arr));
	}
	
	public static int maxSubArray(int[] nums) {
        int runningSum  = nums[0], maxSumSoFar = nums[0];
	    for(int i = 1; i < nums.length; i++){
	        runningSum += nums[i];
	        if(runningSum <= 0){
	            runningSum = 0; 
	            if(maxSumSoFar < nums[i])
	            	maxSumSoFar = nums[i];
	        }
	        else if(runningSum > maxSumSoFar)
	           maxSumSoFar = runningSum;
	    } 
	   return maxSumSoFar;
	} 
}
