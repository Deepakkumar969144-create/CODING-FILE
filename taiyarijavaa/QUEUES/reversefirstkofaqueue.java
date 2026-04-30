package taiyarijavaa.QUEUES;
import java.util.*;

public class reversefirstkofaqueue {
                // pehle k elements ko stack me daal do (reverse ho jayega)
                // fir wapas queue me daalo
                // baaki elements ko rotate karke order maintain karo
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);

        System.out.println("Original Queue: " + q);
          int k = 3;
        System.out.println("index : " + k);

        reverseFirstK(q, k);
        System.out.println("After Reverse first " + q);

    }

    private static void reverseFirstK(Queue<Integer> q, int k) {
        if (k <= 0 || k > q.size()) {
            System.out.println("Invalid k");
            return;

        }

        Stack<Integer> st = new Stack<>();  // helper stack banaya hai

                //  step 1: first k elements stack me daalo
        for (int i = 0; i < k; i++) {
            st.push(q.remove());

        }

                // step 2: stack se wapas queue me (reverse ho jayega)
        while (!st.isEmpty()) {
            q.add(st.pop());

        }

                // step 3: remaining elements ko rotate karo
        int n = q.size();
        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());

        }
    }

}
