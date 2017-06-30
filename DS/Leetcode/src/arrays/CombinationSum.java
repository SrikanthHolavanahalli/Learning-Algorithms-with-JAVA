package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> combinationSum(int[] nums, int target) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, target,0, 0);
	    return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int trgt, int tempSum, int start){
	        if(tempSum > trgt) return;
	        else if(tempSum == trgt) list.add(new ArrayList<>(tempList));
	        else{ 
	            for(int i = start; i < nums.length; i++){
	                tempList.add(nums[i]);
	                backtrack(list, tempList, nums, trgt, tempSum + nums[i] , i); 
	                tempList.remove(tempList.size() - 1);
	            }
	        }
	    }

}
