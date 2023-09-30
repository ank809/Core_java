// BREADTH SEARCH TREE (BST) 
// 102 on leetcode 
// Print tree in level order 
// ans lies near root 
// operation level by level

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeLevelOrder {
    
 //Definition for a binary tree node.
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        Queue<TreeNode> queue= new LinkedList<>();
        if(root==null){
            return result;
        }
        queue.offer(root);

        while(!queue.isEmpty()){
            int level= queue.size();
            List<Integer> currentListNode= new ArrayList<>(level);
            for(int i=0; i<level; i++){
                TreeNode currentNode= queue.poll();
                currentListNode.add(currentNode.val);
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
           result.add(currentListNode);
        }
        return result;
    }
}
}
