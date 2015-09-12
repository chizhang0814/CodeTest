package codes;

import java.util.*;
public class minHeightTree {
	static class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;		
		public TreeNode(int data){
			this.value = data; 
		}
	}	
	TreeNode root;
	public static TreeNode addToTree(int [] array, int st, int ed){
		int mid = (st+ed)/2;
		if(ed <st)
			return null;
		TreeNode node = new TreeNode(array[mid]);
		node.left = addToTree(array, st, mid-1);
		node.right = addToTree(array, mid+1, ed);
		return node;
	}
	public minHeightTree(int [] sortArray){
		this.root = addToTree(sortArray, 0, sortArray.length-1);
	}
	
	public void depthFirstTraverse(){
		Stack <TreeNode> s = new Stack<TreeNode> ();
		s.push(root);
		while(!s.isEmpty()){
			TreeNode temp = s.pop();
			System.out.print(temp.value+"    ");
			if(null!= temp.right)
				s.push(temp.right);
			if(null != temp.left)
				s.push(temp.left);
		}
		System.out.print("\n");
		
	}
	
	public static void main(String[] args){
		int [] a = {1,2,3,4,5,6,7,8,9,10, 12, 14, 16, 18, 20};
		minHeightTree mht = new minHeightTree(a);
		mht.depthFirstTraverse();
	}
}
