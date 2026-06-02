package BINARY_TREES;
import java.util.*;

public class completebinarytree {
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

        System.out.println("\nIs Complete Binary Tree: " + isComplete(a));

    }
    private static void print(node root){
        if(root == null ) return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);

    }
    public static boolean isComplete(node root){
        if(root == null) return true;

        Queue<node> q = new LinkedList<>();
        q.add(root);

        boolean foundNull = false;

        while(!q.isEmpty()){
            node temp = q.poll();

            if(temp == null){
                foundNull = true;

            } 
            else{
                if(foundNull) return false; // rule break
                q.add(temp.left);
                q.add(temp.right);

            }
        }
        return true;

    }

//     Complete Binary Tree ka rule:
        // Level order me jao (BFS)
        // Ek baar null mil gaya
        // Uske baad koi bhi non-null node nahi aani chahiye
}