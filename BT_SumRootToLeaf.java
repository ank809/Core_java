//https://leetcode.com/problems/sum-root-to-leaf-numbers/

public class BT_SumRootToLeaf {

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
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    int helper(TreeNode node, int sum){
        if(node==null){
            return 0;
        }
        sum= 10*sum+node.val;
        if(node.left==null && node.right==null){
            return sum;
        }
        int left= helper(node.left, sum);
        int right= helper(node.right, sum);
        return left+right;
    }
}
}
