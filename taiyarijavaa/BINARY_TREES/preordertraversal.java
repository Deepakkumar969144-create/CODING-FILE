package taiyarijavaa.BINARY_TREES;
import java.util.*;

public class preordertraversal {
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

       System.out.println("preorder traversal:");
        ArrayList<Integer> ans = preorder(a);
        System.out.println(ans);

    }
    private static void print (node root ){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    // Tree/Graph ko “depth” me jaake explore karta hai (pehle niche tak, phir wapas)
    private static void dfs(node root , ArrayList<Integer> ans ){
        if( root == null ) return;
        ans.add(root.val);
        dfs(root.left, ans);
        dfs(root.right, ans);

    }
     // preorder traversal returning list
    public static ArrayList<Integer> preorder(node root){
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;

    }
}
