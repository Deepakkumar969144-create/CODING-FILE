package BINARY_SEARCH_TREES;
import java.util.Scanner;

import java.util.*;

public class largestbstt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(20);
        node b = new node(8);
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

        System.out.println("largest bst : ");
        int result = largestbst(a);
        System.out.println(result);

    }
    private static void print(node root ){
        if(root == null ) return;
        System.out.print( root.data + " ");
        print(root.left );
        print(root.right);

    }
    static class quad {
        int max;
        int min;
        int size ;
        boolean isbst;
        quad( int max , int min , int size , boolean isbst){
            this.max = max;
            this.min = min;
            this.size = size;
            this.isbst = isbst;

        }
    }
    static int maxsize;
    private static int largestbst(node root ){
        maxsize = 0 ;
        helper (root);
        return maxsize;

    }
    private static quad helper( node root ){
        if( root == null ) return new quad(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);
        quad lst = helper( root.left);
        quad rst = helper(root.right);
        int max = Math.max(root.data, Math.max(lst.max, rst.max));
        int min = Math.min(root.data, Math.min(lst.min, rst.min));
        int size = 1 + lst.size + rst.size;
        boolean isbst = lst.isbst && rst.isbst && (lst.max < root.data ) && ( rst.min > root.data);
        if( isbst ) maxsize = Math.max(size, maxsize);
        return new quad(max, min, size, isbst);

    }    
}
