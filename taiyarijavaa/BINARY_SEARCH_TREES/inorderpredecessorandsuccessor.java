package taiyarijavaa.BINARY_SEARCH_TREES;
import java.util.Scanner;

import taiyarijavaa.BINARY_TREES.roottoleafpath;

import java.util.*;

// predecessor - root ka nust chhota bala node and successor - root ka just bada bala node 
public class inorderpredecessorandsuccessor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        node f = new node(60);
        node g = new node(70);
        node h = new node(80);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.right = h;

        System.out.println("binary search trees : ");
        print(a );
        System.out.println();

        System.out.println("predecessor and successor ");
        System.out.print(predecessor(a).data);
        System.out.println(" " +successor(a).data);

    }
    private static void print( node root ){
        if(root == null ) return;
        System.out.print( root.data + " ");
        print(root.left);
        print(root.right);;

    }
    // predecessor 
    private static node predecessor(node root ){
        node pred = root;
        pred = root.left;
        while ( pred.right != null ) {
            pred = pred.right;
            
        }
        return pred;

    }
    // successor
    private static node successor(node root ){ 
        node succ = root;
        succ = root.right;
        while (succ.left != null ) {
            succ = succ.left;
            
        }
        return succ;

    }
    
}
