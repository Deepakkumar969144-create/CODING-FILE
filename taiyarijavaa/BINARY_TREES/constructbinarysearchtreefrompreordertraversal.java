package taiyarijavaa.BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class constructbinarysearchtreefrompreordertraversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int preorder[] = { 8, 5, 1, 7, 10, 12};
        System.out.println("preorder : ");
        for(int ele : preorder) {
            System.out.print( ele + " ");

        }
        System.out.println();
        
        node root = buildtree(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.print( "inorder : ");
        inorderdisplay(root);

    }
    static int idx = 0 ;
    public static node buildtree( int preorder[] , int min , int max ){
        if(idx >= preorder.length){
            return null ;

        }
        int val = preorder[idx ];
        if(val < min || val > max ){
            return null;

        }
        node root = new node(val);
        idx++ ;
        root.left = buildtree(preorder, min, val);
        root.right = buildtree(preorder, val, max);
        return root;

    }
    public static void inorderdisplay(node root ){
        if(root == null ){
            return;

        }
        inorderdisplay(root.left);
        System.out.print( root.val + " ");
        inorderdisplay(root.right);

    }
}
