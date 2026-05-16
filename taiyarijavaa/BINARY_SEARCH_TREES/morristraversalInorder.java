package taiyarijavaa.BINARY_SEARCH_TREES;
import java.util.Scanner;
import java.util.*;

public class morristraversalInorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        node f = new node(60);
        node g = new node(70);
        node h = new node(80);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.right = h;

        System.out.println("binary search trees : ");
        print(a);
        System.out.println();

        System.out.println("morris traversal inorder trees : ");
        ArrayList<Integer> ans = inorder(a);
        System.out.println(ans);

    }
    private static void print(node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);

    }
    public static ArrayList<Integer> inorder(node root){
        ArrayList<Integer> ans = new ArrayList<>();
        node curr = root;
        while(curr != null){
            // left nahi hai
            if(curr.left == null){
                ans.add(curr.data);
                curr = curr.right;

            }
            else{
                // predecessor find
                node pred = curr.left;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right;

                }
                // link
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;

                }
                // unlink
                else{
                    pred.right = null;
                    ans.add(curr.data);
                    curr = curr.right;

                }
            }
        }
        return ans;

    }

}