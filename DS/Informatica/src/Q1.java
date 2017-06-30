
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println(factorialRemainder(5));
	}
	
	static int factorialRemainder(int number) {
        
	       int  reducedNumber = number -1;
	        
	        
	       int count =0;
	        
	       while( reducedNumber > 0)  {  
	           
	        long temp = factorial(reducedNumber);
	           
	        System.out.println("temp is "+temp);
	       
	        if( temp % number ==  reducedNumber ) {
	             //System.out.println(" temp % number ==  reducedNumber "+temp+"      "+ "      "+number +"  " +reducedNumber);
	            count++;
	        }
	           
	            number--;
	           reducedNumber-- ;
	       }
	         System.out.println("count is "+count);
	        return count ;
	        
	        
	     
	    }
	    
	    static long factorial (int n) {
	        
	            long factValue = 1;
	            
	            int countDigit = n;
	            
	            while(countDigit > 0)   {
	                
	                factValue = factValue * countDigit;
	                countDigit--;
	                
	            }
	        
	        return factValue ;
	    }

	
}
