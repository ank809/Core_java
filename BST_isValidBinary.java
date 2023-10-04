import javax.swing.tree.TreeNode;

public class BST_isValidBinary {
  
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
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }
    public boolean isValid(TreeNode node, Integer low, Integer high){
        if(node==null){
            return true;
        }
        if(low!=null && low>=node.val){
            return false;
        }
        if(high!=null && high<=node.val){
            return false;
        }
        boolean leftTree= isValid(node.left , low, node.val);
        boolean rightTree= isValid(node.right, node.val, high);
        return leftTree && rightTree;
    }
}
}
