package stacks;

import java.util.Deque;
import java.util.LinkedList;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] input = "{}{[[]]()(())}".toCharArray();
		
		System.out.println(isBalanced("{[()]}"));
	}
	
	 public static boolean isBalanced(String s){
	        if(s==null||s.length()==0)
	            return true;
	        Deque<Character> stack = new LinkedList<>();
	        
	        for(int i = 0;i<s.length();i++){
	            char c = s.charAt(i);
	            
	            if(c == '(' || c == '{' || c == '['){
	                stack.addFirst(c);
	            }else{
	                if(c == ')' && !stack.isEmpty() && stack.peek() == '(')
	                    stack.poll();
	                else if(c == ']' && !stack.isEmpty() && stack.peek() == '[')
	                	stack.poll();
	                else if(c == '}' && !stack.isEmpty() && stack.peek() == '{')
	                	stack.poll();
	                else
	                    return false;
	            }
	        }
	        if(!stack.isEmpty())
	            return false;
	        else
	            return true;
	    }
	

}
