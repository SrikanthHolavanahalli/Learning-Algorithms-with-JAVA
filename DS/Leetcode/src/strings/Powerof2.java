package strings;

public class Powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "48";
		System.out.println(powerof2(str));
	}
	
	public static boolean powerof2(String str){
		int n = str.length();
		if(str.charAt(n-1)%2!=0)
			return false;
		
		while(str.length() > 1){
			n = str.length();
			if(str.charAt(n-1)%2!=0)
				return false;
			StringBuffer sb = new StringBuffer();
			int q = 0,rem=0,digit;
			for(int i =0; i < n;i++){
				digit = str.charAt(i) - '0' + rem*10;
				q = digit/2;
				rem = digit%2;
				sb.append(q);
			}
			if(sb.charAt(0) == '0')
				sb.deleteCharAt(0);
			str = sb.toString();
		}
		
		if((str.charAt(0) == '2') || (str.charAt(0) == '4') ||(str.charAt(0) == '8'))
			return true;
		else
			return false;
	}
	
	

}
