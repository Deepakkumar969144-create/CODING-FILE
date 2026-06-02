package BINARY_SEARCH_TREES;
import java.util.Scanner;
import java.util.*;

public class countbstnodethatliegivenrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer [] arr = { 10, 5, 50, 1, null, 40, 100};
        
        node root=null;
        // insertion
        for(int i=0;i<arr.length;i++){
            if(arr[i] != null ) root = insert(root, arr[i]);

        }
        System.out.println("Binary Search Tree : ");
        display(root,0);

        System.out.println("count bst nodes that lie in a given range : ");
        int low = 5 , high = 45;
        int ans = getcount(root, low, high);
        System.out.print(ans );


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
    private static int getcount( node root , int l , int h){
        if(root== null ) return 0;
        if( root.data < l ) return getcount(root.right, l, h);
        else if( root.data > h ) return getcount(root.left, l, h);
        else  return 1 + getcount(root.left, l, h) + getcount(root.right, l, h);

    }

}
