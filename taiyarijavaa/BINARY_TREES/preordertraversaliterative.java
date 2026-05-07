package taiyarijavaa.BINARY_TREES;
import java.util.*;

public class preordertraversaliterative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node( 1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);
        
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f;

        System.out.println("binary trees : ");
        print(a);
        System.out.println();

        System.out.println("preorder traversal iterative : ");
        preordertraversaliterative obj = new preordertraversaliterative();
        ArrayList<Integer> result = obj.preorder(a);
        System.out.println(result);

    }
    private static void print(node root){
        if(root == null) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    public ArrayList<Integer > preorder(node root){
        ArrayList <Integer > ans = new ArrayList<>();
        Stack <node > st = new Stack<>();
        st.push(root);
        while (st.size() > 0 ) {
            node top = st.pop();
            ans.add(top.val);
            if(top.right != null ) st.push(top.right);
            if(top.left != null ) st.push(top.left);
            
        }
        return ans;
        
    }
    
}
