package strings;

import java.util.Stack;

public class CheckPreorderSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result = isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#");
		if(result == true)
			System.out.println("true");
		else
			 System.out.println("false");
	}
	
	public static  boolean isValidSerialization(String preorder) {
        
        if (preorder == null)
            return false;
            
        Stack<String> st = new Stack<>();
        String[] strs = preorder.split(",");
        for (int pos = 0; pos < strs.length; pos++) {
            String curr = strs[pos];
            while (curr.equals("#") && !st.isEmpty() && st.peek().equals(curr)) {
                st.pop();
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
            st.push(curr);
        }
        return st.size() == 1 && st.peek().equals("#");
    }
	
	public boolean isValidSerialization2(String preorder) {
	    String[] nodes = preorder.split(",");
	    int diff = 1;
	    for (String node: nodes) {
	        if (--diff < 0) return false;
	        if (!node.equals("#")) diff += 2;
	    }
	    return diff == 0;
	}
	
	public boolean isValidSerialization3(String preorder) {
	    int nonleaves = 0, leaves = 0, i = 0;
	    String[] nodes = preorder.split(",");
	    for (i=0; i<nodes.length && nonleaves + 1 != leaves; i++)
	        if (nodes[i].equals("#")) leaves++;
	        else nonleaves++;
	    return nonleaves + 1 == leaves && i == nodes.length;
	}
}
