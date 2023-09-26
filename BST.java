public class BST {
        class Node{
          private int value;
          private Node right;
          private Node left;
          private int height;
      
          Node (int val){
            this.value=val;
          }
        }
      
        Node root;
        public void  insert(int val){
          root= insert(root, val);
        }
      
        public Node insert(Node node, int val){
      
          if(node==null){
            node = new Node(val);
            return node;
          }
          if(val<node.value){
            node.left= insert(node.left, val);
          }
          if(val>node.value){
            node.right= insert(node.right, val);
          }
          node.height= Math.max(height(node.left), height(node.right))+1;
          return node;
        }
      
        public int height(Node node){
          if(node==null){
            return -1;
          }
          return node.height;
        }
      
        public boolean isEmpty(){
          return root==null;
        }
        
      public void populate(int [] nums){
        for(int i=0; i<nums.length; i++){
          this.insert(nums[i]);
        }
      }

      // for sorted arrays
      public void populateSorted(int [] nums){
        populateSorted(nums, 0, nums.length);
      }
      private void populateSorted(int [] nums, int start, int end){
        if(start>=end){
          return;
        }
        
        int mid= (start+end)/2;
        // get the middle value and insert it 
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
      }
        public void display(){
          display(root, "Root node is");
        }
      
        public void display(Node node, String details){
          if(node==null){
            return;
          }
          System.out.println(details+node.value);
          display(node.left, "This is left child of "+node.value+" : ");
          display(node.right, "This is right child of "+node.value+" : ");
        }
      
        public boolean isBalanced(){
          return isBalanced(root);
        }
        public boolean isBalanced(Node node){
          if(node==null){
            return true;
          }
          return Math.abs(height(node.left)-height(node.right))<=1  && isBalanced(node.left) && isBalanced(node.right);
        }
      
         public static void main(String [] args){
          BST tree= new BST();
          // int arr[]= {5,8,9,3,4,6,1, 10, 11};
          // tree.populate(arr);

          int arr[]= {1, 2, 3, 4 , 5, 6, 7, 8 , 9, 10};
          tree.populateSorted(arr);
          tree.display();
          System.out.print(tree.isBalanced());
        }
      }
