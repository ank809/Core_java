//https://leetcode.com/problems/kth-smallest-element-in-a-bst/

import javax.swing.tree.TreeNode;

public class BST_KthSmallestElement {
    
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
    public int kthSmallest(TreeNode root, int k) {
        //as we have to return the value 
        return helper(root, k).val;
    }
    int count=0;
   public TreeNode helper(TreeNode node, int k){
       if(node==null){
           return null;
       }
       TreeNode left= helper(node.left, k);
       if(left!=null){
           return left;
       }
       count++;
       // when the value of count and k is equal that means we have found our ans ie. 
       //current node 
       if(count==k){
           return node;
       }
       return helper(node.right, k);
    }
}
}
