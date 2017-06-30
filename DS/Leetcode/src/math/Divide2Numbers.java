package math;

public class Divide2Numbers {
	//Divide two integers without using multiplication, division and mod operator.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(2147483647,2));
		
	}
	public static int divide(int dividend, int divisor) {
		 if(divisor == 0 || dividend == Integer.MIN_VALUE )    
	            return Integer.MAX_VALUE;
	        if(dividend == 0|| divisor == Integer.MIN_VALUE ||  Math.abs(dividend) < Math.abs(divisor))  
	            return 0;
	        if(divisor == 1)
	            return dividend;
	        boolean negFlag = false;
	        if(dividend < 0 || divisor < 0){
	            if(dividend < 0 && divisor < 0)
	                negFlag = false;
	            else
	                negFlag = true;
	        }
	        dividend = Math.abs(dividend);  divisor = Math.abs(divisor);
	        int runningSum = divisor,qoutient = 1; 
	        while(runningSum <= dividend){
	            qoutient+=qoutient;
	            runningSum += runningSum;
	        }
	        runningSum /=2;
	        qoutient /=2;
	        while(runningSum <= dividend){
	            qoutient++;
	            runningSum += divisor;
	        }
	        qoutient -= 1;
	        return negFlag ==  false? qoutient: -1 * qoutient;
    }

}
