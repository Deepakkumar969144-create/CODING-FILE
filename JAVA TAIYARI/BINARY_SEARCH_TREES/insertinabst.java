package BINARY_SEARCH_TREES;
import java.util.Scanner;
import java.util.*;

public class insertinabst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer [] arr = { 2,1,3};
        
        node root=null;
        // insertion
        for(int i=0;i<arr.length;i++){
            if(arr[i] != null ) root = insert(root, arr[i]);

        }
        System.out.println("Binary Search Tree : ");
        display(root,0);
        
        System.out.println("insert in a binary search tree: ");
        insertinabst obj = new insertinabst();
        root =  obj.insertt(root, 4);
        display(root, 0);

    }
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
    
    private static void attach(node root , int key ){
        if(root.data == key ) return;
        if(root.data < key ) {
            if(root.right == null ) root.right = new node(key);
            else 
            attach(root.right, key);

        }
        else {
            if(root.left == null ) root.left = new node(key);
            else attach(root.left, key);

        }
    }
    node insertt (node root , int key ){
        attach(root, key);
        return root;

    }
    
}
