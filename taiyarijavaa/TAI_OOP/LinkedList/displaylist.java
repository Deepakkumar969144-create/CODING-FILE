package taiyarijavaa.TAI_OOP.LinkedList;
import java.util.Scanner;
import java.util.*;

// class node {  // basixx me aapan ne node banaya tha to bahi chalega pure package linkedList me 
//     int val;
//     node next;
//     node(int val){
//         this.val = val;

//     }
// }

public class displaylist {
    public static void displayrec(node head){
        if(head == null) return ;
        System.out.println(head.val + " ");
        displayrec(head.next);

    }
    public static void display(node head ){
      // while loop se printing( display) - 
    node temp = head;
    while ( temp != null){
        System.out.print(temp.val + " ");
        temp = temp.next; // imp.

    }
    System.out.println();

             // for loop se display - 
    // for(node tempp = head; temp != null; temp = temp.next){
    //     System.out.println(temp.val + " ");
    
    // }
    // System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
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
        System.out.println("linked list : " );
        display(a);
        // displayrec(a);
        System.out.print("entr index : ");
        int idx = sc.nextInt();
        System.out.println( "linked list node your index : " + get(a, idx)); // d bala print hoga kiyo ki index 4 par d hai 

            // error aayega kiyo ki null ya null ke bad kuchh nahi hota null end point hota hai 
        // node n = null ;
        // n.val = 78;
        // System.out.println(n.val);
        // System.out.println(n.next);

    }
    private static int get ( node head , int idx ){
        node temp  = head;
        for ( int i =1 ; i<= idx ; i++ ){
            temp = temp.next;

        }
        return temp.val;

    }
}
