package taiyarijavaa.QUEUES;
import java.util.*;

public class rearrangestacktoqueue {
       public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // elements add karo
        q.add(1); q.add(2); q.add(3); q.add(4);
        q.add(5); q.add(6); q.add(7); q.add(8);
        System.out.println("Original Queue: " + q);

        rearrangestacktoqueue obj = new rearrangestacktoqueue();
        Queue<Integer> result = obj.rearrangestacks(q);

        System.out.println("Rearranged Queue: " + result);

    }
    public Queue<Integer> rearrangestacks( Queue<Integer> q ){
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for( int i =1; i<= n/2 ; i++ ){
            st.push(q.remove());

        }
        while (st.size() > 0 ) {
            q.add(st.pop());
            
        }
        for(int i = 1 ;i<= n/2; i++ ){
            st.push(q.remove());

        }
        // rearrange element 
        while (st.size() > 0 ) {
            q.add(st.pop());
            q.add(q.remove());
            
        }
        // reverse the q 
        while (q.size() > 0 ) {
            st.push(q.poll());
            
        }
        while (st.size() > 0 ) {
            q.add(st.pop());
            
        }
        return q ;

    }

}
