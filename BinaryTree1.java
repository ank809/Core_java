import java.util.Scanner;

public class BinaryTree1 {
    class Node {
        int value;
        Node left;
        Node right;

        Node (int val){
            this.value= val;
        }
    }

    private Node root;

    public void populate(Scanner sc){
        System.out.println("Enter the root node");
        int val= sc.nextInt();
        root= new Node(val);
        populate(sc, root);

    }

    public void populate(Scanner sc, Node node){
        System.out.println("Do you want to insert left of "+ node.value);
        boolean left= sc.nextBoolean();
        if(left){
            System.out.println("Enter the value you want to insert on left of "+node.value);
            int n= sc.nextInt();
            node.left= new Node(n);
            populate(sc, node.left);
        }
        System.out.println("Do you want to insert on right of "+ node.value);
        boolean right= sc.nextBoolean();
        if(right){
            System.out.println("Enter the value you want to insert on right of "+node.value);
            int n= sc.nextInt();
            node.right= new Node(n);
            populate(sc, node.right);
        }
    }


    public void display(){
        display(root, 0);
    }

    public void display(Node node, int level){
        if (node == null) {
            return;
        }
        System.out.println(root.value);
        display(node.right, level+1);
        if(level!=0){
            for(int i=0; i<level; i++){
                System.out.println("| \t\t");
            }
            System.out.println("----->" +node.value);
        }
        else{
            System.out.println(node.value);
        }
        display(node.left, level+1);

    }

    public static void main(String[] args) {
        BinaryTree1 tree= new BinaryTree1();
        Scanner sc= new Scanner(System.in);
        tree.populate(sc);
        tree.display();
    }
}
