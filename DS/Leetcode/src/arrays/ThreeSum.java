package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {0,0,0,0};
		System.out.println(threeSum(input));
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3)
            return result;
        int n = nums.length,count = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < n-2; i++){
            int val = nums[i],j=i+1,k=n-1;
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
	            while(j < k){
	            	if(nums[j] + nums[k] + val > 0)
	            		k--;
	            	else if(nums[j] + nums[k] + val < 0)
	            		j++;
	            	else{
	                    List<Integer> curList = new ArrayList<>();
	                    curList.add(val);
	                    curList.add(nums[j]);
	                    curList.add(nums[k]);
	                    result.add(curList);
	                    k--;
	                    while (j < k && nums[j] == nums[j+1]) j++;
	                    while (j < k && nums[k] == nums[k-1]) k--;
	                }
	            }
	        }
        }
        return result;
    }

}
