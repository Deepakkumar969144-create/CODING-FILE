package LinkedList;
import java.util.Scanner;
import java.util.*;

// node class to basixx me bana chuke hia 
class Linkedlist{ // user defined data structure 
    node head ; // null
    node tail;  // null
    int size = 0;
    void addAtHead(int val ){
        node temp = new node(val);
        if(head == null ) head = tail = temp;
        else {
            temp.next = head;   // insert At Head linkedlist data structure me 
            head = temp;

        }
    }
    void addAttail(int val){
        node temp = new node (val);
        if(tail == null ) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;

        }
        size++;
    }
    void display(){
        if( head == null ) return ;
        node temp = head;
        while ( temp != null ) {
            System.out.println(temp.val + " ");
            temp = temp.next;
            
        }
        System.out.println();

    }
    void deletAtHead(){
        if( head == null ) {
            System.out.println("list is empty ! ");
            return;
        }
        head = head.next;
        if(head == null )  tail = null;
        size -- ;
    }
    // int search ( int val ){
    //     if(head = null ){
    //         return -1;
    //     }
    //     node idx =0;
    //     while(temp != null ) return idx;
    //     temp = temp.next;
    //     idx ++;
    //     return -1;
    // }
    // boolean search ( int val ){
    //     if(head == null ) return false;
    //     node temp = head;
    //     while (temp != null ) {
    //         if( temp.val == val ) return true ;
    //         temp = temp.next;

    //     }
    //     return false ;
    // }
} 
public class linkedlistdatastructure {
    public static void main(String[] args) {
   Linkedlist ll = new Linkedlist();
   ll.addAttail(10);
   ll.addAttail(20);
   ll.addAttail(30);
   ll.addAttail(40);
   ll.display();
   ll.addAttail(50);
   ll.addAttail(60);
   ll.display();
   ll.deletAtHead();
   ll.display();
   System.out.println((ll.size));

    }
}

        // linkedlist data structure - 
// Linked List = nodes ka chain
// Har node me:
//      [data | next]
// next me address/reference hota hai next node ka

//  Array:
//       [10][20][30][40]  (continuous memory)

// Linked List:
// 10 → 20 → 30 → 40 → null
// But actual memory:
        // Address 100 → (10, 500)
        // Address 500 → (20, 800)
        // Address 800 → (30, 200)
        // Address 200 → (40, null)
// Random jagah pe stored hota hai
// connection pointer se hota hai