package codes;

import java.util.ArrayDeque;

public class BinaryTree {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value){
            this.value=value;
        }
    }

    TreeNode root;

    public BinaryTree(int[] array){
        root=makeBinaryTreeByArray(array,0);
    }

    public static TreeNode makeBinaryTreeByArray(int[] array,int index){
        if(index<array.length){
        	
            int value=array[index];
            
                TreeNode t=new TreeNode(value);
                array[index]=0;
                t.left=makeBinaryTreeByArray(array,index*2+1);
                t.right=makeBinaryTreeByArray(array,index*2+2);
                return t;            
        }
        return null;
    }

    /**
     * depth first traverse
     * Non- recursive
     * Using Stack
     */
    public void depthOrderTraversal(){
        if(root==null){
            System.out.println("empty tree");
            return;
        }       
        ArrayDeque<TreeNode> stack=new ArrayDeque<TreeNode>();
        stack.push(root);       
        while(stack.isEmpty()==false){
            TreeNode node=stack.pop();
            System.out.print(node.value+"    ");
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }           
        }
        System.out.print("\n");
    }

    /**
     * 广度优先遍历
     * 采用非递归实现
     * 需要辅助数据结构：队列
     */
    public void levelOrderTraversal(){
        if(root==null){
            System.out.println("empty tree");
            return;
        }
        ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.add(root);
        while(queue.isEmpty()==false){
            TreeNode node=queue.remove();
            System.out.print(node.value+"    ");
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        System.out.print("\n");
    }

    public void printLevelOrder(){
    	ArrayDeque<TreeNode> currentL = new ArrayDeque<TreeNode>();
    	ArrayDeque<TreeNode>  nextL= new ArrayDeque<TreeNode>();;
    	currentL.add(this.root);
    	while(!currentL.isEmpty()){
    		TreeNode temp = currentL.remove();
    		System.out.print(temp.value+"   ");
    		if(temp.left != null)
    			nextL.add(temp.left);
    		if(temp.right != null)
    			nextL.add(temp.right);
    		if(currentL.isEmpty()){
        		System.out.print("\n");
        		currentL = nextL.clone();
        		nextL.clear();
        	}
    	}
    	    	
    }
    public int maxDepth(TreeNode n){
    	if (null == n)
    		return 0;
    	return 1+Math.max(maxDepth(n.left),maxDepth(n.right));
    }
    
    public int minDepth(TreeNode n){
    	if (null == n)
    		return 0;
    	return 1+Math.min(maxDepth(n.left),maxDepth(n.right));
    }
    
    
    
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        BinaryTree tree=new BinaryTree(arr);
        tree.depthOrderTraversal();
        tree.levelOrderTraversal();
        tree.printLevelOrder();
        System.out.println("Max Depth is:"+tree.maxDepth(tree.root));
        System.out.println("Min Depth is:"+tree.minDepth(tree.root));

        
    }
}