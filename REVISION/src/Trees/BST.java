package Trees;

import java.util.*;

public class BST {
    class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    //insert - understand by debug
    public Node insert(Node root, int val) {
        if(root==null) {
            root = new Node(val);
            return root;
        }
        if(val<root.data) {
            root.left = insert(root.left,val); //storing to proceed further
        }
        if(val>root.data) {
            root.right = insert(root.right,val);
        }
        return root;
    }


    //inorder
    public void inorder(Node root) {
        if(root==null) {
            return;
        }
        //left-root-right
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    //search
    public boolean search(Node root, int key) {
        if(root==null) {
            return false;
        }
        else if(key==root.data) {
            return true;
        }
        else if(key>root.data) {
            return search(root.right,key);
        }
        else if(key<root.data) {
            return search(root.left,key);
        }
        return false;
    }


    //delete
    public Node delete(Node root,int val) {
        // if(root==null){
        //     return; //how will you return, click kiya ye to hoga hi nhi
        // }
        if(val>root.data) {
            root.right = delete(root.right,val); //proceed futher
        }
        else if(val<root.data) {
            root.left = delete(root.left,val);
        }
        else { // 3 cases
            // No Child
            if(root.right==null && root.left == null) {
                return null;
            }
            // 1 Child
            // left side
            else if(root.right==null) { //DOUBT(cleared) basic visualisation
                return root.left;
            }
            //right side
            else if(root.left == null) {
                return root.right;
            }
            //2 Child - replace node with IS then remove IS
            Node IS = findIS(root.right); //right sub tree
            root.data = IS.data;
            // return delete(IS ,val); //DOUBT - cleared
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public Node findIS(Node root) {
        while(root.left!=null) { //doubt- cleared
            root= root.left;
        }
        return root;
    }


    //paths
    public void root2Leaf(Node root, ArrayList<Integer> path) {
        if(root==null) {
            return;
        }
        path.add(root.data);
        // if reached leaf
        if(root.right==null && root.left==null) {
            printPaths(path);
        }
        root2Leaf(root.right,path);
        root2Leaf(root.left,path);
        path.remove(path.size()-1);
    }
    public void printPaths(ArrayList<Integer> path) {
        for (int i=0; i<path.size() ; i++ ) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }


    //main
    public static void main (String[] args) {
        BST bst = new BST();
        int[] val = {5,1,3,4,2,7};
        Node root = null;
        for (int i=0; i<val.length ; i++ ) {
            root = bst.insert(root,val[i]);
        }
        bst.inorder(root);
        System.out.println();
        System.out.println(bst.search(root,99));
        // bst.delete(root,5);
        // bst.inorder(root);
        bst.root2Leaf(root,new ArrayList<>());
    }
}