package arrays;

public class BuySellStock4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {1,2,4};
		System.out.println(maxProfit(2,input));
	}
	
	public static int maxProfit(int k, int[] prices) {
        if(prices==null||prices.length<=1)
            return 0;
        int n = prices.length;
        int[][] result = new int[k+1][n];
        for(int i = 1; i<=k ; i++){
            int maxDiff = -prices[0];
            for(int j = 1; j<n; j++)
            {
                result[i][j] = Math.max(result[i][j-1],prices[j]+maxDiff);
                maxDiff= Math.max(maxDiff,result[i-1][j] - prices[j]);
            }
        }
        return result[k][n-1];
    }
}
