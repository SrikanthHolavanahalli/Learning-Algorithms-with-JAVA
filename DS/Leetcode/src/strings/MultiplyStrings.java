package strings;

public class MultiplyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(multiply("109","109"));
	}
	
	public static String multiply(String num1, String num2) {
	     
	     int[] result = new int[num1.length() + num2.length()];
	     
	     String s1 = num1;
	     String s2 = num2;
	     
	     int carry = 0;
	     
	     for(int j = s2.length() - 1 ; j >= 0; j-- )
	     {  
	         carry = 0;
	         for(int i = s1.length() - 1 ; i >= 0; i--)
	         {
	        	 int number1 = Character.getNumericValue(s1.charAt(i));
	        	 int number2 = Character.getNumericValue(s2.charAt(j));
	        	 int tempResult = (number1*number2 + carry);
	        	 int prevResult = result[i+j+1];
	     
	             result[i+j+1] = (prevResult  + tempResult) % 10 ;
	             carry = (prevResult + tempResult) /10;
	         }
	         if(carry !=0)
	            result[j] += carry;
	     }
	     
	     StringBuilder builder = new StringBuilder();
	     for (int i : result) 
	          builder.append(i);
	          
	     String text = builder.toString();
	     if(text.charAt(0) != '0')
	    	 return text;
	     else
	    	 return text.substring(1);
	    }

}
