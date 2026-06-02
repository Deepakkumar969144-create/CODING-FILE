package BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class symmetrictrees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(1);
        node b = new node(2);
        node c = new node(2);
        node d = new node(3);
        node e = new node(4);
        node f= new node(4);
        node g = new node(3);

        a.left = b; a.right = c;
        b.left = d ; b.right = e;
        c.left = f; c.right = g;

        System.out.println("binary trees: ");
        print(a);
        System.out.println();

        System.out.println("symmetric trees: " + symmetric(a));

    }
    private static void print (node root){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    private static void mirror(node root){
        if(root == null ) return;
        node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);

    }
    private static boolean identical(node p , node q ){
        if( p == null && q == null ) return true;
        if( p == null || q == null ) return false;
        if(p.val != q.val ) return false;
        return identical(p.left, q.left) && identical(p.right, q.right);
        
    }
    public static boolean symmetric(node root){
        mirror(root.left);
        return identical(root.left, root.right);
        
    }
    
}
