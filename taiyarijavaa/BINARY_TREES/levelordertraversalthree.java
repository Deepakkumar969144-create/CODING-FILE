package taiyarijavaa.BINARY_TREES;
import java.util.*;

public class levelordertraversalthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);

        a.left = b; a.right = c; 
        b.left = d; b.right = e;

        System.out.println("binary trees: ");
        print(a);
        System.out.println();

        System.out.println("level order traversal: ");
        List<List<Integer>> ans = levelorder(a);
        System.out.println(ans);

    }
    static class pair{
        node n;
        int level;
        pair( node n , int level){
            this.n = n;
            this.level = level;

        }
    }
    private static void print(node root){
        if(root == null) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    private static List<List<Integer>> levelorder(node root){
        List<List<Integer>> result = new ArrayList<>();
        if( root == null ) return result;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root, 0));
        while (q.size() > 0 ) {
            pair front = q.remove();
            if(result.size() == front.level){
                result.add(new ArrayList<>());

            }
            result.get(front.level).add(front.n.val);
            if(front.n.left != null){
                q.add(new pair(front.n.left, front.level+1 ));

            }
            if(front.n.right != null ){
                q.add(new pair(front.n.right, front.level+1 ));

            }
        }
        return result;
    }

}
