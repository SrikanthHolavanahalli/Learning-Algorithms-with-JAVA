package strings;

import java.util.ArrayList;
import java.util.List;

public class LetterCombos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> output = letterCombinations("248");
	}
	
	public static List<String> letterCombinations(String digits) {
	     
        List<String> result = new ArrayList<String>();
        List<String> prevResult = new ArrayList<String>();
        
        if(digits.length() == 0)
            return result;
            
        int number = Integer.parseInt(digits);
        
        while(number > 0)
        {
            int num = number%10;
            
            prevResult.clear();
            
            if(num > 1 && num < 8)
            {
                if(result.size() == 0)
                {
                    result.add(Character.toString( (char) (((num-2)*3 + 0 ) + 'a')));
                    result.add(Character.toString( (char) (((num-2)*3 + 1 ) + 'a')));
                    result.add(Character.toString( (char) (((num-2)*3 + 2 ) + 'a')));
                    
                    if(num==7)
                    {
                    	result.add(Character.toString( (char) (((num-2)*3 + 3 ) + 'a')));
                    }
                }
                else
                {             	
                    for(String s : result)
                    {
                    	prevResult.add(Character.toString( (char) (((num-2)*3 + 0 ) + 'a')) + s);
                    	prevResult.add(Character.toString( (char) (((num-2)*3 + 1 ) + 'a')) + s);
                    	prevResult.add(Character.toString( (char) (((num-2)*3 + 2 ) + 'a')) + s);
                    	
                    	 if(num==7)
                         {
                    		 prevResult.add(Character.toString( (char) (((num-2)*3 + 3 ) + 'a')) + s);
                         }
                    }
                    
                    result = new ArrayList (prevResult);
                }
            }
            else if(num == 8)
            {
            	  if(result.size() == 0)
                  {
                      result.add(Character.toString( (char) ( 19 + 'a')));  // @@@ ASCII to string
                      result.add(Character.toString( (char) ( 20 + 'a')));
                      result.add(Character.toString( (char) ( 21 + 'a')));
                  }
                  else
                  {             	
                      for(String s : result)
                      {
                      	prevResult.add(Character.toString( (char) ( 19 + 'a')) + s);
                      	prevResult.add(Character.toString( (char) ( 20 + 'a')) + s);
                      	prevResult.add(Character.toString( (char) ( 21 + 'a')) + s);
                      }
                      result = new ArrayList (prevResult);  //@@@ deep copy
                  }
            	 
            }
            else if(num == 9)
            {
            	 if(result.size() == 0)
                 {
                     result.add(Character.toString( (char) ( 22 + 'a')));
                     result.add(Character.toString( (char) ( 23 + 'a')));
                     result.add(Character.toString( (char) ( 24 + 'a')));
                     result.add(Character.toString( (char) ( 25 + 'a')));
                 }
                 else
                 {             	
                     for(String s : result)
                     {
                     	prevResult.add(Character.toString( (char) ( 22 + 'a')) + s);
                     	prevResult.add(Character.toString( (char) ( 23 + 'a')) + s);
                     	prevResult.add(Character.toString( (char) ( 24 + 'a')) + s);
                     	prevResult.add(Character.toString( (char) ( 25 + 'a')) + s);
                     }
                     result = new ArrayList (prevResult);
                 }
            }
            
            
            	
            number = number/10;
        }
        
        

        return result;
        
}
        
}

