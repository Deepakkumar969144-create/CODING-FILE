package taiyarijavaa.BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class kthlevels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        node f = new node(60);

        a.left = b; a.right = c;
        b.left = d ; b.right = e;
        c.left = f ; 

        System.out.println("binarry tree : ");
        print(a);
        System.out.println();

        System.out.println("kth level : ");
        for(int i = 0  ; i< level(a) ; i++ ){
            kthlevel(a, 0, i);
            System.out.println();

        }

    }
    private static void print (node root ){
        if( root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    private static void kthlevel( node root , int level , int k ){
        if( root == null ) return;
        if( level == k ) System.out.print(root . val + " ");
        kthlevel(root.left, level+1 , k);
        kthlevel(root.right, level+1 , k);

    }
    private static int level(node root ){
        if( root == null ) return 0 ;
        return 1+ Math.max(level(root.left) , level(root.right));

    }

}  
