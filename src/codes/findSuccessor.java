package codes;

public class findSuccessor {
	static class TreeNode{
		int value;
		TreeNode parent;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data){
			this.value = data;
		}
	}
	
	public static TreeNode findMostLeft(TreeNode n){
		if(null == n) 
			return n;
		while(null!=n.left)
			n = n.left;
		return n;
	}
	
	public static TreeNode findMostRight(TreeNode n){
		if(null == n) 
			return n;
		while(n.right != null)
			n = n.right;
		return n;
	}
	
	public static  TreeNode searchInOrder(TreeNode n){
		if(null != null){
			TreeNode p;
			if(null == n.parent && null != n.right){
				p =findMostLeft(n.right);
				return p;
			}
			else{
				while((p= n.parent) !=null){
					if(p.left == n)
						break;
					n=p;
				}
				return p;
			}			
		}
		return null;
	}
	
	
	
}
