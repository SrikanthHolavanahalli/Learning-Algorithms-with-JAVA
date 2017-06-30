package strings;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseWords(" 1 "));
	}
	
	public String reverseWords1(String s) {
	    String[] words = s.trim().split(" +");
	    Collections.reverse(Arrays.asList(words));
	    return String.join(" ", words);
	}
	
	public String reverseWords2(String s) {
	    if (s == null) return null;
	    
	    char[] a = s.toCharArray();
	    int n = a.length;
	    
	    // step 1. reverse the whole string
	    reverse(a, 0, n - 1);
	    // step 2. reverse each word
	    reverseWords(a, n);
	    // step 3. clean up spaces
	    return cleanSpaces(a, n);
	  }
	  
	  void reverseWords(char[] a, int n) {
	    int i = 0, j = 0;
	      
	    while (i < n) {
	      while (i < j || i < n && a[i] == ' ') i++; // skip spaces
	      while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
	      reverse(a, i, j - 1);                      // reverse the word
	    }
	  }
	  
	  // trim leading, trailing and multiple spaces
	  String cleanSpaces(char[] a, int n) {
	    int i = 0, j = 0;
	      
	    while (j < n) {
	      while (j < n && a[j] == ' ') j++;             // skip spaces
	      while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
	      while (j < n && a[j] == ' ') j++;             // skip spaces
	      if (j < n) a[i++] = ' ';                      // keep only one space
	    }
	  
	    return new String(a).substring(0, i);
	  }
	  
	  // reverse a[] from a[i] to a[j]
	  private void reverse(char[] a, int i, int j) {
	    while (i < j) {
	      char t = a[i];
	      a[i++] = a[j];
	      a[j--] = t;
	    }
	  }
	  
	
	public static  String reverseWords(String s) {
        
        int first = 0 ;
        int last = s.length() -1;
        int insertIndex = 0;
        StringBuilder result = new StringBuilder("");
        
        s = s.trim();
                    
       if(  s.indexOf(" ") == -1 || s.length() == 0  )
            return s.trim();
            
            if(s.indexOf(" " , first) == last)
            {
                result.insert(first,s.substring(first,last));
                return result.toString();
            }
        
        String firstString = "";
        String lastString  = "";
        
        while(first < last)
        {
            firstString = s.substring(first, s.indexOf(" ", first));
            lastString  = s.substring(s.lastIndexOf(" ",last) , last);
            
            if(result.length() == 0)
            {
                result.append(lastString);
                result.append(" ");
                result.append(firstString);
                
                insertIndex = lastString.length();
            }
            else
            {
                result.insert(insertIndex,lastString);
                insertIndex += lastString.length();
                result.insert(first," ");
                insertIndex++;
                result.insert(insertIndex,firstString);
                insertIndex += firstString.length();
            }
            
            first = s.indexOf(" ", first);
            last  = s.lastIndexOf(" ",last);
            
            if(s.indexOf(" " , first) == last)
            {
                result.insert(first,s.substring(first,last));
                return result.toString();
            }
        }
        return result.toString();
    }

}
