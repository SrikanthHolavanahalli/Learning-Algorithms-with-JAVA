package arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4};
		int[] output = productExceptSelf(nums);
		
		int x = 1;
		
		x++;

	}
	
	
public static int[]  productExceptSelf(int[] nums) {
        
        int[] left  = new int[nums.length];
        int[] right = new int[nums.length];
        
        left[0] = nums[0];
        right[nums.length - 1] = nums[nums.length - 1];
        
        int i = 1, j = nums.length - 2;
        
        while( i < nums.length || j > 0)
        {
            left[i] = left[i-1]*nums[i];
            right[j] = right[j+1]*nums[j];
            
            i++; j--;
        }
        
        int[] output = new int[nums.length];
        int k = 1;
        
        output[0]= right[1];
        output[nums.length - 1] = left[nums.length - 2];
         
        while(k < nums.length - 1)
        {
            output[k] = left[k-1] * right[k+1];
            k++;
        }
        
        return output;
    }

}
