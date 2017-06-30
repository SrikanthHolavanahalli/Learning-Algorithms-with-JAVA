package arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,5,5,11};
		int target = 10;
		System.out.println(twoSum(input,target));
	}
	
	public static int[] twoSum(int[] nums, int target) {
        if(nums==null||nums.length<=1)
            return null;
        int left = 0, right = nums.length-1;
        int[] result= new int[2];
        while(left < right){
            if((nums[left] + nums[right]) == target){
                result[0] = left; 
                result[1] = right;
                return result;
            }else if((nums[left] + nums[right]) > target){
                right--;
            }else{
                left++;
            }
        }
        return result;
    }

}
