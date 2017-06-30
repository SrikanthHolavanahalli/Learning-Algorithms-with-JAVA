package arrays;

import java.util.Arrays;

public class TriangleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4,5,6};
		System.out.println(triangleNumber(input));
	}
	
	public static int triangleNumber(int[] nums) {
        int n = nums.length,count = 0;
        Arrays.sort(nums);
        for(int i = 2 ; i < n; i++){
            int val = nums[i],j=0,k=i-1;
            while(j < k){
                if(nums[j] + nums[k] > val){
                	System.out.println(nums[j] + " " +  nums[k] + " " + val);
                    count+=k-j;
                    k--;
                }else{
                    j++;
                }
            }
        }
        return count;
    }

}
