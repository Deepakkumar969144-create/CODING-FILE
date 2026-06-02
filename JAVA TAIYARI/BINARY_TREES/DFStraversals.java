package BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class DFStraversals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(5);
        node b = new node(4);
        node c = new node(-3);
        node d = new node(8);
        node e = new node(-2);
        node f = new node(1);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        System.out.println("binary trees");
        print(a);
        System.out.println();
        
        System.out.print("preorder: ");
        preorder(a);
        System.out.println();

        System.out.print("inorder: ");
        inorder(a);
        System.out.println();

        System.out.print("postorder: ");
        postorder(a);
        System.out.println();

    }
    private static void print(node root){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    private static void preorder(node root){
        if(root == null ) return;
        System.out.print( root.val + " ");
        preorder(root.left);
        preorder(root.right);

    }
    private static void inorder(node root ){
        if(root == null ) return;
        inorder(root.left);
        System.out.print( root.val + " ");
        inorder(root.right);

    }
    private static void postorder(node root ){
        if( root == null ) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print( root.val + " ");

    }
    
}
