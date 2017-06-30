package Backtracking;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "SALE";
		String s2 = "MALT";
		
		System.out.println(findEditDistance(s1,s2));
	}
	
	public static int findEditDistance(String s1, String s2){
		
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		
		for(int i = 0; i <= s1.length(); i++)
			dp[i][0] = i;
		
		for(int i = 0; i <= s2.length(); i++)
			dp[0][i] = i;
		
		for(int i = 1; i <=s1.length(); i++){
			for(int j = 1; j <= s2.length(); j++){
				if(s1.charAt(i-1) == s2.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1];
				}else{
					dp[i][j] = Math.min(1+ dp[i][j-1], Math.min(1+dp[i-1][j],1+dp[i-1][j-1]));
				}	
			}
		}
		return dp[s1.length()][s2.length()];
	}
}
