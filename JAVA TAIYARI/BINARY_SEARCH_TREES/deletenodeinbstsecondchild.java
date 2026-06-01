package taiyarijavaa.BINARY_SEARCH_TREES;
import java.util.Scanner;

import java.util.*;

public class deletenodeinbstsecondchild {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(20);
        node b = new node(10);
        node c = new node(30);
        node d = new node(5);
        node e = new node(15);

        a.left = b; a.right = c;
        b.left = d;
        b.right = e;

        int target = 10;

        System.out.println("binary search trees : ");
        print(a);
        System.out.println();

        System.out.println("after secend child node : ");
        a = deletenodes(a, target);
        print(a);

    }
    private static void print(node root ){
        if(root == null) return;
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);

    }
    private static node deletenodes(node root , int target){
        if(root == null ) return null;
        if(root.data > target) // go left
            root.left = deletenodes(root.left, target);

        else if(root.data < target) // go right
            root.right = deletenodes(root.right, target);

        else{
            // case 1 leaf node
            if(root.left == null && root.right == null)
                return null;

            // case 2 first child node
            if(root.left == null)
                return root.right;
            if(root.right == null)
                return root.left;

            // case 3 second child node
            node succ = root.right;
            while(succ.left != null){
                succ = succ.left;

            }
            root.right = deletenodes(root.right, succ.data);
            succ.left = root.left;
            succ.right = root.right;
            return succ;

        }
        return root;
        
    }

}