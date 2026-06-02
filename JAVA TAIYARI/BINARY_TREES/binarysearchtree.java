package BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class binarysearchtree { // condition : Left subtree < Root < Right subtree
    public static void main(String[] args) {
        node root = null;
        // insert
        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 7);
        root = insert(root, 2);
        root = insert(root, 4);
        root = insert(root, 6);
        root = insert(root, 8);

        System.out.print("Inorder (Sorted): ");
        inorder(root);

        System.out.println("\nSearch 4: " + search(root, 4));
        System.out.println("Search 10: " + search(root, 10));

    }

    // INSERT
    public static node insert(node root, int val){
        if(root == null) return new node(val);

        if(val < root.val){
            root.left = insert(root.left, val);

        } 
        else {
            root.right = insert(root.right, val);

        }
        return root;

    }

    // SEARCH
    public static boolean search(node root, int key){
        if(root == null) return false;

        if(root.val == key) return true;

        if(key < root.val){
            return search(root.left, key);

        } 
        else {
            return search(root.right, key);

        }
    }

    // INORDER (sorted output)
    public static void inorder(node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);

    }
}

