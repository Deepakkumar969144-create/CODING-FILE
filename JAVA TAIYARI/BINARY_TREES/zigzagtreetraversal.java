package BINARY_TREES;
import java.util.*;

public class zigzagtreetraversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40 );
        node e = new node(50);
        node f = new node(60);
        node g = new node(70);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        System.out.println("binary tree: ");
        print(a);
        System.out.println();

        System.out.println("zigzag traversal: ");
        zigzag(a);

    }
    private static void print ( node root){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    private static void zigzag (node root ){
        if( root == null ) return;
        Queue<node > q = new LinkedList<>();
        q.add(root);
        boolean rev = false;
        while (q.size() > 0 ) {
            int size = q.size();
            ArrayList < Integer> ans = new ArrayList<>();
            for(int i = 0 ; i<size; i++ ){
                node temp = q.remove();
                if(rev == false ) ans.add(temp.val);
                else ans.add(0 , temp.val);
                if(temp.left != null ) q.add(temp.left);
                if(temp.right != null ) q.add(temp.right);

            }
            for(int x : ans ) {
                System.out.print( x + " ");

            }
            rev = !rev;
            // System.out.println();
        }
    }
}
