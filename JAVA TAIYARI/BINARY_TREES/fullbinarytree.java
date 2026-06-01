package taiyarijavaa.BINARY_TREES;
import java.util.Scanner;

import java.util.*;

public class fullbinarytree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        node f = new node(60);
        node g = new node(70);

        a.left = b ; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        System.out.println("binary tree is : ");
        print(a);
        System.out.println();

        if(fullbinary(a)){
            System.out.println("full binary tree ");

        }
        else {
            System.out.println("not a full binary tree ");

        }
    }
    private static void print(node root){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    private static boolean fullbinary(node root ){
        if( root == null ) return true;
        if(root.left == null && root.right == null) return true; // leaf node
        if(root.left != null && root.right != null){ // 2 children
            return fullbinary(root.left) && fullbinary(root.right);
            
        }
        return false; // 1 child

    }
    
}
