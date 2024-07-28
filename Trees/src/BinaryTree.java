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
        System.out.println("Do you want to enter left of: "+ node.value); //initially node.value is root node which changes as nodes inserted
        boolean left = scanner.nextBoolean();  //left check
        if(left){  //same as if(left == true)
            System.out.println("Enter the left of: "+node.value);
            int value = scanner.nextInt();
            node.left= new Node(value);     //create a new node out of it
            populate(scanner,node.left);    //call (recursion)populate again for newly created left node
            } //if left == false :-
        System.out.println("Do you want to enter right of: "+ node.value);
        boolean right = scanner.nextBoolean();  //right check
        if(right){
            System.out.println("Enter the right of: "+node.value);
            int value = scanner.nextInt();
            node.right= new Node(value);            //literally copy & paste of left concept
            populate(scanner , node.right);
        }
        //no base condition (since jitna bada tree banana ho bana skte hai) for user
    }
    public void display(){         ///display of the tree
        display(this.root,"");
    }
    private void display(Node node , String indent){        //indentation is the way of representing the code ! (career essentials for SD microsoft lecture notes)
        if(node==null){     //base condition
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
            System.out.println("|------>" + node.value);
        }else{
                System.out.println(node.value);
            }
        prettyDisplay(node.left,level+1);
        }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
        System.out.println();
    }
    public void inOrder(){
        preOrder(root);
    }
    private void inOrder(Node node){
        if (node == null){
            return;
        }
        preOrder(node.left);
        System.out.print(node.value+" ");
        preOrder(node.right);
        System.out.println();
    }
    public void postOrder(){
        preOrder(root);
    }
    private void postOrder(Node node){
        if (node == null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.value+" ");
    }
    }
