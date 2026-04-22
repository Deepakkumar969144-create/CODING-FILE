package LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class oddeven{
    node tail;
    node head;
    int size = 0;
    void addathead(int val){
        node temp = new node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;

        }
        size++;

    }
    void addattail(int val ){
        node temp = new node(val);
        if( tail ==null ) head = tail = temp;
        else{
            tail . next = temp;
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
    void insert( int val , int idx ){
        if( idx <0 || idx >size){
            System.out.println("invailed index ");
            return;

        }
        if(idx == 0){
            addathead(val);
            return;

        }if( idx == size){
            addattail(val);
            return;

        }
        node temp = head;
        for( int i = 0 ; i<idx ; i++ ){
            temp = temp.next;

        }
        node t = new node(val);
        t.next = temp.next;
        temp.next = t  ;
        size++;

    }
    node oddeven(node head){
        if(head == null) return head;

        node odd = new node(-1);
        node even = new node(-1);

        node t1 = odd;
        node t2 = even;

        node t = head;

        while(t != null){
            // odd index node
            t1.next = t;
            t1 = t1.next;
            t = t.next;

            // even index node
            if(t != null){
                t2.next = t;
                t2 = t2.next;
                t = t.next;

            }
        }

        t2.next = null;          // important
        t1.next = even.next;     // join

        return odd.next;

    }

}

public class oddevenll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        oddeven ll = new oddeven();
        ll.addathead(2);
        ll.addattail(1);
        ll.addattail(3);
        ll.addattail(5);
        ll.addattail(6);
        ll.addattail(4);
        ll.addattail(7);
        System.out.println("original linked list : ");
        ll.display();
        System.out.println("odd even linked list : ");
        ll.head = ll.oddeven(ll.head);
        ll.display();

    }
}
