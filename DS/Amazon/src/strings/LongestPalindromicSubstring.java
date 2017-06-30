package strings;

public class LongestPalindromicSubstring {

	static char[] array ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abaxabaxabb";
		array = s.toCharArray();
		System.out.println(isPalindrome(0,array.length-1));
		int curLen=0,start=0;
		for(int i = 0; i < array.length; i++){
			if(isPalindrome(i-curLen-1,i)){
				start = i-curLen-1;
				curLen += 2;
			}else if(isPalindrome(i-curLen,i)){
				start = i-curLen;
				curLen += 1;
			}
		}
		System.out.println(new String(array,start,curLen));
	}
	
	public static boolean isPalindrome(int begin, int end){
		if(begin<0)
			return false;
		while(begin < end){
			if(array[begin++] != array[end--])
				return false;
		}
		return true;
	}
	
	

}
