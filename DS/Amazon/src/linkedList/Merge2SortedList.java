package linkedList;

import java.util.ArrayList;
import java.util.List;

public class Merge2SortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode List1 = new TreeNode(0);
		List1.add(List1, 6);
		List1.add(List1, 4);
		List1.add(List1, 2);
		
		TreeNode List2 = new TreeNode(0);
		List1.add(List2, 5);
		List1.add(List2, 3);
		List1.add(List2, 1);
		
		TreeNode result = Merge2Lists(List1,List2);
		result.display(result);
		
		List<TreeNode> kLists = new ArrayList<TreeNode>();
		kLists.add(List1);
		kLists.add(List2);
		
		TreeNode kResult =  mergeKLists(kLists);
	}
	
	
	public static TreeNode Merge2Lists(TreeNode l1, TreeNode l2){
		if (l1 == null) return l2;
        if (l2 == null) return l1;

        TreeNode head=null;
        TreeNode former=null;
        while (l1!=null&&l2!=null) {
            if (l1.val>l2.val) {
                if (former==null) former=l2; else former.next=l2;
                if (head==null) head=former; else former=former.next;
                l2=l2.next;
            } else {
                if (former==null) former=l1; else former.next=l1;
                if (head==null) head=former; else former=former.next;
                l1=l1.next;
            }
        }
        if (l2!=null) l1=l2;
        
        former.next=l1;
        return head;
	}
	
	public static TreeNode mergeKLists(List<TreeNode> lists) {
        if (lists.size()==0) return null;
        if (lists.size()==1) return lists.get(0);
        if (lists.size()==2) return Merge2Lists(lists.get(0), lists.get(1));
        return Merge2Lists(mergeKLists(lists.subList(0, lists.size()/2)), 
            mergeKLists(lists.subList(lists.size()/2, lists.size())));
    }
}
