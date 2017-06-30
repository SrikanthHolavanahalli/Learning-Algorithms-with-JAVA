package dp;

public class WildcardMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "a", s = "aa" ;
		System.out.println(isMatch(s,p));
		
	}
	public static boolean isMatch(String s, String p) {
        if(s==null || p==null || s.length() == 0|| p.length() ==0)
            return true;
        boolean[][] dp = new boolean[p.length()+1][s.length()+1];
        dp[0][0] = true;
        for(int i = 1; i < p.length();i++){
            dp[0][i] = false;
            dp[i][0] = false;
        }
        for(int i = 1; i <= p.length(); i++){
            for(int j = 1; j <= s.length(); j++){
                if(p.charAt(i-1) == '?' || p.charAt(i-1) == s.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else if(p.charAt(i-1) == '*')
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                else
                    dp[i][j] = false;
            }
        }
        return dp[p.length()][s.length()];
    }
}
