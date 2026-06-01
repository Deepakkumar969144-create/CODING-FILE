package taiyarijavaa.QUEUES;
import java.util.*;

public class addremovepeekatanyposition {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        System.out.println("Original Queue: " + q);
        System.out.println();

        addAtIndex(q, 2, 25);
        System.out.println("After Add at index 2: " + q);
        System.out.println();

        System.out.println("Peek at index 3: " + peek(q, 3));
        System.out.println();

        System.out.println("Removed at index 1: " + remove(q, 1));
        System.out.println();

        System.out.println("After Removal: " + q);
        System.out.println();

    }

            // Add at index
    private static void addAtIndex(Queue<Integer> q, int idx, int val) {
        if (idx < 0 || idx > q.size()) {
            System.out.println("Invalid Index");
            return;

        }
        int n = q.size();

        for (int i = 0; i < idx; i++) {  // bring desired position to front
            q.add(q.remove());

        }
        q.add(val); // insert
        for (int i = 0; i < n - idx; i++) { // restore order
            q.add(q.remove());

        }
    }

            // Peek at index (without removing)
    private static int peek(Queue<Integer> q, int idx) {
        if (idx < 0 || idx >= q.size()) {
            System.out.println("Invalid Index");
            return -1;

        }

        int n = q.size();
        int ans = -1;

        for (int i = 0; i < n; i++) {
            int val = q.remove();
            if (i == idx) {
                ans = val;

            }
            q.add(val); // restore

        }
        return ans;

    }

            // Remove at index
    private static int remove(Queue<Integer> q, int idx) {
        if (idx < 0 || idx >= q.size()) {
            System.out.println("Invalid Index");
            return -1;

        }

        int n = q.size();
        int removed = -1;

        for (int i = 0; i < n; i++) {
            int val = q.remove();
            if (i == idx) {
                removed = val; // skip adding back

            } 
            else {
                q.add(val);

            }
        }
        return removed;

    }

}