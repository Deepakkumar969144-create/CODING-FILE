package taiyarijavaa.TAI_OOP.LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class flattenamultilevel{
    node tail ;
    node head;
    int size;
    void addattail(int val ){
        node temp = new node(val);
        if( head == null ) head = tail = temp; 
        else { 
            tail.next = temp;
            temp.prev = tail;
            tail = temp;

        }
        size++;

    }
    void addathead( int val ){
        node temp = new node(val);
        if( head == null ) head = tail = temp;
        else {
            head.next = temp;
            temp.prev = head;
            head = temp;

        }
        size++;

    }
    void display(){
        node temp = head;
        while (temp != null ) {
            System.out.print( temp.val + " ");
            temp= temp.next;
            
        }
        System.out.println();

    }
    void displayoriginalll(node head){
        node temp = head;

    while(temp != null){
        System.out.print(temp.val + " ");
        temp = temp.next;

        }
        System.out.println();

    temp = head;
    while(temp != null){
        if(temp.child != null){
            displayoriginalll(temp.child);

        }
        temp = temp.next;

        }
    }
    node flatten(node head ){
        if( head == null ) return head;
        node curr = head;
        while (curr != null ) {
            if( curr.child == null ) curr= curr.next;
            else{
                node fwd = curr.next;
                node c = flatten(curr.child);
                curr.child = null;
                curr.next = c;
                c.prev = curr;
                node temp = c;
                while (temp.next != null ) {
                    temp = temp.next;
                    
                }
                temp.next = fwd;
                if(fwd != null ) fwd.prev = temp;
                curr = fwd;

            } 
        }
        return head;

    }
}

public class flattenamultileveldoublyll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        flattenamultilevel ll = new flattenamultilevel();

        // main linked list 
        node n1 = new node(1);
        node n2 = new node(2);
        node n3 = new node(3);
        node n4 = new node(4);
        node n5 = new node(5);
        node n6 = new node(6);

         // next and prev. connection 
        n1.next = n2; 
        n2.prev = n1;
        n2.next = n3; 
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = n5; 
        n5.prev = n4;
        n5.next = n6; 
        n6.prev = n5;

        // main linkedlist ke child linked list 
        node n7 = new node(7);
        node n8 = new node(8);
        node n9 = new node(9);
        node n10 = new node(10);

        // child linkedlist ke next and prev connection 
        n7.next = n8; n8.prev = n7;
        n8.next = n9; n9.prev = n8;
        n9.next = n10; n10.prev = n9;

         // child linkedlist ke child linkedlist 
        node n11 = new node(11);
        node n12 = new node(12);

        // chile ll ke child ll ke next and prev connection 
        n11.next = n12; n12.prev = n11;

        // child connections
        n3.child = n7;
        n8.child = n11;

        ll.head = n1; // n1 node ko head bnana 

        System.out.println("original linked list : ");
        ll.displayoriginalll(ll.head);

        ll.flatten(ll.head); // call karna 
        System.out.println("flatten a multilevel doubly linked list : ");
        ll.display();

    }  
}
