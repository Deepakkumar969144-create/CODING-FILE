package taiyarijavaa.TAI_OOP.LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class reversedoubly{
    node head;
    node tail;
    int size;
    void addattail(int val) {
    node temp = new node(val);
    if (head == null) head = tail = temp;
    else {
        tail.next = temp;
        temp.prev = tail;
        tail = temp;

        }
        size++;
        
    }
    
    void display(){
        node temp = head;
        while (temp != null ) {
            System.out.print(temp.val+ " ");
            temp = temp.next;
            
        }
        System.out.println();

    }
    node reversedll(node head ){
        node prev = null;
        node curr = head;
        node fwd = null ;
        while (curr != null ) {
            fwd = curr.next;
            curr.next = prev;
            curr.prev = fwd; // added line 
            prev = curr;
            curr = fwd;
            
        }
        return prev;

    }
    // method - 2 
    node reverseedll( node head ){
        if( head.next == null ) return head;
        node temp = null ;
        node curr = head;
        while (curr != null ) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev; // aage leke jaa rahe hai  
            
        }
        return temp.prev;

    }
}
public class reverseadoublyll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        reversedoubly ll = new reversedoubly();
        ll.addattail(3);
        ll.addattail(4);
        ll.addattail(5 );
        ll.addattail(6);
        System.out.println("original linked list : ");
        ll.display();
        System.out.println("after reverse a doubly linked list : ");
        ll.head = ll.reverseedll(ll.head);
        ll.display();
    }
}
