import java.util.Scanner;

public class BinaryTree {
    public BinaryTree() {
    }
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;
    //insert elements
    public void populate(Scanner scanner){
        System.out.print("Enter the root node: ");
        int value = scanner.nextInt();    //no need of creating object of scanner
        root = new Node(value);    //stored in new node as value so that we can access via node.value
        populate(scanner,root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of: "+ node.value);
        boolean left = scanner.nextBoolean();  //left check
        if(left){
            System.out.println("Enter the left of: "+node.value);
            int value = scanner.nextInt();
            node.left= new Node(value);
            populate(scanner,node.left);
            }
        System.out.println("Do you want to enter right of: "+ node.value);
        boolean right = scanner.nextBoolean();  //left check
        if(right){
            System.out.println("Enter the right of: "+node.value);
            int value = scanner.nextInt();
            node.right= new Node(value);
            populate(scanner , node.right);
        }
    }
    public void display(){
        display(this.root,"");
    }
    private void display(Node node , String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left , indent +"  ");
        display(node.right , indent +"  ");
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    private void prettyDisplay(Node node,int level){
        if(node == null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if (level!=0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-->" + node.value);
        }else{
                System.out.println(node.value);
            }
        prettyDisplay(node.left,level+1);
        }

    }