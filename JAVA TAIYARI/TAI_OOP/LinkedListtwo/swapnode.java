package taiyarijavaa.TAI_OOP.LinkedListtwo;
import java.util.Scanner;

import LinkedList.removeduplicatefromsortedlinkedlist;

import java.util.*;

class swapnodee{
     node tail ;
     node head ;
     int size = 0;
     void addathead(int val ){
        node temp = new node(val);
        if( head == null ) head = tail = temp ;
        else{
            head .next = temp;
            head = temp;

        }
        size++;
        
     }
     void addattail( int val ){
        node temp = new node(val);
        if( head == null ) head = tail = temp ;
        else {
            tail.next = temp;
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
     node swappair(node head ){
        if(head == null || head.next == null ) return head;
        node dummy = new node(-2);
        node a = head;
        node b = head.next;
        node c = dummy;
        while (a != null && b != null ) {
            c.next = b;
            a.next = b.next;
            b.next = a;
            c = a;
            a = a.next;
         if(a != null ) b = a.next;
            
        }
        return dummy.next;

     }
}

public class swapnode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        swapnodee ll = new swapnodee();
        ll.addathead(1);
        ll.addattail(2);
        ll.addattail(3);
        ll.addattail(4);
        System.out.println("original linked list : ");
        ll.display();
        ll.head =  ll.swappair(ll.head);
        System.out.println("after swap : ");
        ll.display();

    }
    
}
