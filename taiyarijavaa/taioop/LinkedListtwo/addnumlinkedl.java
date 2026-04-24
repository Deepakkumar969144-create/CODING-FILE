package LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class addnum{
    node tail ;
    node head;
    int size ;
    void addattail( int val ){
        node temp  = new node(val);
        if( head == null ) head = tail = temp ;
        else{
            tail.next = temp ;
            tail = temp ;

        }
        size++;

    }
    void display(){
        node temp = head ;
        while (temp != null ) {
            System.out.print(temp.val + " ");
            temp = temp.next;
            
        }
        System.out.println();

    }
    node reverse(node head){
        node prev = null ;
        node curr = head;
        while (curr != null ) {
            node a = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = a;
            
        }
        return prev;

    }
    node addhead ( node h1 ,node h2 ){
        h1 = reverse(h1);
        h2 = reverse(h2);
        node dummy = new node(-1);
        node temp = dummy;
        int carry = 0;
        while (h1 != null ||  h2 != null || carry != 0) {
            int sum = carry ;
            if( h1 != null ){
                sum += h1.val;
                h1 = h1.next;

            }
            if( h2 != null ){
                sum += h2.val;
                h2 = h2.next;

            }
            temp.next = new node ( sum % 10 );
            carry = sum / 10 ;
            temp = temp.next;

        }
        return reverse(dummy.next);

    }
}

public class addnumlinkedl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      addnum ll = new addnum();
      addnum lll = new addnum();
         // a bali linked list - 
        ll.addattail(0);
         ll.addattail(0);
          ll.addattail(9);
          ll.addattail(9);
          ll.addattail(7);
          ll.addattail(9);
          System.out.println(" A linked list : ");
          ll.display();

          // b bali linked list - 
        lll.addattail(6);
        lll.addattail(9);
        lll.addattail(2);
        System.out.println("B linked list : ");
        lll.display();

        node result = ll.addhead(ll.head,lll.head );
        System.out.println("add number linked list : ");
        node temp = result;
        while (temp != null ) {
            System.out.print(temp.val + " ");
            temp = temp.next;

            
            } 
        }  
    }
    

