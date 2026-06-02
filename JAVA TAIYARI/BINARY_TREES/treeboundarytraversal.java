package BINARY_TREES;
import java.util.*;

public class treeboundarytraversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);
        node g = new node(7);
        node h = new node(8);
        node i = new node(9);
        node j = new node(10 );
        node k = new node(11);
        node l = new node(12);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        d.left = h; d.right = i;
        e.left = j; e.right = k;
        f.left = l;

        System.out.println("binary trees : ");
        print(a);
        System.out.println();

        treeboundarytraversal obj = new treeboundarytraversal();
        System.out.println("tree boundary traversal : ");
        System.out.println(obj.boundarytraversal(a));

    }
    private static void print(node root){
        if( root == null ) return;
        System.out.print(  root.val + " ");
        print(root.left);
        print(root.right);

    }
    ArrayList <Integer> boundarytraversal(node root ){
        ArrayList< Integer> ans = new ArrayList<>();
        ans.add(root.val);
        if(root.left == null && root.right == null ) return ans;
        leftboundary(root.left, ans);
        leafnodes(root , ans);
        rightboundary(root.right , ans);
        return ans;

    }
    private static void leftboundary(node root , ArrayList<Integer> ans){
        if(root == null ) return;
        if(root.left == null && root.right == null ) return;
        ans.add(root.val);
        if(root.left != null ) leftboundary(root.left, ans);
        else leftboundary(root.right, ans);

    }
    private static void leafnodes(node root , ArrayList<Integer> ans ){
        if(root == null ) return;
        if(root.left == null && root.right == null ) ans.add(root.val);
        leafnodes(root.left, ans);
        leafnodes(root.right, ans);

    }
    private static void rightboundary(node root , ArrayList <Integer> ans ){
        if(root == null ) return;
        if(root.left == null  && root.right == null ) return;
        if(root.right != null ) rightboundary(root.right, ans);
        else rightboundary(root.left, ans);
        ans.add(root.val);
        
    }
    
}
