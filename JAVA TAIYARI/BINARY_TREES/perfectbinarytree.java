package BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class perfectbinarytree {
//     🌳 Perfect Binary Tree kya hota hai?
// Har level fully filled hota hai
// Leaf nodes sab same level par hote hain
// Total nodes = 2^h - 1
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    node a = new node( 1);
    node b = new node(2);
    node c = new node(3);
    node d = new node(4);
    node e = new node(5);
    node f = new node(6);
    node g  = new node(7);

    a.left = b; a.right= c ;
    b.left = d; b.right = e;
    c.left = f; c.right = g;

    System.out.println("binary tree is ; ");
    print(a);
    System.out.println();

    System.out.println("perfect binary tree: " + perfect(a));

    }
    private static void print(node root ){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    private static int height(node root){
        if(root == null ) return 0;
        return 1+ height(root.left);
    }
    private static int count(node root){
        if(root == null ) return 0 ;
        return 1 + count(root.left) + count(root.right);

    }
    private static boolean perfect(node root){
        int h = height(root);
        int n = count(root);
        return n == (Math.pow(2, h) - 1);

    }

}
