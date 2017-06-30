package strings;

public class CountAllSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPalindromes("abaxabaxabb"));
	}
	
	public static int countPalindromes(String s) {
        int curLen = 0;
        //int start = -1;
        char[] array = s.toCharArray();
        int count=0;
        for(int i = 0; i < array.length; i++) {
            if(isPalindrome(array, i - curLen - 1, i)) {
                //start = i - curLen - 1;
                curLen += 2;
                count++;
            } else if (isPalindrome(array, i - curLen, i)) {
                //start = i - curLen;
                curLen += 1;
                count++;
            }
        }
        //return new String(array, start, curLen);
        return count;
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

}
