//  Average of levels of Binary Tree
//https://leetcode.com/problems/average-of-levels-in-binary-tree/ 
// 637

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class AverageLevelsInBinaryTree {
    
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result= new ArrayList<>();
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int level= queue.size();
            double average= 0;
            for(int i=0; i<level; i++){
                TreeNode currentNode= queue.poll();
                average+=currentNode.val;
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            average=average/level;
            result.add(average);
        }
        return result;
    }
}
}
