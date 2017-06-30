package arrays;

public class NestedArraySK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {5,4,0,3,1,6,2};
		int[] input2 = {0,2,1};
		System.out.println(arrayNesting(input2));
	}
	
	 public static int arrayNesting(int[] nums) {
		 if(nums==null||nums.length==0)
	            return 0;
		 int res = 0;
         for (int i=0;i<nums.length;i++) {
             if (nums[i] < 0) continue;
             int length = 1, val = nums[i];
             while (Math.abs(val) != i) {
                 length++;
                 val = nums[Math.abs(val)];
                 nums[Math.abs(val)] *= -1;
             }
             res = Math.max(res, length);
         }
         return res;
	 }
}
