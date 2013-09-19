
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
	public TreeNode r_sortedArrayToBST(int[] num, int l, int r){
		if(l > r) return null;
		else if(l == r) return new TreeNode(num[l]);
		
		int m = l + (r - l)/2;
		TreeNode root = new TreeNode(num[m]);
		root.left = r_sortedArrayToBST(num, l, m - 1);
		root.right = r_sortedArrayToBST(num, m + 1, r);
		return root;
	}
	
	public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num.length == 0) return null;
        return r_sortedArrayToBST(num, 0, num.length - 1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
