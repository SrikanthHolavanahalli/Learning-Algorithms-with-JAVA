package dp;

public class HouseRobber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,1,1,1};
		System.out.println(rob(input));
	}
	
	public static  int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        return Math.max(rob1(nums,0,nums.length-2),rob1(nums,1,nums.length-1));
    }
    
     public static int rob1(int[] nums,int start,int end) {
        if(nums==null||nums.length<=0)
            return 0;
        if(start==end)
            return nums[start];
     
        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start+1] = Math.max(nums[start],nums[start+1]);
        
        for(int i = start+2; i <= end; i++){
            dp[i]= Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[end];
    }

}
