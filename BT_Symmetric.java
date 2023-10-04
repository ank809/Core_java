import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BT_Symmetric {
    
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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
            TreeNode currentNode1=queue.poll();
             TreeNode currentNode2=queue.poll();
             if(currentNode1==null && currentNode2==null){
                 continue;
             }
             if(currentNode1==null || currentNode2==null){
                 return false;
             }
             if(currentNode1.val!=currentNode2.val){
                 return false;
             }
                 queue.add(currentNode1.left);
                 queue.add(currentNode2.right);
                 queue.add(currentNode1.right);
                 queue.add(currentNode2.left); 
            
        }
        return true;
    }
}
}
