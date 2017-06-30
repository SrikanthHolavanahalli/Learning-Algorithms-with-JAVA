package strings;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isValid("["));
	}
	
	public static boolean isValid(String s) {
        if(s==null||s.length()==0)
            return true;
        Deque<Character> stack = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.offer(s.charAt(i));
            else{
                if(s.charAt(i) == ')' && stack.size()!=0 &&stack.peekLast()=='(')
                    stack.pollLast();
                else if(s.charAt(i) == ']'&& stack.size()!=0 && stack.peekLast()=='[')
                    stack.pollLast();
                else if(s.charAt(i) == '}' && stack.size()!=0 && stack.peekLast()=='{')
                    stack.pollLast();
                else
                    return false;
            }
        }
        return stack.size()==0?true:false;
	}
}
