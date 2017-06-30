package arrays;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {3,0,8,2,0,0,1};
		System.out.println(canJump(input));
	}
	public static boolean canJump(int[] nums) {
		if(nums == null)
		       return false;
		int n = nums.length;
		boolean[] dp = new boolean[n];
		for(int i = 0; i < n - 1; i++){
	        int j = 0;
			while((i+j < n) && j <= nums[i]){
				if(!dp[i+j])
					dp[i+j] = true; 
				j++;
			}
			if(dp[n-1] == true)
			    return true;
			}
		dp[0] = true;
	    return dp[n-1];
    }
}
