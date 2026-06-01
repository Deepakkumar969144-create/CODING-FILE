package taiyarijavaa.STACKS;
import java.util.*;

public class minstack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        minstack stt = new minstack();
        stt.push(7);
        stt.push(8);
        stt.push(6);
        stt.push(3);
        stt.push(4);
        System.out.println("original stacks element ");
        stt.printstack();
        System.out.println("top element : " + stt.top());
        System.out.println("min element : " + stt.getmin());
        
        // pop and print again 
        stt.pop();
        stt.printstack();
        System.out.println("new min : " + stt.getmin());
        
    }

    Stack<Integer> st;
    Stack < Integer> minst ;

    public minstack(){
        st = new Stack<>();
        minst = new Stack<>();

    }
    public void push(int val ){
        st.push(val);
        if(minst.size() ==0 || val<minst.peek()) minst.push(val);
        else minst.push(minst.peek());

    }
    public void pop(){
        st.pop();
        minst.pop();

    }
    public int top(){
        return st.peek();

    }
    public int getmin(){
        return minst.peek();

    }
    public void printstack(){
        System.out.println("stacks : " + st);

    }
}
