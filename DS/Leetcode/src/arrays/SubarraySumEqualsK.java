package arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,3,1,3,0,1,2,3};
		int[] input2 = {6,0,0,6};
		System.out.println(subarraySum2(input,6));
	}
	
	public static int subarraySum2(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }
	
	public static int subarraySum(int[] nums, int k) {
        if(nums==null||nums.length==0)
            return 0;
        int count = 0,runningSum=0,startIndex=0;
        for(int i = 0; i <nums.length; i++){
        	runningSum += nums[i];
            if(runningSum == k){
                count++;
            }else if(runningSum > k){
                while(runningSum > k){
                    //startIndex++;
                    runningSum -= nums[startIndex++];
                }
                if(runningSum == k)
                    count++;
            } 
        }
        return count;
    }
}
