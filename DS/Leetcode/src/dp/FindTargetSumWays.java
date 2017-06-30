package dp;

public class FindTargetSumWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {1,1,1,1};
		
		System.out.println(findTargetSumWays1(input,2));
	}
	
	public static int findTargetSumWays1(int[] nums, int S) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(S > sum || (sum + S) % 2 == 1)   return 0;
        return subsetSum(nums, (sum + S) / 2);
    }

    private static int subsetSum(int[] nums, int S){
        int[] dp = new int[S + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = S; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[S];
    }

}
