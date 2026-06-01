package taiyarijavaa.HEAPS;
import java.util.Scanner;

import taiyarijavaa.HEAPS.isbinarytreesheap.node;

import java.util.*;

public class bsttospecialmaxheapp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    }
    static int idx ;
    public static void converttomaxheaputil(node root ){
        idx = 0 ;
        ArrayList<Integer> in = new ArrayList<>();
        inorder(root,in);
        postorder(root, in );

    }
    private static void postorder (node root , ArrayList<Integer> in ){
        if(root == null ) return;
        postorder(root.left , in );
        postorder(root.right , in );
        root.data = in.get(idx++ ) ;

    }
    private static void inorder(node root , ArrayList<Integer> in ){
        if(root == null ) return;
        inorder(root.left, in );
        in.add(root.data);
        inorder(root.right, in );
        
    }
    
}
