package taiyarijavaa.BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class sizesumproduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(-3);
        node b = new node(-4);
        node c = new node(-5);
        node d = new node(-6);
        node e = new node(-7);
        node f = new node(8);

        a.left = b; a.right = c ;
        b.left = d ; b.right = e ;
        c.right = f;

        System.out.println("binary tree");
        print(a);
        System.out.println();

        System.out.println("size " + size(a));
        System.out.println("sum " + sum(a));
        System.out.println("product " + product(a));

    }
    private static void print(node root ){
        if( root == null ) return;
        System.out.print( root.val + " "); // root 
        print(root.left); // left subtree
        print(root.right); // right subtree

    }
    private static int size(node root ){
        if(root == null ) return 0 ;
        return 1 + size(root.left) + size(root.right);
        
    }
    private static int sum( node root ){
        if(root == null ) return 0 ;
        return root.val + sum(root.left) + sum(root.right);

    }
    private static int product(node root ){
        if(root == null ) {
            return 1;
        }
        return root.val * product(root.left)*product(root.right);
    }
    
}
