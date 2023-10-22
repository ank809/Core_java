//https://leetcode.com/problems/path-sum/

public class BT_PathSum {
    
 // Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        targetSum= targetSum-root.val;
        // If we've reached a leaf node and the remaining targetSum is 0, return true
        if (root.left == null && root.right == null && targetSum == 0) {
            return true;
        }
        boolean leftans= hasPathSum(root.left, targetSum);
        boolean rightans= hasPathSum(root.right, targetSum);
        return leftans||rightans;
    }
}
}
