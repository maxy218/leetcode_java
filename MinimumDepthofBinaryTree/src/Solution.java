class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class Solution {

	int r_minDepth(TreeNode root){
		if(root == null) return 0x7ffffff;
        if(root.left == null && root.right == null) return 1;
        int leftDepth = r_minDepth(root.left);
        int rightDepth = r_minDepth(root.right);        
        return leftDepth < rightDepth ? leftDepth + 1 : rightDepth + 1;
	}
	
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null) return 0;
        return r_minDepth(root);
    }
}
