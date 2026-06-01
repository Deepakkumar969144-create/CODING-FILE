package taiyarijavaa.QUEUES;
import java.util.*;

public class rearrangequeue {
     public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);
        q.add(6); q.add(7); q.add(8);
        System.out.println("Original Queue: " + q);

        rearrangequeue obj = new rearrangequeue();
        Queue<Integer> result = obj.rearrange(q);
        
        System.out.println("Rearranged Queue: " + result);

    }

    public Queue<Integer>rearrange(Queue<Integer> q ){
        Queue<Integer> q2 = new LinkedList<>();
        int n = q.size();
        for( int i = 1 ; i<= n/2 ; i++ ){
            q2.add(q.remove());

        }
        while (q2.size()>0 ) {
            q.add(q2.remove());
            q.add(q.remove());
            
        }
        return q;

    }

}
