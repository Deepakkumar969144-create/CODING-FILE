package taiyarijavaa.BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class balancedtreecheack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        // node e = new node(50);
        // node f = new node(60);

        a.left = b; a.right = c;
        b.left = d; // b.right = e;
        // c.left = f;

        System.out.println("binary tree is : ");
        print(a);
        System.out.println();

        System.out.println("balaanced tree: " + balanced(a));

    }
    private static void print(node root){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    static boolean flag ;
    public static boolean balanced(node root){
        if( root == null ) return true;
        flag = true;
        levels(root);
        return flag;

    }
    private static int levels(node root) {
        if(root == null ) return 0 ;
        int leftlevels = levels(root.left);
        int rightlevels = levels(root.right);
        if(Math.abs(leftlevels - rightlevels ) > 1 ) flag = false;
        return 1 + Math.max(leftlevels, rightlevels); 

    }
}
