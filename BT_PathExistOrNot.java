public class BT_PathExistOrNot {
    public class Node{
        int val;
        Node left;
        Node right;
        Node(int value){
            this.val=value;
        }

    boolean findPath(Node root, int arr[]){
        if(root==null){
            return arr.length==0;
        }
        return helper(root, arr, 0);
    }
    boolean helper(Node node, int arr[], int index){
        if(node==null){
            return false;
        }
        if(index>arr.length && node.val!=arr[index]){
            return false;
        }
        if(node.left==null && node.right==null&& node.val==arr[index]){
            return true;
        }
        return helper(node.left, arr, index+1)|| helper(node.right, arr, index+1);
    }
}
}
