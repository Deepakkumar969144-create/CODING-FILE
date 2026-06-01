package taiyarijavaa.BINARY_SEARCH_TREES;
import java.util.Scanner;

import java.util.*;

public class kthsmallestelementinbst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(2);
        node b = new node(1);
        node c = new node(3);

        a.left = b;
        a.right = c;

        System.out.println("binary search trees: ");
        print(a);
        System.out.println();

        System.out.println("Kth smallest element in a BST : ");
        System.out.println(kthsmallest(a, 2));

    }
    private static void print(node root ){
        if( root == null ) return;
        System.out.print( root.data + " ");
        print(root.left);
        print(root.right);

    }
    public static void inorder ( node root , ArrayList< Integer> arr ){
        if( root == null ) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);

    }
    private static int kthsmallest(node root , int k ){
        ArrayList < Integer > arr = new ArrayList<>();
        inorder(root, arr);
        if( arr.size() < k ) return -1;
        return arr.get(k-1);

    }
    
    //      // metho d - 2 
    // static int ans;
    // static int k2 ;
    // private static void inorder( node root ){
    //     if(root == null ) return;
    //     inorder(root.left);
    //     k2--;
    //     if( k2 == 0) ans = root.data;
    //     inorder(root.right);

    // }
    // private static int kthsmallest (node root , int k ){
    //     k2 = k ; 
    //     ans = -1;
    //     inorder(root);
    //     return ans;

    // }
}
