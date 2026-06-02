package BINARY_SEARCH_TREES;
import java.util.Scanner;
import java.util.*;

public class maxandminelement {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]={50,30,70,20,40,60,80};

    node root=null;
    // insert
    for(int i=0;i<arr.length;i++){
        root=insert(root,arr[i]);

    }
    System.out.println("Binary Search Tree : ");
    display(root,0);

    maxandminelement obj = new maxandminelement();
    // maximum
    System.out.println("max : ");
    int max = obj.maxvalue(root);
    System.out.println(max);

    // minimum
    System.out.println("min : ");
    int min = obj.minvalue(root);
    System.out.println(min);

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
    int minvalue(node root ){
        node temp = root;
        while (temp.left != null ) {
            temp = temp.left;
            
        }
        return temp.data;

    }
    int maxvalue (node root){
        node temp = root;
        while (temp.right != null ) {
            temp = temp.right;
            
        }
        return temp.data;

    }
    
}
