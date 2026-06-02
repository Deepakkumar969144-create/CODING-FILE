package BINARY_SEARCH_TREES;
import java.util.Scanner;
import java.util.*;
    // bst to gst ( bst to greater sum tree)- 
public class bsttogst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 1,2,3,4,5,6,7};

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

        System.out.println("bst to gst [ bst to freater sum tree ; ");
        reverseinorder(a);
        print(a);

        System.out.println();
        node root = sortedarraytobst(arr);
        sum = 0;
        transformtree(root);
        print(root);

    }
    private static void print(node root ){
        if(root == null ) return ;
        System.out.print( root.data + " ");
        print(root.left);
        print(root.right);

    }
    static int sum;
    private static void reverseinorder( node root ){
        if( root == null ) return;
        reverseinorder(root.right);
        int val = root.data;
        root.data = sum;
        sum+= val;
        reverseinorder(root.left);

    }
    private static void transformtree(node root){
        sum = 0 ;
        reverseinorder(root);

    }
            // method =2 
    private static node sortedarraytobst(int [] arr){
        int n = arr.length;
        return convert(arr, 0 , n-1 );
    
    }
    private static node convert( int [] arr , int lo , int hi   ){
        if( lo > hi ) return null ;
        int mid = (lo + hi )/2  ;
        node  root = new node(arr[mid ] );
        root.left = convert(arr, lo, mid -1);
        root.right = convert(arr, mid +1 , hi);
        return root ;

    }
}
