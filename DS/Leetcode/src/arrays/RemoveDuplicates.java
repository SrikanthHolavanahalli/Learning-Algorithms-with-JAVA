package arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,1,2,3,4,5,5,5,6};
		System.out.println(removeDuplicates(input));
	}
	
	public static int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        int start=0, i=1,count=1;
        while(i < nums.length){
            while(i  < nums.length && nums[i] == nums[start]) i++;
            if(i==nums.length)
                break;
            nums[++start] = nums[i];
            count++;
        }
        return count;
    }

}
