public class AVL {
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
        return rotate(node);
      }

      private Node rotate(Node node){
        if(height(node.left) - height(node.right)>1){
            // left heavy
            if(height(node.left.left) - height(node.left.right)>0){
                // left left heavy
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right)<0){
                //  left right heavy
                node.left= leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left) - height(node.right)<-1){
            // right heavy
            if(height(node.right.left) - height(node.right.right)>0){
                // right left heavy
                node.right= rightRotate(node.right);
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right)<0){
                //  right right heavy
                return leftRotate(node);
            }
        }
        return node;

      }

      public Node rightRotate(Node p){
        Node c= p.left;
        Node t= c.right;
        c.right=p;
        p.left=t;
        p.height= Math.max(height(p.left), height(p.right)+1);
        c.height= Math.max(height(c.left), height(c.right)+1);

        return c;
      }
      public Node leftRotate(Node c){
        Node p= c.right;
        Node t= p.left;
        p.left=c;
        c.right=t;
        p.height= Math.max(height(p.left), height(p.right)+1);
        c.height= Math.max(height(c.left), height(c.right)+1);

        return p;
      }
    
      public int height(){
        return height(root);
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
        AVL tree= new AVL();
        for(int i=0; i<1000; i++){
            tree.insert(i);
        }
        System.out.println(tree.height());
      }
    }

