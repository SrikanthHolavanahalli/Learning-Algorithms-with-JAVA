package strings;

public class NumberToWord {
	    static String[] specialNums = {"", " Thousand", " Million", " Billion", " Trillion"," Quadrillion", " Quintillion"};
	    static String[] tensPlace = {"","Ten","Twenty"," Thirty"," Forty"," Fifty"," Sixty"," Seventy"," Eighty"," Ninety"};
	    static String[] onesPlace = { ""," One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"," Ten",
	                        " Eleven"," Twelve"," Thirteen"," Fourteen"," Fifteen"," Sixteen"," Seventeen"," Eighteeen"," Nineteen"};
	    
	    public static String numberToWords(int n) {
	        if (n == 0)
	            return "Zero";
	        StringBuilder sb = new StringBuilder();
	        int place = 0;
	        while(n > 0){
	            int num = n%1000;
	            if(num!=0){
	            	sb.insert(0,specialNums[place]);
	                sb.insert(0, convert(num));
	            }
	            place++;
	            n /= 1000;
	        }
	        return sb.toString();
	    }
	    public static String convert(int num){
	        StringBuilder sb = new StringBuilder();
	        if(num%100 < 20){
	            sb.insert(0,onesPlace[num%100]);
	            num /= 100;
	        }else{
	            sb.insert(0,onesPlace[num%10]);
	                num /=10;
	            
	            sb.insert(0,tensPlace[num%10]);
	                num /=10;
	        }
	        if(num==0) return sb.toString();
	        sb.insert(0," Hundred");
	        sb.insert(0, onesPlace[num]);
	        return sb.toString();
	    }
        
        public static void main(String[] args) {
            //NumberToWord obj = new NumberToWord();
            //System.out.println("*** " + obj.convert(123456789));
           // System.out.println("*** " + obj.convert(-55));
            System.out.println("*** " + numberToWords(1234));
        }

}
