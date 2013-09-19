class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
	private int r_isBalanced(TreeNode root){
		if(root == null){
			return 0;
		}
		int hLeft = 0; int hRight = 0;
		if((hLeft = r_isBalanced(root.left)) < 0) return -1;
		if((hRight = r_isBalanced(root.right)) < 0) return -1;
		if (Math.abs(hLeft - hRight) > 1){
			return -1;
		}
		else{
			return hLeft > hRight ? hLeft + 1 : hRight + 1;
		}
	}
	
    public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	return r_isBalanced(root) >= 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	TreeNode root = new TreeNode(1);
    	root.right = new TreeNode(2);
    	root.right.right = new TreeNode(3);
    	
    	Solution s = new Solution();
    	System.out.println(s.isBalanced(root));
	}

}
