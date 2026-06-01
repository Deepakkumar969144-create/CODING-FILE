package taiyarijavaa.BINARY_TREES;
import java.util.*;

public class inordertraversal {
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
        System.out.println("binary trees");
        print(a);
        System.out.println();

        System.out.println("inorder traversal: ");
        ArrayList < Integer > ans = inorder(a);
        System.out.println(ans);

    }
    private static void print(node root ){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    private static void dfs(node root , ArrayList<Integer> ans ){
        if( root == null ) return;
        dfs(root.left , ans);
        ans.add(root.val);
        dfs(root.right, ans);

    }
    public static ArrayList<Integer> inorder(node root){
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;

    }

}
