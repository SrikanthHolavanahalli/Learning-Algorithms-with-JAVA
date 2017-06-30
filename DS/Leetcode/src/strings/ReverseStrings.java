package strings;

public class ReverseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString(""));
	}
	 public static String reverseString(String s) {
	        if(s==null||s.length()==0)
	            return "";
	        int n = s.length() - 1;
	        StringBuilder sb = new StringBuilder();
	        while (n >= 0)
	            sb.append(s.charAt(n--));
	        return sb.toString();
	    }
}
