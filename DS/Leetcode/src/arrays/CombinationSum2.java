package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,2,2};
		List<List<Integer>> answer = combinationSum2(input, 4);
	}
	
	
	public static List<List<Integer>> combinationSum2(int[] nums, int target) {
	     List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, target,0, 0,0);
	    return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int trgt, int tempSum, int start,int depth){
	        if(tempSum > trgt) return;
	        else if(tempSum == trgt) list.add(new ArrayList<>(tempList));
	        else{ 
	            for(int i = start; i < nums.length;i++){
            	
	                if(i>start && nums[i]==nums[i-1])
	                    continue;
	                    
	                tempList.add(nums[i]);
	                backtrack(list, tempList, nums, trgt, tempSum + nums[i] , i + 1,depth+1); 
	                tempList.remove(tempList.size() - 1);
	            }
	        }
	    }

}
