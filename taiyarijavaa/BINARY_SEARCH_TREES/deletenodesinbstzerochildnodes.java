package taiyarijavaa.BINARY_SEARCH_TREES;
import java.util.Scanner;
import java.util.*;
public class deletenodesinbstzerochildnodes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           node a = new node(10);
        node b = new node(20);
        node c = new node(30);

        a.left = b;
        a.right = c;

        int target = 20;

        System.out.println("binary search trees : ");
        print(a);
        System.out.println();

        System.out.println("delete nodes in BST  : ");
        a = deletenodes(a, target);
        print(a);

    }
    private static void print(node root ){
        if( root == null ) return;
        System.out.print( root.data + " ");
        print(root.left);
        print(root.right);

    }
    private static node deletenodes( node root , int target ){
        if(root == null ) return null;
        if(root .data > target){ // go left 
            root.left = deletenodes(root.left , target);

        }
        else if( root.data < target ){ // go right
            root.right = deletenodes(root.right, target);

        }
        else{ // mil gaya 
            return null;

        }
        return root;
    }    
}
