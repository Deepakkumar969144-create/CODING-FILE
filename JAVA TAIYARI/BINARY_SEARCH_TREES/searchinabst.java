package BINARY_SEARCH_TREES;
import java.util.Scanner;
import java.util.*;
public class searchinabst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 31,18,3,-4,24,21,29,80,57,45,71,112,93,146};
        node a = new node(31);
        node b = new node(18);
        // node c = new node(80);
        node d = new node(3);
        node e = new node(24);
        node f = new node(-4);
        node g = new node(12);
        node h = new node(21);
        node i = new node(29);
        node j = new node(80);
        node k = new node(57);
        node l = new node(45);
        node m = new node(71);
        node  n = new node(112);
        node o = new node(93);
        node p = new node(146 );

        a.left = b;
        b.right = e; b.left = d;
        d.left = f; d.right = g;
        e.left = h; e.right = i;
        a.right = j;
        j.left = k; j.right = n;
        k.left = l; k.right = m;
        j.right = n;
        n.left = o; n.right= p;

        System.out.println("binary serach trees :");
        print(a);

        int target = 21 ;
        int x = target;

        System.out.println("search in a binary trees : " );
        boolean result = searchh(a, x);
        System.out.print(result);

    }
    private static void print(node root ){
        if( root == null ) return;
        System.out.print( root.data + " ");
        print(root.left);
        print(root.right );

    }
     private static boolean searchh(node root , int x ){
        if(root == null ) return false ;
        if(root.data == x ) return true;
        else if( root.data > x ) return searchh(root.left, x);
        else return searchh(root.right, x);

    }
    
}
