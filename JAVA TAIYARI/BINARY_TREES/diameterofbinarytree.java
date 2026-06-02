package BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class diameterofbinarytree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f;

        System.out.println("binary tree is : ");
        print(a);
        System.out.println();

        System.out.println("diameter of binary tree is : " + new diameterofbinarytree().diameter(a));
    }
    private static void print(node root){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
      static int max;
    int diameter(node root){
        max = 0; 
        levels(root);
        return max;

    }
    int levels(node root){
        if(root == null ) return 0; 
        int leftlevels = levels(root.left);
        int rightlevels = levels(root.right);
        max = Math.max(max, leftlevels + rightlevels);
        return 1 + Math.max(leftlevels, rightlevels);
        
    }

}
