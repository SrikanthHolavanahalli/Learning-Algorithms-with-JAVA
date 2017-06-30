package trees;

import java.util.Deque;
import java.util.LinkedList;

public class SerializeDeserializeBT {
	private static final String spliter = ",";
	private static final String NN = "#";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println();
		
		//deserialize(codec.serialize(root));
	}
	
	
	
	// Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        
      /*  Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        
        while(!stack.empty())
        {
            TreeNode n = stack.pop();
            sb.append(n.val).append(spliter);
           
            if(n.right!=null)
                stack.push(n.right);
            else
                sb.append(NN).append(spliter);
            
             if(n.left!=null)
                stack.push(n.left);
            else
                sb.append(NN).append(spliter);
        }
        
        return sb.toString();*/
        
        buildString(root, sb);
        return sb.toString();
    }
    
    private void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NN).append(spliter);
        } else {
            sb.append(node.val).append(spliter);
            buildString(node.left, sb);
            buildString(node.right,sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] input = data.split(spliter);
        Deque<String> list = new LinkedList<>();
        for(String s: input)
            list.add(s);
        return buildTree(list);   
    }
    
    public TreeNode buildTree(Deque<String> list){
        String val = list.remove();
        if(val.equals(NN))
            return null;
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left  = buildTree(list);
        root.right = buildTree(list);
        return root;
    }
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

}
