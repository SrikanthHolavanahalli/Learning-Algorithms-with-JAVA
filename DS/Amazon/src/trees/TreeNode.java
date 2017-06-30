package trees;


	
	public class TreeNode {
		
		int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }

		public TreeNode() {
			// TODO Auto-generated constructor stub
		}
		
		public void add(TreeNode n , boolean isLeft, int val){
			if(isLeft)
				n.left = new TreeNode(val);
			else
				n.right = new TreeNode(val);
		}
	}



