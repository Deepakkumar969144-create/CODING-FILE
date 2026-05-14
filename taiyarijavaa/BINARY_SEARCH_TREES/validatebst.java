package taiyarijavaa.BINARY_SEARCH_TREES;
import java.util.Scanner;

import taiyarijavaa.QUEUES.rearrangequeue;

import java.util.*;

    // max - min pair return - 
public class validatebst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(2);
        node b = new node(1);
        node c = new node(6);
        node d = new node(3);
        node e = new node(7);

        a.left = b ;
        a.right = c;
        c.left = d;
        c.right = e;

        System.out.println("binary search tree : ");
        print(a);
        System.out.println();

        System.out.print("validate bst : ");
        validatebst obj = new validatebst();
        System.out.print(obj.isbst(a));

    }
    private static void print(node root ){
        if( root == null ) return;
        System.out.print( root.data + " ");
        print(root.left);
        print(root.right);

    }
    class pair {
        int max ;
        int min;
        pair( int max , int min ){
            this.max = max;
            this.min = min;

        }
    }
    static boolean flag;
    boolean isbst(node root ){
        flag = true;
        maxmin(root);
        return flag;

    }
    pair maxmin(node root ){
        if(root == null ) return new pair(Integer.MIN_VALUE, Integer.MAX_VALUE);
        pair lst = maxmin(root.left);
        pair rst = maxmin(root.right);
        int max = Math.max(root.data, Math.max(lst.max, rst.max));
        int min = Math.min(root.data, Math.min(lst.min, rst.min));
        if(lst.max >= root.data || rst.min <= root.data) flag = false;
        return new pair(max, min);

    }

}
