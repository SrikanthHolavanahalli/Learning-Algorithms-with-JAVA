package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3};
		System.out.println(combinationSum4(input,4));
		
		List<Integer> temp = new LinkedList<>();
		
		temp.add(0,1);
	}
	
	 static int result;
	    public static  int combinationSum4(int[] nums, int target) {
	        backtrack(new ArrayList<>(), nums, target, 0, 0);
	        return result;
	    }

	    private static void backtrack(List<Integer> tempList, int[] nums, int target, int tempSum,int startIndex){
	        if(tempSum > target)
	            return ;
	        else if(tempSum == target){
	            result++; return;    
	        }
	    
	        for(int i = 0; i < nums.length; i++){
	            tempList.add(nums[i]);
	            backtrack(tempList, nums, target,tempSum + nums[i], i); 
	            tempList.remove(tempList.size() - 1);
	        }
	    }

}
