import java.util.LinkedList;
import java.util.Queue;
// space and time complexit o(N)

public class LevelOrderSuccessorBT {

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
    public TreeNode findSucccessor(TreeNode root, int key){
        if(root==null){
            return null;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        TreeNode ans= null;
        while(!queue.isEmpty()){
            int level= queue.size();
            for(int i=0; i<level; i++){
                TreeNode currentNode= queue.poll();
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }

                if(currentNode.val==key){
                    ans= currentNode;
                }
            }
            break;
        }
        return ans;
    }
}
