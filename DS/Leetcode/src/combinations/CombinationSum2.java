package combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {10,1,2,7,6,1,5};
		System.out.println(combinationSum2(input,8));
		//System.out.println(combinationSumHelper(input,5));
	}
	
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates == null || target == 0)
            return null;
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        combinationSumHelper(result, tempList, candidates, target,0);
        return result;
    }
    public static void combinationSumHelper(List<List<Integer>> result, List<Integer> tempList, int[] nums, int rem, int index){
        if(rem < 0)         return;
        else if(rem == 0)   result.add(new ArrayList<>(tempList));
        else{
            for(int i = index; i < nums.length; i++){
                if(i > index && nums[i] == nums[i-1])   continue;
                tempList.add(nums[i]);
                combinationSumHelper(result, tempList,nums, rem - nums[i], i+1);
                tempList.remove(tempList.size() - 1);
            }    
        }
    }
    
    public static void combinationSumHelper2(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < nums.length; i++){
                if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
                tempList.add(nums[i]);
                combinationSumHelper2(list, tempList, nums, remain - nums[i], i + 1);
                tempList.remove(tempList.size() - 1); 
            }
        }
    }

}
