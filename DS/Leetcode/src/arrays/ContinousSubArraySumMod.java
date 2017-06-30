package arrays;

import java.util.HashMap;

public class ContinousSubArraySumMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {0,1,0};
		System.out.println(checkSubarraySum(input,0));
	}
	public static boolean checkSubarraySum(int[] nums, int k) {
        if(nums==null||nums.length==0)
            return false;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int runningModVal = 0;
        try{
            for(int i = 0; i < nums.length; i++){
                if(k!=0)
                    runningModVal = (runningModVal + nums[i])%k;
                else
                	runningModVal = (runningModVal + nums[i]);
                if(hm.get(runningModVal) !=null && (i - hm.get(runningModVal) > 0))
                    return true;
                else
                    hm.put(runningModVal, i);
            }
        }catch(ArithmeticException e){
            return false;
        }
        return false;
    }
}
