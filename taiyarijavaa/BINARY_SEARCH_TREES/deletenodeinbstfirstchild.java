package taiyarijavaa.BINARY_SEARCH_TREES;
import java.util.Scanner;

import taiyarijavaa.BINARY_TREES.printtrees;
import taiyarijavaa.QUEUES.rearrangequeue;

import java.util.*;

public class deletenodeinbstfirstchild {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a= new node(20);
        node b = new node(10);
        node c = new node(30);
        node d = new node(5);

        a.left = b;
        a.right = c;
        b.left = d;

        int target = 10 ;
        System.out.println("binary search trees : ");
        print(a);
        System.out.println();

        System.out.println("delete node in bst : ");
        a = deletenodes(a, target);
        print(a);
        
    }
    private static void print(node root ){
        if(root == null ) return ;
        System.out.print( root.data + " ");
        print(root.left);
        print(root.right);

    }
    private static node deletenodes(node root , int target){
        if(root == null ) return null ;
        if(root.data > target ){ // go left 
            root.left = deletenodes(root.left, target);

        }
        else if(root.data < target){ // go right 
            root.right = deletenodes(root.right, target);

        }
        else{ // mil gaya 0 child 
            if(root.left == null && root.right == null ) {
                return null ;

            }
            // 1 child node 
            else if(root.left == null ) {
                return root.right;

            }
            else if(root.right == null ) {
                return root.left;

            }
        }
        return root;

    }
    
}
