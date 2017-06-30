package arrays;

public class PerfectSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numSquares(8));
	}
	public static int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i = 1, j = 1; j <= n; i++,j = i*i )
            dp[j] = 1;
        for(int i = 2; i <= n; i++){
            if(dp[i]!=1){
                dp[i] = Integer.MAX_VALUE;
            }
        }
        for(int i = 2; i <=n ; i++){
            int j = 1;
            while(i-j>0){
            	dp[i] = Math.min(dp[i],dp[i-j]+1);
                j++;
                j = j * j;
            }
        }
        return dp[n];
    }
}
