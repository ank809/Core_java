import javax.swing.tree.TreeNode;

public class BT_Cousins {
    
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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx= findNode(root, x);
        TreeNode yy= findNode(root, y);
        return (
            (levels(root, xx, 0)==levels(root, yy, 0)) && (!isSibling(root, xx , yy))
        );
    }
    TreeNode findNode(TreeNode node , int x){
        if(node==null){
            return node;
        }
        if(node.val==x){
            return node;
        }
        TreeNode n= findNode(node.left, x);
        if(n!=null){
            return n;
        }
        return findNode(node.right, x);
    }
     boolean isSibling(TreeNode node,TreeNode x, TreeNode y){
        if(node==null){
            return false;
        }
        return (
            (node.left==x && node.right==y)|| (node.left==y && node.right==x)||
            isSibling(node.left, x, y)|| (isSibling(node.right, x, y))
        );
    }

    int levels(TreeNode node, TreeNode x, int level){
        if(node==null){
            return 0;
        }
        if(node==x){
            return level;
        }
        int l = levels(node.left, x, level+1);
        if(l!=0){
            return l;
        }
        return levels(node.right, x, level+1);
    }

   
}
}
