package taiyarijavaa.STACKS;
import java.util.*;

public class pushelementatbothRECURSIVELY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        // bottom
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40); // top 
         System.out.print("stack size : ");
        System.out.println(st.size()); // stack me kitne element hai
        System.out.println();
        System.out.println("print stack element : ");
        System.out.println(st);
        System.out.println();

        System.out.print("enter the push bottom element : ");
        int ele = sc.nextInt();
        pushbottom(st, ele ); // call karna 
        System.out.println("After push bottom: " + st);

    }

    private static void pushbottom( Stack<Integer > st , int ele){
        if(st.size() == 0){
            st.push(ele ); // 50 push ho gaya
            return ; 

        }
        int top = st.pop();
        pushbottom(st, ele);
        st.push(top);

    }
}
  

