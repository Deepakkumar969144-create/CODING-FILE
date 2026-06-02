package BINARY_SEARCH_TREES;
import java.util.Scanner;
import java.util.*;

public class Bstbasic {
    // insert
    public static node insert(node root,int data){
    if(root==null){
        root=new node(data);
        return root;

    }
    if(data < root.data){
        root.left=insert(root.left,data);

    }
    else{
        root.right=insert(root.right,data);

    }
    return root;

    }

    // binary search tree display
    public static void display(node root,int level){
        if(root==null) return;
        display(root.right,level+1);
        for(int i=0;i<level;i++){
            System.out.print("    ");

        }
        System.out.println(root.data);
        display(root.left,level+1);

    }

    // search
    public static boolean search(node root,int target){
        if(root==null) return false;
        if(root.data==target) return true;
        if(target < root.data){
            return search(root.left,target);

        }
        else{
            return search(root.right,target);

        }
    }

    // inorder traversal
    public static void inorder(node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    // minimum value
    public static int min(node root){
        while(root.left!=null){
            root=root.left;

        }
        return root.data;

    }

    // maximum value
    public static int max(node root){
        while(root.right!=null){
            root=root.right;

        }
        return root.data;

    }

    public static void main(String[] args) {
        int arr[]={50,30,70,20,40,60,80};
        node root=null;

        // insertion
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);

        }
        System.out.println("Binary Search Tree : ");
        display(root,0);

        // inorder
        System.out.println("Inorder Traversal : ");
        inorder(root);
        System.out.println();

        // search
        System.out.println(search(root,60));

        // minimum
        System.out.println("Minimum : "+min(root));

        // maximum
        System.out.println("Maximum : "+max(root));

    }

}