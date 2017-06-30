package dp;

import java.util.HashMap;

public class MaximumSumSubarray523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5};
		System.out.println(checkSubarraySum(arr,6));
	}
	
	  public static boolean checkSubarraySum(int[] nums, int k) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        int runningSum = 0;
	        int temp = 0;
	        for(int i = 0; i < nums.length; i++){
	            runningSum += nums[i];
	            if(k!=0) 
	            	runningSum = runningSum%k;
	            if(map.get(runningSum)!=null) 
	                return true;
	            else 
	                map.put(runningSum,i);
	        }
	        return false;
	    }
}
