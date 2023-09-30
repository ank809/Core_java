// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class BinaryZIGZAG {
   
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        boolean reverse= false;
        while(!queue.isEmpty()){
            int level= queue.size(); 
            List<Integer> currentLevel= new ArrayList<>();
            for(int i=0; i<level; i++){
                // remove from front and add in last 
                if(!reverse){
                    TreeNode currentNode= queue.pollFirst();
                    if(currentNode!=null){
                    currentLevel.add(currentNode.val);
                    
                    if(currentNode.left!=null){
                        queue.addLast(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        queue.addLast(currentNode.right);
                    }
                    }
                }
                 else{
                    TreeNode currentNode= queue.pollLast();
                    currentLevel.add(currentNode.val);
                     if(currentNode.right!=null){
                        queue.addFirst(currentNode.right);
                    }
                    if(currentNode.left!=null){
                        queue.addFirst(currentNode.left);
                    }
                }
            }
            reverse= !reverse;
            result.add(currentLevel);
            
        }
        return result;
    }
}
}
