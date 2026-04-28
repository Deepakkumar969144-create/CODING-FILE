package taiyarijavaa.STACKS;
import java.util.*;

public class removenodesfromll {
    node tail;
    node head;
    int size ;
    void addathead( int val ){
        node temp = new node(val);
        if( head == null ) head  = tail = temp;
        else {
            head.next = temp;
            head = temp;

        }
        size++;

    }
    void addattail( int val ){
        node temp = new node(val);
        if( head == null ) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;

        }
        size++ ;

    }
    void display(){
        node temp = head;
        while (temp != null ) {
            System.out.print(temp.val + " ");
            temp= temp.next;
            
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        removenodesfromll ll = new removenodesfromll();
        ll.addathead(5);
        ll.addattail(2);
        ll.addattail(13);
        ll.addattail(3);
        ll.addattail(8);
        System.out.println("original ll : ");
        ll.display();

        System.out.println("remove node from linkedlist : ");
        ll.head = ll.removenode(ll.head);
        ll.display();

    }

    public node removenode(node head ){
        Stack<node> st = new Stack<>();
        node temp = head;
        while (temp != null ) {
            while (st.size() > 0 && st.peek().val < temp . val) {
                st.pop();
                
            }
            st.push(temp);
            temp = temp.next;
            
        }
        while (st.size() > 0 ) {
            node top = st.pop();
            top.next = temp;
            temp = top;
            
        }
        return temp;

    }

            // method 2 = 
    // public node reverse(node head){

    //     node prev = null;
    //     node curr = head;
    //     while(curr != null){
    //         node next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;

    //     }
    //     return prev;

    // }

    // public node removenode(node head){
    //     head = reverse(head);   // Step 1: reverse list

    //     node curr = head;
    //     Stack<node> st = new Stack<>();

    //     while(curr != null){  //  Step 2: process nodes (remove smaller ones)

    //         while(st.size() > 0 && st.peek().val < curr.val){
    //             st.pop(); // nodes "gayab"

    //         }
    //         st.push(curr);
    //         curr = curr.next;

    //     }
    //     node next = null; //  Step 3: rebuild list from stack

    //     while(st.size() > 0){
    //         node temp = st.pop();
    //         temp.next = next;
    //         next = temp;

    //     }
    //     return reverse(next); // Step 4: reverse again (final fix order)

    // }
}
