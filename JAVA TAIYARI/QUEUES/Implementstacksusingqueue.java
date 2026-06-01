package taiyarijavaa.QUEUES;
import java.util.*;

public class Implementstacksusingqueue {
    // add efficient approach - 
    Queue<Integer> q = new LinkedList<>();
    void push(int x ){
        q.add(x);

    }
    int pop (){
        int n = q.size();
        for(int i = 1; i<= n-1; i++ ){
            q.add(q.remove());

        }
        return q.remove();

    }
    int top(){
        int n = q.size();
        for(int i = 1; i<= n-1; i++){
            q.add(q.remove());

        }
        int p = q.peek();
        q.add(q.remove()); // imp 
        return p ;

    }
    boolean empty(){
        return (q.size() == 0 );

    }
    public static void main(String[] args) {
    Implementstacksusingqueue st = new Implementstacksusingqueue();
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
