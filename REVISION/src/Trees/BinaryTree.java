package Trees;

import java.util.Scanner;
public class BinaryTree{
    class Node{
        Node right;
        Node left;
        int val;

        public Node(int val){
            this.val = val;
        }
    }

    private Node root;

    //Insertion - a. root
    public void insert(Scanner sc){
        System.out.println("Enter root value:-");
        int val = sc.nextInt();
        root = new Node(val);
        insert(sc,root);
    }

    //Insertion - b. nodes //Overloading
    public void insert(Scanner sc, Node node){
        System.out.println("To enter left of: "+node.val+" - enter true rather false");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter left of: "+node.val);
            int val = sc.nextInt();
            node.left = new Node(val);
            insert(sc, node.left);
        }
        /* if false then directly he means to enter for right
        but we need to ask for this too - bcoz if user does'nt want to
        enter right also, when user wants to stop insertion */
        System.out.println("To enter right of: "+node.val+" - enter true rather false to stop");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter right of: "+node.val);
            int val = sc.nextInt();
            node.right = new Node(val);
            insert(sc, node.right);
        }
    }

    // Display - a. root
    public void display(){  // DOUBT - correct
        display(this.root,"  ");

    }
    // Display - b. nodes
    public void display(Node node, String indent){ //DOUBT - apply base condition
        if(node==null){ //corrected
            return;
        }
        System.out.print(node.val+indent);
        display(node.left,indent);
        display(node.right,indent);

    }
    public static void main (String[] args) {
        BinaryTree tree = new BinaryTree();
        // enter root value only next will be decided by the user
        Scanner sc = new Scanner(System.in);

        tree.insert(sc);
        tree.display();
    }
}
