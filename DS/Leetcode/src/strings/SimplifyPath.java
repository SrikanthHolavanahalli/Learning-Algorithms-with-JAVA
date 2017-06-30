package strings;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SimplifyPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(simplifyPath("/a/b/./c/../d//e"));
		System.out.println(simplifyPath("/"));
	}
	
	public static String simplifyPath(String path){
		Set<String> skip = new HashSet<String>(Arrays.asList("",".",".."));
		Deque<String> stack = new LinkedList();
		
		String[] split = path.split("/");
		
		for(String dir: path.split("/")){
			if(dir.equals("..") && stack.peekLast()!=null){
				stack.pollLast();
			}
			else if( !skip.contains(dir)){
				stack.offer(dir);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(stack.peekLast()!=null){
			sb.append("/").append(stack.pollFirst());
		}
		
		return sb.length()==0?"/":sb.toString();
	}

}
