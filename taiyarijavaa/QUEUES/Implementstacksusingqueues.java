package taiyarijavaa.QUEUES;
import java.util.*;

public class Implementstacksusingqueues {
    // pop and peek efficient approach - 
    Queue<Integer> q = new LinkedList<>();
    void push(int x){
        // q ke front pe add karn a 
        q.add(x);
        int n = q .size();
        for(int i = 1; i<=n-1; i++){
            q.add(q.remove());

        }
    }
    int pop(){
        return q.remove();

    }
    int top(){
        return q.peek();

    }
    boolean empty(){
        return (q.size() == 0 );

    } 
      public static void main(String[] args) {
    Implementstacksusingqueues st = new Implementstacksusingqueues();
    st.push(10); // push
    st.push(20);
    st.push(30);
    st.push(40);

    System.out.println("Top element: " + st.top());  // top
    System.out.println("Popped: " + st.pop());  // pop
    System.out.println("Top after pop: " + st.top());  // again top
    System.out.println("Is empty? " + st.empty());// empty check

    System.out.println("Popped: " + st.pop());// pop all
    System.out.println("Popped: " + st.pop());
    System.out.println("Popped: " + st.pop());

    System.out.println("Is empty? " + st.empty());  // final check

    } 
}
