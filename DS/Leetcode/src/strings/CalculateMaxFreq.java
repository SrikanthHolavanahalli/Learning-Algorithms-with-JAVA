package strings;

public class CalculateMaxFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countMaxFreq("aaabbbbaaa"));
	}
	
	public static char countMaxFreq(String s){
		
		int maxResult = 0,currResult=1;
		char prevChar = s.charAt(0);
		char currChar = ' ', result = ' ';
		for(int i = 1; i < s.length(); i++){
			currChar = s.charAt(i);
			if(prevChar!=currChar){
				if(maxResult<  currResult){
					maxResult = currResult;
					result = prevChar;
					currResult = 1 ;
				}	
			}else{
				currResult++;	
			}
			prevChar = currChar;
		}
		return result;
	}

}
