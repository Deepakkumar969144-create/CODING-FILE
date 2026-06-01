package taiyarijavaa.BINARY_TREES;

import java.util.*;

public class postorderIterativetraversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        node f = new node(60);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        System.out.println("binary trees : ");
        print(a);
        System.out.println();

        System.out.println("post order traversal Iterative: ");
        postorderIterativetraversal obj = new postorderIterativetraversal();
        ArrayList<Integer> result = obj.postorder(a);
        System.out.print(result);

    }
    private static void print(node root){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
     ArrayList <Integer> postorder(node root){
        ArrayList <Integer > ans = new ArrayList<>();
        Stack<node> st = new Stack<>();
        st.push(root);
        while (st.size()>0) {
            node top = st.pop();
            ans.add(top.val);
            if(top.left != null ) st.push(top.left);
            if(top.right != null ) st.push(top.right);
            
        }
        Collections.reverse(ans);
        return ans;

    }
    
}
