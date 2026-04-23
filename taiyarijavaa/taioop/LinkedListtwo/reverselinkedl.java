package LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class reverselist{
    node tail;
    node head;
    int size = 0; 
    void addathead( int val ){
        node temp =new node(val);
        if( head == null ) head = tail = temp;
        else{
            temp .next = head;
            head = temp;

        }
        size++;

    }
    void addattail( int val ){
        node temp = new node(val);
        if( head == null ) head = tail = temp;
        else{
        tail.next = temp ;
        tail = temp;

        }
        size++;

    }
    void display(){
        node temp = head;
        while (temp != null ) {
            System.out.print(temp.val + " ");
            temp = temp.next;
            
        }
        System.out.println();

    }
    node reversellist(node head){
        node curr = head;
        node prev =  null;
        node fwd = null;
        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd ;
            
        }
        return prev;

    }
    // recursive method - 
    node revieserecmethod( node head){
        if( head == null  || head.next == null ) return head;
        node a = head.next;
        head.next = null;
        node b = revieserecmethod(a);
        a.next = head;
        return b;

    }
}

public class reverselinkedl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        reverselist ll = new reverselist();
        ll.addathead(1);
        ll.addattail(2);
        ll.addattail(3);
        ll.addattail(4);
        System.out.println("original linked list : ");
        ll.display();
        System.out.println("after reverse linked list : ");
        // ll.head = ll.revieserecmethod(ll.head);
        ll.head = ll.reversellist(ll.head);
        ll.display();
        
    }
    
}
