package strings;

public class ReverseStrings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseStr("abcdefg",8));
	}
	
	 public static String reverseStr(String s, int k) {
	        if(s==null || s.length() ==0 || k<=0)
	            return s;
	        if(k==s.length())
	            return(reverse(s));
	        StringBuilder sb = new StringBuilder();
	        int interval;
	        for(interval = 0; interval + 2*k <=s.length(); interval += 2*k){
	            String pattern = s.substring(interval, interval+2*k);
	            String rev = pattern.substring(0,k);
	            sb.append(reverse(rev));
	            sb.append(pattern.substring(k,2*k));
	        }
	        if(s.substring(interval) == "")
	            return sb.toString();
	        else if(s.substring(interval).length() < k)
	            return sb.append(reverse(s.substring(interval))).toString();
	        else{
	                String rev = s.substring(interval, interval + k);
	                sb.append(reverse(rev));
	                sb.append(s.substring(interval + k));
	                return sb.toString();
	            }
	    }
	    
	    public static String reverse(String str){
	        StringBuilder sb = new StringBuilder();
	        for(int i = str.length() - 1; i >=0 ; i--)
	            sb.append(str.charAt(i));
	        return sb.toString();
	    }

}
