package strings;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hEllo";
		
		//System.out.println(reverseVowels(s));
		System.out.println(reverseVowels1(s));
		
		
	}
	
	public static String reverseVowels1(String s) {
        if(s==null||s.length()==0)
            return "";
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');    vowels.add('A');
        vowels.add('e');    vowels.add('E');
        vowels.add('i');    vowels.add('I');
        vowels.add('o');    vowels.add('O');
        vowels.add('u');    vowels.add('U');
        char[] result = s.toCharArray();
        int i =0, j= s.length() -1;
        while(i < j){
            while(!vowels.contains(result[i]) && i < j) i++;
            while(!vowels.contains(result[j]) && i < j) j--;
            
            char temp = result[i];
            result[i] = result[j];
            result[j] = temp;
            i++;	j--;
        }
        return new String(result);
    }
	
	 public static String reverseVowels(String s) {
	        
	        char[] result = s.toCharArray();
	        
	        int i =0 ;
	        int j = s.length() - 1;
	        String vowels = "aeiouAEIOU";
	        
	        char temp = '\0';
	        
	        while(i < j)
	        {
	            if( !vowels.contains(s.charAt(i) + "") && !vowels.contains(s.charAt(j) + ""))
	            {
	                i++;
	                j--;
	            }
	            else if(!vowels.contains(s.charAt(i) + "") || !vowels.contains(s.charAt(j) + ""))
	            {
	                if(vowels.contains(s.charAt(i) + ""))
	                    j--;
	                else
	                    i++;
	            }
	            else
	            {
	                temp      = result[i];
	                result[i] = result[j];
	                result[j] = temp;
	          
	                i++;
	                j--;
	            }
	        }
	      
	        return new String(result);
	    }
	 
	 
}
