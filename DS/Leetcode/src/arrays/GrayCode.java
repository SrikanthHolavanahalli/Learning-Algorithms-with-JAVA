package arrays;

import java.util.ArrayList;

public class GrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> result = grayCode(4);
	}
	
	public static ArrayList<Integer> grayCode(int n) {
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    arr.add(0);
	    for(int i=0;i<n;i++){
	        int inc = 1<<i;
	        for(int j=arr.size()-1;j>=0;j--){
	            arr.add(arr.get(j)+inc);
	            
	            System.out.println(arr.get(j)+ " " + inc + " " + arr.get(j)+inc);
	        }
	    }
	    return arr;
	}

}
