package arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4,5,6,7};
		int[] input2 = {-1};
		rotate(input2,3);
	}
	
	public static void rotate(int[] nums, int k) {
        if(nums==null || k ==0) return;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static void reverse(int[] nums, int start, int end){
        for(int i = start,j=end; i < j ;i++,j--){
            int temp = nums[i];
            nums[i]  = nums[j];
            nums[j]  = temp;
        }
    }

}
