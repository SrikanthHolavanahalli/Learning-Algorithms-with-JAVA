package strings;

public class RepeatedSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = ", , , ,        a, eaefa";
		String[] y = x.split(" ");
		
		System.out.println(y[0]);
		
		
		//System.out.println(repeatedSubstringPattern("aabaaba"));
	}
	
public static  boolean repeatedSubstringPattern(String str) {
        
        
        char firstChar = str.charAt(0);
        int firstCharRepeatIndex = 0;
        
        for(int i = 1; i < str.length();i++)
        {
            if(firstChar == str.charAt(i))
            {
                firstCharRepeatIndex = i;
                break;
            }
        }
        
        int patternLength = firstCharRepeatIndex;
        
        for(int j = 0; j < str.length(); j+=patternLength)
        {
            String pattern = str.substring(j+patternLength);
            
            if( pattern.length() < patternLength && pattern.length() != 0 )
                    return false;
                    
            for(int k = j; k < patternLength ; k++)
            {
                if(str.charAt(k) != str.charAt(k+patternLength))
                    return false;
            }
        }
        
        
        return true;
        
    }


}
