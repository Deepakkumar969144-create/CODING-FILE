package LinkedList;
import java.util.Scanner;
import java.util.*;

        // nodes class - 
class node {
    int val;
    node next;

    node(int val){
        this.val = val;
        this.next = null;
    }
}

public class basixx {
    public static void main(String[] args) {
        // 10->20->30->40->50
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        // connect karenge (link karege )
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
            System.out.println("ulte number : ");
            System.out.print(e.val+ " ");
            System.out.print(a.next.next.next.val+ " ");
            System.out.print(a.next.next.val+ " ");
            System.out.print(a.next.val+ " ");
            System.out.println(a.val+ " ");
            System.out.println("sahi number: ");
            System.out.print(a.val+" ");
            System.out.print(b.val+ " ");
            System.out.print(c.val+ " ");
            System.out.print(d.val+ " ");
            System.out.println(e.val+ " ");


    }
}

// Linked List ek chain of nodes hoti hai
// Har node ke 2 part hote hain:
        //ata d
        // next (address/reference)

// Array me elements continuous memory me hote hain
// Linked List me elements random jagah pe hote hain but pointers se connected hote hain

// Head kya hota hai?
//      First node ka reference = head
//      head → [10 | next] → [20 | next] → [30 | null]
