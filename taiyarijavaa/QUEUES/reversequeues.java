package taiyarijavaa.QUEUES;
import java.util.*;

public class reversequeues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);
        System.out.println("original queues: " + q);

        reversequeues obj = new reversequeues();
        q = obj.reversequeues(q); // q hi aatega call me kiyo ki function me q hai 
        System.out.println("reversed queue: " + q); // Queue ka name bhi q hai 
        
    }
    public Queue<Integer> reversequeues ( Queue<Integer> q ){

        Stack<Integer> st = new Stack<>(); // stacks banaya
        while (q.size() > 0 ) {
            st.push(q.remove());
            
        }
        while (st.size() > 0 ) {
            q.add(st.pop());
            
        }
        return q;

    }
    
}
