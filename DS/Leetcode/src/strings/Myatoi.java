package strings;

public class Myatoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("    -123"));
	}
	public static int myAtoi(String str) {
        if(str==null||str.length()==0)
            return 0;
        int i=0,result=0,n=str.length();
        while(str.charAt(i)==' ' && i < n) i++;
        boolean negFlag=false;
        if(i <n && (str.charAt(i) == '-' || str.charAt(i) == '+'))
            negFlag = str.charAt(i++) == '-'?true:false;
        while(i < n){
            result = result*10 + Integer.valueOf(str.charAt(i++) - '0');
        }
        return negFlag==true?result*-1:result;
    }

}
