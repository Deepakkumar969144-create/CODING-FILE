package BINARY_SEARCH_TREES;
import java.util.Scanner;
import java.util.*;

public class rangesumbst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer [] roott = { 10,5,15,3,7,null ,18};

        node root=null;
        // insertion
        for(int i=0;i<roott.length;i++){
            if(roott[i] != null ) root = insert(root, roott[i]);

        }
        System.out.println("Binary Search Tree : ");
        display(root,0);

        System.out.println("ragne sum of binary search tree: ");
        int low = 7;
        int high = 15;
        int ans = rengesum(root, low, high);
        System.out.print(ans);

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
    private static int rengesum(node root , int low , int high ){
        if(root == null ) return 0 ;
        int sum = 0 ;
        if( root .data >= low && root.data <= high){
            sum += root.data;

        }
        sum += rengesum(root.left, low, high);
        sum += rengesum(root.right, low, high);
        return sum;

    }
    
}
