package taiyarijavaa.QUEUES;
import java.util.*;

public class Implementationqueueusingstack{
    // add efficient approach -
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    // push O(1)
    void push(int x){
        st.push(x);

    }

    // pop O(n)
    int pop(){
        if(st.size() == 0){
            System.out.println("queue is empty!");
            return -1;

        }

        // st ka bottom remove karo
        while(st.size() > 1){
            helper.push(st.pop());

        }

        int front = st.pop();

        while(helper.size() > 0){
            st.push(helper.pop());

        }
        return front;
    }

    // peek O(n)
    int peek(){
        if(st.size() == 0){
            System.out.println("queue is empty!");
            return -1;

        }

        while(st.size() > 1){
            helper.push(st.pop());

        }

        int front = st.peek();

        while(helper.size() > 0){
            st.push(helper.pop());

        }
        return front;

    }

    boolean empty(){
        return (st.size() == 0);

    }

    public static void main(String[] args) {

        Implementationqueueusingstack q = new Implementationqueueusingstack();

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);

        System.out.println("Front element: " + q.peek());
        System.out.println("Removed: " + q.pop());
        System.out.println("Front element after pop: " + q.peek());
        System.out.println("Is queue empty? " + q.empty());

        System.out.println("Removed: " + q.pop());
        System.out.println("Removed: " + q.pop());
        System.out.println("Removed: " + q.pop());

        System.out.println("Is queue empty? " + q.empty());
        
    }
}