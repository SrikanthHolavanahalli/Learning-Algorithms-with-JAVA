package dp;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinChange {
	static ArrayList<ArrayList<Integer>> temp ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]coins = {2};
		int amount = 3;
		//System.out.println(coinChange(coins,amount));
		
		temp = new ArrayList<ArrayList<Integer>>();
		temp.add(new ArrayList<>());
		temp.get(0).add(1);
		System.out.println(temp.get(0).get(0));
	}
	 public static int coinChange(int[] coins, int amount) {
	        if(coins==null || amount == 0)
	            return 0;
	        int[] dp = new int[amount+1];
	        Arrays.fill(dp,Integer.MAX_VALUE);
	        dp[0] = 0;
	        for(int i = 1;i <=amount; i++){
	            for(int j = 0; j < coins.length; j++){
	                if(i-coins[j] >= 0 && dp[i-coins[j]] != Integer.MAX_VALUE)
	                    dp[i] = Math.min(dp[i],dp[i-coins[j]] + 1);
	            }
	        }
	        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
	    }
}
