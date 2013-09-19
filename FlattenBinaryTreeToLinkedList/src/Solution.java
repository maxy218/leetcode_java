
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {	
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(root == null ) return;
		if(root.left != null){
			flatten(root.left);
			TreeNode leftTail = root.left;
			while(leftTail.right != null) leftTail = leftTail.right;
			leftTail.right = root.right;
			root.right = root.left;
			root.left = null;
		}
		if(root.right != null){
			flatten(root.right);
		}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
