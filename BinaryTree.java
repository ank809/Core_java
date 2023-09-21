import java.util.*;
public class BinaryTree {
    
    private class Node{
        int value;
        Node left;
        Node right;

        Node(int val){
            this.value= val;
        }
    }

    private Node root;

    public void insert(Scanner sc ){
        System.out.println("Enter the root node");
        int val= sc.nextInt();
        root= new Node(val);
        insert(sc, root);

    }

    public void insert(Scanner sc, Node node){
        System.out.println("Do you want to insert the left of the "+ node.value);
        boolean left= sc.nextBoolean();
        if(left){
            System.out.println("Enter the element you want insert on left of "+ node.value);
            int val= sc.nextInt();
            node.left= new Node(val);
            insert(sc, node.left);
        }

       System.out.println("Do you want to insert the right of the "+ node.value);
        boolean right= sc.nextBoolean();
        if(right){
            System.out.println("Enter the value you want to insert on right of "+ node.value);
            int val= sc.nextInt();
            node.right= new Node(val);
            insert(sc, node.right);
        }
    }

    public void display(){
        display(root, " ");
    }

    void display(Node node, String indent){
        if(node ==null){
            return;
        }
        System.out.println(node.value+indent);
        display(node.left, indent+ '\t');
        display(node.right, indent+'\t');
    }
    
    public void prettydisplay() {
   prettydisplay(root, 0);
}

private void prettydisplay(Node node, int level) {
    if (node == null) {
        return;
    }
    prettydisplay(node.right, level+1);
    if(level!=0){
        for(int i=0; i<level-1; i++){
            System.out.print("| \t\t");
        }
        System.out.println("|----->"+ node.value);
    }
    else{
        System.out.println(node.value);
    }
    prettydisplay(node.left, level+1);
}
    public static void main(String[] args) {
        BinaryTree tree= new BinaryTree();
        Scanner sc= new Scanner (System.in);
        tree.insert(sc);
        tree.prettydisplay();
    }
}
