package BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class identicaltrees {
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

        System.out.println("binary trees first : ");
        print(a);
        System.out.println();

        node g = new node(1);
        node h = new node (2);;
        node i = new node(3);
        node j= new node(4);
        node k = new node(5);

        g.left = h ; g.right = i;
        h.left = j ; h.right = k;
        i.right = k;

        System.out.println("binary trees second : ");
        print(g);
        System.out.println();

        System.out.println("identical trees: " + identical(a, g));

    }
    private static void print(node root){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    private static boolean identical(node root1 , node root2){
        if(root1 == null && root2 == null ) return true;
        if(root1 == null || root2 == null ) return false;
        if( root1.val != root2.val ) return false ;
        return identical(root1.left, root2.left) && identical(root1.right, root2.right);

    }

}
