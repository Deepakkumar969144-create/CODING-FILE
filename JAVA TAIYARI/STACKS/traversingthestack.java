package taiyarijavaa.STACKS;
import java.util.*;

public class traversingthestack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Stack<Integer> st = new Stack<>();
       Stack<Integer> st2 = new Stack<>();
        st.push(10); // bottom
        st.push(40);
        st.push(-2);
        st.push(30);
        st.push(30);
        st.push(80); // top

        System.out.print("stack size : ");
        System.out.println(st.size()); // stack me kitne element hai
        System.out.println();
        System.out.println("print stack element : ");
        System.out.println(st);
        System.out.println();

        System.out.println("traversing the stacks : ");
        while (st.size() > 0 ) {
            int top = st.pop();
            System.out.print(top + " ");
            st2.push(top);
            
        }
        while (st2.size()>0 ) {
            st.push(st2.pop());
            
        }
    }
    
}
