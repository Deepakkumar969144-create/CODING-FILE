package BINARY_TREES;
import java.util.Scanner;

import java.util.*;

public class mindistancebetweentwogivenofabinarytree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         node a = new node(2);
         node b = new node(4);
         node c =  new node(5);
         node d = new node(6);
         node e = new  node(7);
         node f= new node(7);

         a.left = b; a.right = c;
         b.left = d; b.right = e;
         c.left = f;

         System.out.println("binary trees is : ");
         print(a);
         System.out.println();

         System.out.println("min distance between two given of a binary tree: ");
         int p = 2;
         int q = 5;
         mindistancebetweentwogivenofabinarytree obj = new mindistancebetweentwogivenofabinarytree();
         int ans = obj.finddistance(a, p, q);
         System.out.println(ans);

    }
    private static void print(node root ){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    int finddistance (node root , int a , int b ){
        node lca = lca(root , a , b);
        int [] dis = {0 ,0};
        dfs(lca , a, b, 0, dis);
        return dis[0] + dis[1];

    }
    private static void dfs(node root , int a ,int b ,int depth , int [] dis){
        if(root == null ) return;
        if(root.val == a ) dis[0] = depth;
        if(root.val == b) dis[1] = depth;
         dfs(root.left, a, b, depth+1, dis);
        dfs(root.right, a, b, depth+1, dis);
       
    }
     node lca (node root , int p , int q){
        if(root == null ) return null;
        if(root.val == p || root.val == q) return root;
        node l = lca(root.left, p, q);
        node r = lca(root.right, p, q);
        if( l != null && r != null )  return root;
        return (l == null ) ? r: l ; // if l is null return r else return l
           
    }
    
}
