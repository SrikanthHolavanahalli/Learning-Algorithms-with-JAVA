package strings;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findAnagrams2("ebacbabacd","abc"));	
	}
	
	public static List<Integer> findAnagrams2(String s, String p) {
	    List<Integer> list = new ArrayList<>();
	    if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
	    int[] hash = new int[26]; //character hash
	    //record each character in p to hash
	    for (char c : p.toCharArray()) {
	        hash[c-'a']++;
	    }
	    //two points, initialize count to p's length
	    int left = 0, right = 0, count = p.length();
	    while (right < s.length()) {
	        //move right everytime, if the character exists in p's hash, decrease the count
	        //current hash value >= 1 means the character is existing in p
	        if (hash[s.charAt(right++) -'a']-- >= 1) count--; 
	        
	        //when the count is down to 0, means we found the right anagram
	        //then add window's left to result list
	        if (count == 0) list.add(left);
	    
	        //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new match window
	        //++ to reset the hash because we kicked out the left
	        //only increase the count if the character is in p
	        //the count >= 0 indicate it was original in the hash, cuz it won't go below 0
	        if (right - left == p.length() && hash[s.charAt(left++) -'a']++ >= 0) count++;
	    }
	    return list;
	        
	    }
	
	public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s==null||p==null||p.length()==0||s.length()==0||s.length() < p.length())
            return result;
        for(int j =p.length(),i=0;j<=s.length();j++,i++){
            if(isAnagram(s.substring(i,j),p) == true){
                result.add(i);
            }
        }
        return result;
    }
    public static boolean isAnagram(String s, String t){
        int[] allChars = new int[26];
        for(int i = 0; i < s.length(); i++) 
        	allChars[s.charAt(i) - 'a']++;
        for(int i = 0; i < t.length(); i++) 
        	allChars[t.charAt(i) - 'a']--;
        int i = 0;
        while(i < 26){
            if(allChars[i++]!=0) 
            	return false;
        }
        return true;
    }

}
