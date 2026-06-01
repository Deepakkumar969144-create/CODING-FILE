package taiyarijavaa.BINARY_TREES;
import java.util.*;

public class balancedbinarytree { // |height(left) - height(right)| <= 1 condintion 
    public static void main(String[] args) {

        node a = new node(5);
        node b = new node(4);
        node c = new node(-3);
        node d = new node(8);
        node e = new node(-2);
        node f = new node(1);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        System.out.println("Binary Tree:");
        print(a);

        System.out.println("\nIs Balanced: " + isBalanced(a));

    }
    private static void print(node root){
        if(root == null ) return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);

    }
    public static boolean isBalanced(node root){
        return height(root) != -1;

    }

    // returns height OR -1 if unbalanced
    private static int height(node root){
        if(root == null) return 0;

        int left = height(root.left);
        if(left == -1) return -1;

        int right = height(root.right);
        if(right == -1) return -1;

        if(Math.abs(left - right) > 1) return -1; // important

        return Math.max(left, right) + 1;

    }

}
