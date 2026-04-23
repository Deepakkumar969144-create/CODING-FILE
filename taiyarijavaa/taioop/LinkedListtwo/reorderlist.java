package LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class reorderl{
    node tail ;
    node head ; 
    int size ;
    void addathead(int val ){
        node temp = new node(val);
        if(head == null ) head = tail = temp;
        else{
            head.next = temp;
            head = temp;

        }
        size++;

    }
    void addattail(int val ){
        node temp = new node(val);
        if( head == null ) head = tail = temp;
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
    node reverse(node head ){
        node curr = head;
        node prev = null;
        while (curr != null ) {
            node fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
            
        }
        return prev;

    }
    void reorder(node head ){
        if( head == null || head.next == null ) return;
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        node head2 = reverse(slow.next);
        slow.next = null;

        node a = head;
        node b = head2;

        while (b != null ) {
            node x = a.next;
            node y = b.next;
            a.next = b;
            b.next = x;
            a =x;
            b = y;

        }
    }
}

public class reorderlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        reorderl ll = new reorderl();
        ll.addathead(1);
        ll.addattail(2);
        ll.addattail(3);
        System.out.println("original linked list : ");
        ll.display();
        System.out.println("reordered linkedlist : ");
        ll.reorder(ll.head);
        ll.display();

    }
}
