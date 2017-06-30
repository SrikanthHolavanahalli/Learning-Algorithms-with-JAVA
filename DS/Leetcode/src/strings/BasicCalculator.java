package strings;

import java.util.Stack;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));

	}
	
	 public static  int calculate(String s) {
	        
	        if(s==null || s.equals(""))
	            return 0;
	            
	        s= s.trim();
	        char[] input = s.toCharArray();
	        
	        if(input.length == 1)
	            return Integer.parseInt(s);
	        
	        Stack<Character>   operator = new Stack<>();
	        Stack<Integer>  operand  = new Stack<>();
	        
	        /*String numberPattern = "[0-9]+";
	        Pattern p = Pattern.compile(numberPattern);
	        Matcher m;*/
	        
	        for(int i = 0; i < input.length;)
	        {
	            char str = input[i];
	            
	            if(str == ' ')
	                continue;
	            else if(str== '(')
	                operator.push(str);
	            else if(Character.isDigit(str))
	            {   int num = 0;
	                while(Character.isDigit(str))
	                {
	                    num = num * 10 + Character.getNumericValue(str);
	                    i++;
	                    str = input[i];
	                }
	                operand.push(num);
	                continue;
	            }
	            else if((str == '-' || str == '+') && operand.size() >= 2 && operator.peek() != '(')	
	            {
	                int num1 = operand.pop();
	                int num2 = operand.pop();
	                
	                if(str == '+')
	                    operand.push(num1 + num2);
	                else
	                    operand.push(num2-num1);
	            }
	            
	            else if(str==')')
	            {
	                while(operator.peek() !='('  && !operator.empty())
	                {
	                    int num1 = operand.pop();
	                    int num2 = operand.pop();
	                
	                    if(operator.pop()=='+')
	                        operand.push(num1 + num2);
	                    else
	                        operand.push(num2-num1);
	                    
	                }
	                if(operator.empty())
	                    return 0;
	            }
	            else if((str == '-' || str == '+'))
	            {
	            	operator.push(str);
	            }
	            
	            i++;
	           
	        }// end of for
	        
	        if(operator.empty())
	        {
	            if(operand.empty())
	                return 0;
	            else
	                return operand.peek();
	        }
	        else
	            return 0;
	    }

}
