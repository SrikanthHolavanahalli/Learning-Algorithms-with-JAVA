package strings;

public class LongestPandromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("abaxabaxabb"));
	}
	
	public static String longestPalindrome(String s) {
        int curLen = 0;
        int start = -1;
        char[] array = s.toCharArray();
        for(int i = 0; i < array.length; i++) {
            if(isPalindrome(array, i - curLen - 1, i)) {
                start = i - curLen - 1;
                curLen += 2;
            } else if (isPalindrome(array, i - curLen, i)) {
                start = i - curLen;
                curLen += 1;
            }
        }
        return new String(array, start, curLen);
    }
    private static boolean isPalindrome(char[] array, int start, int end) {
        if(start < 0) {
            return false;
        }
        while(start < end) {
            if(array[start++] != array[end--]) {
                return false;
            }
        }
        return true;
    }
	
	/*
	    public static String longestPalindrome(String s) {
	        String res = "";
	        int currLength = 0;
	        for(int i=0;i<s.length();i++){
	        	System.out.println("i ------" + i + " currLen " + currLength);
	            if(isPalindrome(s,i-currLength-1,i)){
	                res = s.substring(i-currLength-1,i+1);
	                System.out.println("2 " + res+ " " + currLength);
	                currLength = currLength+2;
	            }
	            else if(isPalindrome(s,i-currLength,i)){
	                res = s.substring(i-currLength,i+1);
	                System.out.println("1 " + res + " " + currLength);
	                currLength = currLength+1;
	            }
	            System.out.println("------");
	        }
	        return res;
	    }
	    
	    public static boolean isPalindrome(String s, int begin, int end){
	    	System.out.println("begin " + begin + " end " + end);
	        if(begin<0) return false;
	        System.out.println("substring begin-end   " + s.substring(begin,end+1));
	        while(begin<end){
	        	if(s.charAt(begin++)!=s.charAt(end--)) return false;
	        }
	        return true;
	    }*/
}

