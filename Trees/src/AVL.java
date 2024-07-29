 class AVL {
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {   //passing value to constructor
            this.value = value;
        }
        public int getValue(){    //getting value
            return value;
        }
    }

    private Node root;  //first node declaration
    public AVL(){       //AVL constructor
    }
    public int height() {
        return height(root);
    }
    private int height(Node node){   //Height
        if (node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){  //if no root
        return root==null;
    }

    //inserting values
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value, Node node){
        if (node == null){
            node= new Node(value);
            return node;
        }
        if (value < node.value){
            node.left = insert(value,node.left);
        }
        if (value > node.value){
            node.right = insert(value,node.right);
        }

        node.height =  Math.max(height(node.left),height(node.right))+1;    //changing height
        return rotate(node);
    }

    // 4 cases of AVL
    private Node rotate(Node node) {
        //left heavy
        if (height(node.left)-height(node.right)>1){
            //Left-Left
            if (height(node.left.left)-height(node.left.right)>0){
                //rotate p(parent) right
                return rightRotate(node);
            }
            //Left-Right
            if (height(node.left.left)-height(node.left.right)<0){
                //left rotate c (child)
                node.left = leftRotate(node.left); //make tree and visualise then only you will understand
                //right rotate p
                return rightRotate(node);
            }
        }
        //right heavy
        if (height(node.left)-height(node.right)<-1){
            //Right-Right
            if (height(node.right.left)-height(node.right.right)<0){
                //rotate p(parent) left
                return leftRotate(node);
            }
            //Right-Left
            if (height(node.right.left)-height(node.right.right)>0){
                //right rotate c (child)
                node.right = rightRotate(node.right); //make tree and visualise then only you will understand
                //left rotate p
                return leftRotate(node);
            }
        }
        return node;
    }
    // right rotation (direct visualisation using trees)
    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right; // or , p.left.right

        //after rotation
        c.right=p;
        p.left=t;

        //updating heights
        p.height = Math.max(height(p.left),height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;

        // after rotation c is the node
        return c;
    }
    //left rotation
    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        //after rotation
        p.left = c;
        c.right = t;

        //updating heights
        c.height = Math.max(height(c.left),height(c.right))+1;
        p.height = Math.max(height(p.left),height(p.right))+1;

        return p; //since after rotation c is the node
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    //Main function
     public static void main(String[] args) {
         AVL tree = new AVL();
         for (int i = 0; i < 10 ; i++) {
             tree.insert(i);
         }
         System.out.println(tree.height());
     }
}
