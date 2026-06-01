package taiyarijavaa.BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class maxminlevels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(-4);
        node b = new node(-7);
        node c = new node(-3);
        node d = new node(-8);
        node e = new node(5);
        node f = new node(9);

        a.left = b ; a.right = c;
        b.left = d ; b.right = e;
        c.right = f;

        System.out.println("binary trees");
        print(a);
        System.out.println();
        System.out.println("max " + max(a));
        System.out.println("levels " + levels(a));

    }
    private static void print( node root){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    private static int max(node root){
        if(root == null ) return Integer.MIN_VALUE;
        return Math.max(root.val , Math.max(max(root.left) , max(root.right)));

    }
    private static int min(node root){
        if(root == null ) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left) , min(root.right)));

    }
    private static int levels(node root){
        if(root == null ) return 0;
        int leftlevel = levels(root.left);
        int rightlevel = levels(root.right);
        return 1 + Math.max(leftlevel , rightlevel);

    }
}
