package taiyarijavaa.QUEUES;
import java.util.*;

public class findthewinnerofthecirculargame {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println("total number of element : " + n );
        System.out.println("removed in kth element : " + k);

        int winner = findthewinner(n, k);
        System.out.println("winner is " + winner);

    }

    public static int findthewinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);

        }
        while (q.size() > 1) {
            for (int i = 1; i < k; i++) { // k-1 rotate
                q.add(q.remove());

            }
            // k-th remove (IMPORTANT: loop ke andar hona chahiye)
            q.remove();

        }
        return q.peek();

    }
}