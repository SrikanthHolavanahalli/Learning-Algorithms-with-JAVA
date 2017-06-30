package strings;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	    List<List<String>> result ;
	    ArrayList<String> currList;
	    public List<List<String>> partition(String s) {
	        if(s==null||s.length() ==0)
	            return null;
	        result   = new ArrayList<List<String>>();
	        currList = new ArrayList<String>();
	        backtrack(s,0);
	        return result;
	    }
	    public void backtrack(String s, int l){
	        if(currList.size() > 0&& s.length() >= l){
	            ArrayList<String> r = (ArrayList<String>) (currList).clone();
	            result.add(r);
	            //result.add(new ArrayList<>(currList));
	        }
	        for(int i = l; i < s.length(); i++){
	            if(isPalindrome(s,l,i)){
	                if(l==i){
	                    currList.add(Character.toString(s.charAt(i)));
	                }else{
	                     currList.add(s.substring(l,i+1));
	                }
	            }
	            backtrack(s,i+1);
	            currList.remove(currList.size() - 1);
	        }
	    }
	    public boolean isPalindrome(String s, int i, int j){
	        if(i==j)
	            return true;
	        while(i<=j){
	            if(s.charAt(i++)!=s.charAt(j--))
	                return false;
	        }
	        return true;
	    }

}
