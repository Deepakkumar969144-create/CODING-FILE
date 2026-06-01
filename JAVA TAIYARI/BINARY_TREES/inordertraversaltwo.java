package taiyarijavaa.BINARY_TREES;
import java.util.*;

public class inordertraversaltwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(1 );
        node b = new node(2);
        node  c = new node(3);
        node d = new node(4);
        node e = new node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;

        System.out.println("binary trees : ");
        print(a);
        System.out.println();

        System.out.println("inorder binary trees: " + inorder(a));

    }
    private static void print(node root){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
        //     Jab tak curr null nahi hai
        // tab tak direct stack me push karo
        // fir left me move karo
    public static ArrayList<Integer> inorder(node root){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<node> st = new Stack<>();
        node curr = root;
        while (st.size() > 0 || curr != null ) {
            if(curr != null ){
                if(curr.left != null ){
                    st.push(curr);
                    curr = curr.left;

                }
                else{
                    ans.add(curr.val);
                    curr = curr.right;

                }
            }
            else {
                node top = st.pop();
                ans.add(top.val);
                curr = top .right;

            } 
        }
        return ans;

    }
    
}
