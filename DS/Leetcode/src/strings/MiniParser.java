package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MiniParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NestedInteger answer = deserialize("[123,[456,[789]]]");
	    System.out.println(answer.printNi(answer, new StringBuilder("")));
	}
	
	
	public static NestedInteger deserialize(String s) {
		 
	    Stack<Character> stack = new Stack<Character>();
	    String temp = "";
	    NestedInteger preNI = null;
	    NestedInteger newNI = null;
	 
	    for(int i = s.length()-1; i>= 0 ; i--){
	        char c = s.charAt(i);
	        switch(c){
	            case ']':
	                stack.push(c);
	                break;
	 
	            case '[':
	                if(!stack.empty())
	                    stack.pop();
	                else
	                    return null;
	                
	                if(!temp.equals("")){
	                    newNI = new NestedInteger(Integer.parseInt(myReverse(temp)));
	                    if(preNI != null)
	                        newNI.add(preNI);
	                    preNI = newNI;
	                    temp="";
	                }
	                break;
	 
	            case ',':
	                break;
	 
	            default:
	                temp += c;
	        }
	    }
	 
	    if(!temp.equals(""))
	        return new NestedInteger(Integer.parseInt(temp));
	 
	    return newNI;
	}
	
	private static String myReverse(String str) {
	    String reverse = "";
	    int length = str.length();
	    for( int i = length - 1 ; i >= 0 ; i-- ) {
	       reverse = reverse + str.charAt(i);
	    }
	    return reverse;
	}
	
	

	static class NestedInteger {
	    private List<NestedInteger> list;
	    private Integer integer;
	    
	    public NestedInteger(List<NestedInteger> list){
	        this.list = list;
	    }
	    
	    public void add(NestedInteger nestedInteger) {
	        if(this.list != null){
	            this.list.add(nestedInteger);
	        } else {
	            this.list = new ArrayList();
	            this.list.add(nestedInteger);
	        }
	    }

	    public void setInteger(int num) {
	        this.integer = num;
	    }

	    public NestedInteger(Integer integer){
	        this.integer = integer;
	    }

	    public NestedInteger() {
	        this.list = new ArrayList();
	    }

	    public boolean isInteger() {
	        return integer != null;
	    }

	    public Integer getInteger() {
	        return integer;
	    }

	    public List<NestedInteger> getList() {
	        return list;
	    }
	    
	    public String printNi(NestedInteger thisNi, StringBuilder sb){
	        if(thisNi.isInteger()) {
	            sb.append(thisNi.integer);
	            sb.append(",");
	        }
	        sb.append("[");
	        for(NestedInteger ni : thisNi.list){
	            if(ni.isInteger()) {
	                sb.append(ni.integer);
	                sb.append(",");
	            }
	            else {
	                printNi(ni, sb);
	            }
	        }
	        sb.append("]");
	        return sb.toString();
	    }
	}

}
