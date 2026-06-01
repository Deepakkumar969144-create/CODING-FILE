package taiyarijavaa.BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class printtrees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(-3);
        node b = new node(-5);
        node c = new node(-2);
        node d = new node(-7);
        node e = new node(-1);
        node f  = new node(-6);

        a.left = b;  a.right = c;
        b.left = d;  b.right = e;
        c.left = f ;

        print(a);

    }
    private static void print (node root ){
        if( root == null ) return ;
        System.out.print(root . val + " ");
        print( root.left);
        print( root.right);

    }
    
}
