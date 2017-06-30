package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input  = {4,3,2,7,8,2,3,1};
		int[] input2 = {10,2,5,10,9,1,1,4,3,7};
		System.out.println(findDuplicates(input2));
	}
	
	 public static List<Integer> findDuplicates(int[] nums) {
	        if(nums == null || nums.length == 0)
	            return null;
	        List<Integer> result = new ArrayList<>();
	        int n = nums.length;
	        for(int i = 0; i < n ; i++){
	            int val = nums[(nums[i] - 1) % n ];
	            if(val > n){
	            	if((nums[i]  % n)!=0)
	            		result.add(nums[i]  % n);
	            	else
	            		result.add(n);
	            }
	            else{
	            	nums[(nums[i] - 1) %n] += n;
	            }
	        }
	        return result;
	    }

}
