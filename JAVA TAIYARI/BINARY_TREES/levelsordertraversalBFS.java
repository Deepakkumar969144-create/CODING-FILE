package taiyarijavaa.BINARY_TREES;
import java.util.*;

public class levelsordertraversalBFS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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

        System.out.println("level order traversal (BFS): ");
        levelorder(a); // level waise print mtlab yek line se 

    }
    private static void print(node root){
        if(root == null ) return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);

    }
    private static void levelorder(node root){
        Queue<node> q = new LinkedList<>();
        q.add(root);
        while (q.size()>0) {
            node front = q.remove();
            System.out.print(front.val + " ");
            if(front.left != null ) q.add(front.left);
            if(front.right != null ) q.add(front.right);
            
        }
        System.out.println();
    }
    // front se bahar nikal ke print karo and uska left and right child ko queue me daalo 
}
