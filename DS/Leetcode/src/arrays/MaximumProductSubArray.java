package arrays;

public class MaximumProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,3,-2,-4};
		
		System.out.println(maxProduct(nums));
		
	}
	
	 public static int maxProduct(int[] nums) {
	     
	        int max = nums[0] , min = nums[0], maxSoFar = nums[0];
	        int tempMax = max;
	        
	        for(int i = 1; i < nums.length; i++)
	        {	
	        	
	        	
	        	tempMax = Math.max( tempMax * nums[i], Math.max(min * nums[i], nums[i]));
	            min = Math.min( max * nums[i], Math.min(min * nums[i], nums[i]));
	            
	            max = tempMax;
	            
	            if(max > maxSoFar)
	                maxSoFar = max;
	        }
	        
	        return maxSoFar;
	    }

}
