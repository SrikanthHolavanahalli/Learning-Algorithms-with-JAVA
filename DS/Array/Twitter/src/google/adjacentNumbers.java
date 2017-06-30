package google;

import java.util.Scanner;

public class adjacentNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(getSolution(new Scanner(System.in).nextInt()));
	}
	
	 public static int getSolution(int num){
	        int max = 0, temp = 0, average = 0;
	        int k = 0, j = 0;
	        String tempString = null, str = String.valueOf(num);

	        for(int i = 0; i<str.length()-1;i++){
	            k = Character.getNumericValue(str.charAt(i));
	            j = Character.getNumericValue(str.charAt(i+1));
	            average = (int) Math.ceil((k+j)/2);

	            tempString = str.substring(0,i) + Integer.toString(average) + str.substring(i+2);
	            temp = Integer.valueOf(tempString);
	            if(max<temp) max = temp;
	        }
	        return max;
	    }
	
}
