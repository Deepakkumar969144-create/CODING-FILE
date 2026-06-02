package BINARY_TREES;
import java.util.*;

public class levelordertraversaltwo {

    static class pair{   // static kiya
        node n;
        int level;
        pair(node n , int level){
            this.n = n;
            this.level = level;

        }
    }
    public static void main(String[] args) {

        node a = new node(5);
        node b = new node(4);
        node c = new node(-3);
        node d = new node(8);
        node e = new node(-2);
        node f = new node(1);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        System.out.println("Binary Tree:");
        print(a);
        System.out.println();

        System.out.println("Level Order:");
        levelorder(a);   // call add kiya

    }
    private static void print(node root){
        if(root == null ) return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);

    }
    private static void levelorder(node root){
        if(root == null) return;

        Queue<pair> q = new LinkedList<>();  // type fix
        int currlevel = 0;

        q.add(new pair(root, 0));
        while (q.size() > 0 ) {
            pair front = q.remove();

            if(front.level != currlevel){
                currlevel = front.level;   // update correct
                System.out.println();

            }
            System.out.print(front.n.val + " ");  // print fix
            if(front.n.left != null ) 
                q.add(new pair(front.n.left, front.level + 1));

            if(front.n.right != null ) 
                q.add(new pair(front.n.right, front.level + 1)); // fix

        }
        System.out.println();
        
    }
}