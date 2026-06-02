package BINARY_SEARCH_TREES;
import java.util.Scanner;

import java.util.*;

public class lcaoftwonodesinabst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Integer [] arr = { 20,8,22,4,12,null,null,null,null,10, 14};
        node a = new node(20);
        node b = new node(8 );
        node c = new node(22);
        node d = new node(4);
        node e = new node(12);
        node f = new node(10);
        node g = new node(14);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.left = f; e.right = g;

        node p = b;
        node q = g;

        System.out.println("binary search trees; ");
        print(a);
        System.out.println();

        System.out.println("lca of 2 nodes in a bst : ");
        node ans = lca(a, p, q);
        System.out.print(ans.data);

    }
    private static void print(node root ){
        if( root ==  null ) return ;
        System.out.print( root.data + " ");
        print(root.left);
        print(root.right);

    }
    private static node lca ( node root , node   p , node q ){
        if( root.data > p.data && root.data > q.data) return lca(root.left, p, q);
        else if ( root.data < p.data && root.data < q.data) return lca(root.right , p, q);
        else return root;

    }

}
