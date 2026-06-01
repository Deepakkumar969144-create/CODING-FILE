package taiyarijavaa.TAI_OOP.LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class segregate{
    node head;
    node tail ;
    int size = 0 ;
    void addathead(int val ){
        node temp = new node(val);
        if(head == null ) head = tail = temp;
        else {
            temp.next = head ;

        }
        size++;

    }
    void addattail( int val ){
        node  temp = new node(val);
        if(tail == null ) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;

        }
        size++;

    }
    void display(){
        node temp = head;
        while (temp != null ) {
            System.out.print( temp.val + " ");
            temp = temp.next;
            
        }
        System.out.println();

    }
    void insert( int val , int idx ){
        if( idx < 0 || idx > size){
            System.out.println("invailid index ");
            return;

        }
        if(idx == 0){
            addathead(val);
            return;

        }
        if(idx == size){
            addattail(val);
            return;

        }
        node temp = head;
        for(int i = 0 ; i<idx ; i++){
            temp = temp.next;

        }
        node t = new node(val);
        t.next = temp.next;
        temp.next = t;
        size++;

    }
    node segregateEvenOdd(node head ){
        node evendummy = new node(-1);
        node odddummy = new node(-1);
        node eventail = evendummy;
        node oddtail = odddummy;
        node temp = head;
        while (temp != null ) {
            if( temp . val %2 == 0 ){
                eventail.next = temp;
                eventail = eventail.next;

            }
            else{
                oddtail.next = temp ;
                oddtail = oddtail.next;

            }
            temp = temp.next;
            
        }
        oddtail.next = null ; // imp
        eventail.next = odddummy.next; // join 
        return evendummy.next;
    
    }
}

public class segregateevenandodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        segregate ll = new segregate();
        ll.addathead(17);
        ll.addattail(15);
        ll.addattail(8);
        ll.addattail(9);
        ll.addattail(2);
        ll.addattail(4);
        ll.addattail(5);
        ll.addattail(3);
        ll.addattail(1);
        System.out.println("original linked list : ");
        ll.display();
        System.out.println("final linked list : ");
        ll.head = ll.segregateEvenOdd(ll.head);
        ll.display();
        
    }
}
