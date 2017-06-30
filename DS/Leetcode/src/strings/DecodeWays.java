package strings;

import java.util.HashMap;

public class DecodeWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "1234";
		//System.out.println(s.substring(0,s.length() -1));
		System.out.println(numDecodings("123"));
	}
	
	/* public static int numDecodings(String s) {
	        if(s == null || s.length() == 0) {
	            return 0;
	        }
	        int n = s.length();
	        int[] dp = new int[n+1];
	        dp[0] = 1;
	        dp[1] = s.charAt(0) != '0' ? 1 : 0;
	        for(int i = 2; i <= n; i++) {
	            int first = Integer.valueOf(s.substring(i-1, i));
	            int second = Integer.valueOf(s.substring(i-2, i));
	            if(first >= 1 && first <= 9) {
	               dp[i] += dp[i-1];  
	            }
	            if(second >= 10 && second <= 26) {
	                dp[i] += dp[i-2];
	            }
	        }
	        return dp[n];
	    }*/
	
	public static int numDecodings(String s) {
        if(s==null||s.length() == 0)
            return 0;
        decode(s,0,0);
        return result;
    }
    static int result = 0;
    public static void decode(String s, int one, int two){
    	String first  = s.substring(one);
    	String second = s.substring(one,two);
        if(s.substring(one).length() > 0)
            decode(s,one+1,two);
        else{
            result++;
            return;
        }
        if(s.substring(one,two).length() > 1 && Integer.parseInt(s.substring(one,two)) < 27)
            decode(s,one,two+2);
        else{
            result++;
            return;
        }
    }

}
