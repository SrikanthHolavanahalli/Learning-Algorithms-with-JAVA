package linkedList;

public class TreeNode {
	
	int val;
    TreeNode next;
    TreeNode(int x) { val = x; }

	public TreeNode() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(TreeNode n , int val){
			n.next = new TreeNode(val);
	}
	public void display(TreeNode n ){
		System.out.print(n.val);
		while(n.next!=null){
			n=n.next;
			System.out.print("->" + n.val);
		}
	
	}
}
