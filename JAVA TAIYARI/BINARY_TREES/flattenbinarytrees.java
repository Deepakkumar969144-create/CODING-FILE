package BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class flattenbinarytrees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(1);
        node b = new node(9);
        node c = new node(8);
        node d = new node(7);
        node e = new node(6);
        node f = new node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f;

        System.out.println("binary trees ; ");
        print(a);
        System.out.println();

        System.out.println("flatten binary trees: ");
        flatten(a);
        printflatten(a);

    }
    private static void print ( node root){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);
        
    }
    private static void flatten(node root){
        if(root == null ) return;
        node lst = root.left;
        node rst = root.right;
        root.left = null;
        root.right = null ;
        flatten( lst);
        flatten(rst);
        root.right  = lst ;
        node last = root; // ye lst ka last element  hoga
        while (last .right != null )  {
        last = last.right;

        }
        last .right = rst;
    }
    private static void printflatten(node root){
        while (root != null ) {
            System.out.print( root.val + " ");
            root = root.right;

            
        }
    }
//     1. left subtree store
// 2. right subtree store
// 3. left/right flatten
// 4. left ko right me attach
// 5. last node tak jao
// 6. old right subtree attach

}
