package taiyarijavaa.STACKS;
import java.util.Scanner;
import java.util.*;
  
    class implemetationstackll{
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
                System.out.print(temp.val + " ");
                temp = temp.next;
                
            }
            System.out.println();

        }
    }

    public class implementationstacksviall{

        public static void main(String[] args) {
            implemetationstackll st = new implemetationstackll();
            st.push(10); st.push(20); st.push(30); st.push(40);
            System.out.println("original stacks : ");
            st.display();
            st.pop();  // delete 
            System.out.println("after remove element in stack: ");
            st.display();

        }
    }

