package taiyarijavaa.BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(1); 
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e  = new node(5);
        node f= new node(6);
         
         a.left = b; a.right= c;
         b.left = d; b.right = e;
         c.left = f;

         System.out.println("binary trees is : ");
         print(a);
         System.out.println();

         System.out.println("lowest common ancestor: ");
         int p = 4;
         int q = 5;
         LowestCommonAncestor obj = new LowestCommonAncestor();
         node ans = obj.lca( a, p, q);
         if( ans != null ) System.out.println(ans.val );
         else System.out.println("not found");
         

    }
    private static void print(node root) {
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    node lca(node root , int p , int q ){
        if(root == null ) return null;
        if( root.val == p || root.val == q ) return root;
        node l = lca(root.left, p, q);
        node r = lca(root.right, p, q);
        if( l != null && r != null ) return root;
        return ( l == null ) ? r : l ; // if l is null return r else return l

    }
    
}
