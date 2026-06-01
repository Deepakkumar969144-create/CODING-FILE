package taiyarijavaa.STACKS;
import java.util.*;

public class reversethestackrecursively {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        // 🔹 Initial stack (bottom → top)
        st.push(10); // bottom
        st.push(20);
        st.push(30);
        st.push(40); // top

        int ele = 50;

        // 🔹 Original stack print
        System.out.println("Original stack: " + st);

        // 🔹 Step 1: element ko bottom me push karna
        pushatbottom(st , ele);

        // 🔹 After pushing 50 at bottom
        System.out.println("After push at bottom: " + st);

        // 🔹 Step 2: stack ko recursively reverse karna
        reverse(st);

        // 🔹 Final reversed stack
        System.out.println("Reversed stack: " + st);

    }

    // Function: stack ko reverse karta hai recursion se
    private static void reverse(Stack<Integer> st){

        // 🔹 Base case: agar stack me 0 ya 1 element hai to already reverse hai
        if(st.size() <= 1) return;

        // 🔹 Top element nikal lo
        int top = st.pop();

        // 🔹 Remaining stack ko reverse karo (recursion)
        reverse(st); // ye "magic step" hai

        // 🔹 Ab jo element nikala tha usko bottom me daal do
        pushatbottom(st, top);

    }

    // Function: kisi element ko stack ke bottom me daalta hai
    public static void pushatbottom(Stack<Integer> st , int ele ){

        // 🔹 Base case: agar stack empty hai
        if(st.size() == 0){
            st.push(ele); // direct push (bottom ban gaya)
            return;

        }

        // 🔹 Top element temporarily nikaal lo
        int top = st.pop();

        // 🔹 Recursively bottom tak jao
        pushatbottom(st, ele);

        // 🔹 Backtracking: upar wale elements wapas daalo
        st.push(top);

    }
}
