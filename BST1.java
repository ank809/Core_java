    public class BST1{
        public class Node{
        int value;
        Node left;
        Node right;
        int height;
      
        Node(int val){
          this.value=val;
        }
        }
        public Node root;
      
        public void insert(int val){
          root= insert(val, root);
        }
      
        public  void insertArr(int nums[]){
          for(int i=0; i<nums.length; i++){
            insert(nums[i]);
          }
        }
        public Node insert(int val, Node node){
          if(node==null){
            node = new Node(val);
            return node;
          }
          if(val<node.value){
            node.left= insert(val, node.left);
          }
          if(val>node.value){
            node.right= insert(val, node.right);
          }
          return node;
        }

        // preorder traversal 

        public void preOrder(){
            preOrder(root);
        }
        private void preOrder(Node node){
            if(node==null){
                return;
            }
            System.out.print(node.value+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
        // inOrder traversal 

        public void inOrder(){
            inOrder(root);
        }
        private void inOrder(Node node){
            if(node==null){
                return;
            }
            inOrder(node.left);
            System.out.print(node.value+" ");
            inOrder(node.right);
        }
        // preorder traversal 

        public void postOrder(){
            postOrder(root);
        }
        private void postOrder(Node node){
            if(node==null){
                return;
            }
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value+" ");
        }
      
        public void display(){
          display(root, "This is root node");
        }
        public void display(Node node, String details){
          if(node==null){
            return;
          }
          System.out.println(details+ node.value);
          display(node.left, "This is left child of "+node.value+" ");
           display(node.right, "This is right child of "+node.value+" ");
          return;
        }
      
        public static void main (String args[]){
          BST1 tree= new  BST1();
          int arr[]={4,8,9,3,7,6,2,18};
          tree.insertArr(arr);
          tree.display();
          tree.preOrder();
          System.out.println();
          tree.inOrder();
          System.out.println();
          tree.postOrder();
        }


      }
