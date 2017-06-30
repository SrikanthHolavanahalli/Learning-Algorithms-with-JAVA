package strings;

public class Atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(atoi("   +7"));
	}
	
	public static int atoi(final String a) {
	    if(a==null||a.length()==0)
	        return 0;
	    int n = a.length();
	    int i = 0;
	    while(i<n && a.charAt(i) == ' ') i++;
	    
	    
	    boolean negFlag = false;
	    if( a.charAt(i) == '-' ||  a.charAt(i) == '+'){
	        if(a.charAt(i) == '-')
	            negFlag = true;
	        i++;
	    }
	    
	    if(i==n || !Character.isDigit(a.charAt(i)))
	        return 0;
	    
	    int result = 0;
	    while(i < n && Character.isDigit(a.charAt(i))){
	        int digit = Integer.valueOf(a.charAt(i++) - '0');
	        if(result > Integer.MAX_VALUE/10 || ( result == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10  ) )
	            return negFlag == true? Integer.MIN_VALUE:Integer.MAX_VALUE;
	         result = result *10 + digit;
	    }
	    return negFlag == true?result*-1:result;
	}

}
