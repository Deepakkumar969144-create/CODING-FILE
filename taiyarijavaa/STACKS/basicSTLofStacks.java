package taiyarijavaa.STACKS;
import java.util.Scanner;
import java.util.*;

public class basicSTLofStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        st.push("khush "); // bottom 
        st.push("preet");
        st.push("rishika");
        st.push("isha ");
        st.push("prayas"); // top 

        System.out.print("stack size : ");
        System.out.println(st.size()); // stack me kitne element hai
        System.out.println();

        System.out.println("print stacks element : "); 
        System.out.println(st); // AS = O(n)
        System.out.println();

        System.out.println("stack element remove and size : ");
        st.pop(); // // remove 
        System.out.println(st + " "+ st.size());// stack and size print karna 
        System.out.println();

        System.out.println((st.peek())); // it return the topmast element and  then remove it 

        String s = st.pop();
        System.out.println(st.size()== 0 ); // check karne stacks ko 
        System.out.println(st.isEmpty());
        System.out.println(st.peek());

    }
}
