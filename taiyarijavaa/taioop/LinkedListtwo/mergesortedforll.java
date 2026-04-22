package LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class mergesort{
    node head;
    node tail;
    int size =0;
    void addathead(int val ){
        node temp = new node(val);
        if(head == null ) head = tail = temp;
        else {
            temp.next = head;
            head = temp;

        }
        size ++;

    }
    void addattail(int val ){
        node temp = new node(val);
        if( tail == null ) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;

        }
        size++ ;

    }
    void display(){
        node temp = head;
        while ( temp != null ) {
            System.out.print( temp.val + " ");
            temp = temp.next;
            
        }
        System.out.println();

    }
    void insert ( int val , int idx ){
        if(idx < 0 || idx > size){
            System.out.println("invailid index ");
            return;
        }
        if(idx == 0 ){
            addathead(val);;
            return;

        }
        if ( idx == size){
            addattail(val);
            return;

        }
        node temp = head;
        for(int i = 0 ; i<idx ; i++ ){
            temp= temp.next;

        }
        node t = new node(val);
        t.next = temp.next;
        temp.next = t ;
        size ++;

    }

    node mergesortt(node head ){
        if( head == null || head.next == null ) return head;
        node slow = head;
        node fast = head;
        while( fast.next != null  && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;

        }
        node head2 = slow.next;
        slow.next = null ;

        node left = mergesortt(head);
        node right = mergesortt(head2);
        return merge(left, right);

    }
    node merge(node head1 , node head2 ){
    node i = head1;
    node j = head2;

    node dummy = new node(-1);
    node k = dummy;

    while(i != null && j != null){
        if(i.val <= j.val){
            k.next = i;
            i = i.next;
        } 
        else {
            k.next = j;
            j = j.next;
        }
        k = k.next;
    }

    if(i != null){
        k.next = i;
    } else {
        k.next = j;
    }

    return dummy.next;
    }
}

public class mergesortedforll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        mergesort ll = new mergesort();
        ll.addathead(3);
        ll.addattail(5);
        ll.addattail(2);
        ll.addattail(4);
        System.out.println("original list : ");
        ll.display();

        // call 
        ll.head = ll.mergesortt(ll.head);
        System.out.println("merge sorted list : ");
        ll.display();

    }
}
