package taiyarijavaa.STACKS;
import java.util.Scanner;
import java.util.*;
  
    class implenetationstackll{
        node head;
        node tail;
        int size;
        void push(int ele ){
            node n = new node(ele);
            n.next = head;
            head = n;
            size++;

        }
        int pop(){
            if( size== 0 ) System.out.println("stack is empty");
            int top = head.val;
            head = head.next;
            size--;
            return top ;

        }
        int peek(){
            if( size == 0 ) System.out.println("stack is empty ");
            return head.val;

        }
        void display(){
            node temp = head;
            while (temp != null ) {
                System.out.println(temp.val);
                temp = temp.next;
                
            }
            System.out.println();

        }
    }

    public class implementationstacksl
        public static void main(String[] args) {
            implenetationstackll st = new implenetationstackll();
            st.push(10); st.push(20); st.push(30); st.push(40);
            st.display();

        }

