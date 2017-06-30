package arrays;

public class BuySellStock5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] input = {1,2,3,0,2};
		int[] input = {1,4,2};
		System.out.println(maxProfit(input));
	}
	public static int maxProfit(int[] prices) {
        if(prices==null||prices.length<=1)
            return 0;
        int prev, totalProfit = 0,n= prices.length,end=prices[n-1];
        boolean flag = false;
        for(int i = n-2; i > 0;i--){
             if(prices[i] > prices[i+1]){
                totalProfit = totalProfit + ( end - prices[i+1] );
                if(i != 0)
                	end = prices[i-1];
                else
                	flag = true;
                i-=1;//cooldown
            }
        }
        if(!flag && (end > prices[0]))
        	totalProfit += end - prices[0];
        return totalProfit;
    }

}
