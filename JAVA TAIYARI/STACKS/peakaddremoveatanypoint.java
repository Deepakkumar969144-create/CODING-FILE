package taiyarijavaa.STACKS;
import java.util.*;

public class peakaddremoveatanypoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // original stack
        Stack<Integer> st = new Stack<>();

        // helper stack (temporary storage ke liye)
        Stack<Integer> st2 = new Stack<>();

        int idx = 2; // top se index (0 = top element)

        // stack me elements daal rahe hain
        st.push(10); // bottom
        st.push(40);
        st.push(-2);
        st.push(30);
        st.push(30);
        st.push(80); // top

        // stack size print
        System.out.print("stack size : ");
        System.out.println(st.size());

        // poora stack print
        System.out.println("\nprint stack element : ");
        System.out.println(st);
        System.out.println();

        // 🔹 Step 1:
        // elements ko st se nikal ke st2 me daalte rahenge
        // jab tak desired index wala element top pe na aa jaye
        while (st.size() > idx + 1) {
            st2.push(st.pop());  // top element hata ke st2 me daal diya

        }

        // 🔹 Step 2:
        // ab jo element st ke top pe hai wahi target element hai
        System.out.println("Target element: " + st.peek());

        // 🔹 Step 3:
        // st2 ke elements wapas st me daal rahe hain (restore original stack)
        while (st2.size() > 0) {
            st.push(st2.pop());  // IMPORTANT: yaha st2.pop() hona chahiye
            
        }

        // final stack print (check karne ke liye)
        System.out.println("\nFinal stack: " + st);

    }
}