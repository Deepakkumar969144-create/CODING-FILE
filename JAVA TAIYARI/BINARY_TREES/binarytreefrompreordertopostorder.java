package BINARY_TREES;
import java.util.Scanner;

import java.util.*;

public class binarytreefrompreordertopostorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int preorder[] = { 1, 2, 4, 5, 3, 6, 7};
        System.out.println("preorder : ");
        for(int ele : preorder){
            System.out.print( ele + " ");

        }
        System.out.println();
        node root = buildtree(preorder);
        System.out.print("postorder : ");
        postorderdisplay(root);


    }
    static int idx = 0;
    public static node buildtree( int preorder[] ){
        if( idx >= preorder.length){
            return null ;

        }
        node root = new node(preorder[idx]);
        idx++ ;

        // manually creating full binary tree 
        if(root.val == 4 || root.val == 5 || root.val == 6 || root.val == 7){
            return root;

        }
        root.left = buildtree(preorder);
        root.right = buildtree(preorder);
        return root;

    }
    public static void postorderdisplay(node root ){
        if(root == null ){
            return;

        }
        postorderdisplay(root.left);
        postorderdisplay(root.right);
        System.out.print( root.val + " ");

    }
    
}
