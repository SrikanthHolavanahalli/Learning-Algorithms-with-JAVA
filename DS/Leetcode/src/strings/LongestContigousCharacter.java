package strings;

public class LongestContigousCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestCharContigous("aaabbbbcc"));
	}
	
	public static int longestCharContigous(String s){
		int result = 1,j=0;
		for(int i = 0 ; i < s.length();i=i+j){
			char c = s.charAt(0);
			j = i;
			int tempLen = 1;
			while(j < s.length() && s.charAt(j++) == c)
				tempLen++;
			result = Math.max(result,tempLen);
		}
		return result;
	}
}
