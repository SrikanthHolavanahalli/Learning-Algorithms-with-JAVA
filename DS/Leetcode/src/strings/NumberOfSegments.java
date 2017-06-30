package strings;

public class NumberOfSegments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countSegments("hello, my name is john"));
	}
	
	public static int countSegments(String s) {
        if(s==null||s.length()==0)
            return 0;
        int i = 0, result=0;
        while( i  < s.length()){
            while(Character.isLetter(s.charAt(i))) i++;
            result++;
            while(s.charAt(i) == ' ') i++;
        }
        return result;
    }

}
