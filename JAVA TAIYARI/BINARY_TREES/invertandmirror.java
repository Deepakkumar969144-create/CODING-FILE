package BINARY_TREES;
import java.util.Scanner;

import java.util.*;

public class invertandmirror { // invert and mirror same 
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

        System.out.println("inverted binary trees:");
        invert(a);
        print(a);
        System.out.println();

        System.out.println("mirror binary trees:");
        mirror(a);
        print(a);
        System.out.println();

    }
    private static void print(node root ){
        if( root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    private static void invert(node root){
        if(root == null ) return;
        node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);

    }
    // mirror thosa aalag hai to ans same nhi aayega but invert and mirror same hote hai 
    private static void mirror(node root){
        if(root == null) return;
        mirror(root.left);
        node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.right);

    }

}
