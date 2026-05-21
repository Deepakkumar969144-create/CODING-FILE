package taiyarijavaa.HEAPS;
import java.util.Scanner;
import java.util.*;

public class isbinarytreesheap {
    class node {
        int data;
        node left;
        node right;
        node ( int d ){
            data = d ;
            left = right = null ;

        }
    }
        static int s;
        boolean isheap(node root ){
            s = size(root);
            return ismaxheap(root) && iscbt(root, 1);

        }
        private static int size(node root ){
            if(root == null ) return 0;
            return 1+ size(root.left) + size(root.right);

        }
        private static boolean iscbt(node root , int idx ){
            if(root == null ) return true;
            if(idx >s ) return false;
            return iscbt(root.left, 2*idx ) && iscbt(root.right, 2*idx +1);

        }
        private static boolean ismaxheap(node root ){
            if(root == null ) return true;
            int leftval = (root.left != null ) ? root.left.data : Integer.MIN_VALUE;
            int rightval = (root.right != null ) ? root.right.data : Integer.MIN_VALUE;
            if(root.data <= leftval || root.data <= rightval ) return false;
            return ismaxheap(root.left ) && ismaxheap(root.right);

        }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int [] arr = { 97, 46, 37, 12, 3, 7, 31, 6, 9};
       System.out.println("element array : ");
       for(int ele : arr ){
        System.out.print( ele + " ");

       } 
       System.out.println();

      isbinarytreesheap obj = new isbinarytreesheap();
        node root = obj.new node(97);
        root.left = obj.new node(46);
        root.right = obj.new node(37);
        root.left.left = obj.new node(12);
        root.left.right = obj.new node(3);
        root.right.left = obj.new node(7);
        root.right.right = obj.new node(31);
        root.left.left.left = obj.new node(6);
        root.left.left.right = obj.new node(9);

        boolean ans = obj.isheap(root);
        System.out.println("is binary tree heap : " + ans);
        
    }

}
