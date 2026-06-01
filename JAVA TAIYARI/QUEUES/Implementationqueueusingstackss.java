package taiyarijavaa.QUEUES;
import java.util.*;

public class Implementationqueueusingstackss {
    // pop and peek efficient approach - 
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();
    void push( int x ){
        // push at bottom of st 
        while (st.size() > 0 ) {
            helper.push(st.pop());
            
        }
        st.push(x);
        while (helper.size() > 0 ) {
            st.push(helper.pop());

        }
    }
    int pop(){
        return st.pop();

    }
    int peek(){
        return st.peek();

    }
    boolean empty(){
        return (st.size() == 0 );

    }
    public static void main(String[] args) {
    Implementationqueueusingstackss q = new Implementationqueueusingstackss();
    q.push(10);  // push (enqueue)
    q.push(20);
    q.push(30);
    q.push(40);
    
    System.out.println("Front element: " + q.peek()); // peek
    System.out.println("Removed: " + q.pop());   // pop (dequeue)
    System.out.println("Front element after pop: " + q.peek());  // again peek
    System.out.println("Is queue empty? " + q.empty());   // check empty

    System.out.println("Removed: " + q.pop());  // remove all
    System.out.println("Removed: " + q.pop());
    System.out.println("Removed: " + q.pop());

    System.out.println("Is queue empty? " + q.empty());

    }
    
}
