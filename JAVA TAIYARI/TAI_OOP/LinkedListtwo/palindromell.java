package taiyarijavaa.TAI_OOP.LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class palindrome{
    node tail ;
    node head;
    int size = 0; 
    void addatheadd ( int val ){
        node temp = new node(val);
        if(head == null ) head = tail = temp;
        else{
            temp.next = head;
            head = temp;

        }
        size++;

    }
    void addattail( int val ){
        node temp = new node(val);
        if( tail == null ) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;

        }
        size++;

    }
    void display(){
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
            
        }
        System.out.println();

    }
    node reverse(node head){
        node curr = head;
        node prev = null ;
        node fwd = null;
        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
            
        }
        return prev;

    }
    boolean ispalindrome(node head){
        node slow = head;
        node fast = head;
        while ( fast.next != null && fast.next.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        // node head2 = reverse(slow.next);
        node head2 = slow.next;
        slow.next = null ;
        head2 = reverse(head2);
        node i = head;
        node j = head2;
        while (j != null) {
            if(i.val != j.val){
                return false;

            }
            i = i.next;
            j = j.next;

        }
        return true;

    }
}

public class palindromell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        palindrome ll = new palindrome();
        ll.addatheadd(1);
        ll.addattail(2);
        ll.addattail(1);
        ll.addattail(1);
        ll.addattail(2);
        ll.addattail(1);
        ll.addattail(2);
        ll.addattail(1);
        System.out.println("original linked list : ");
        ll.display();
        System.out.println("after palindrome linked list : ");
        boolean ans = ll.ispalindrome(ll.head);
        System.out.println(ans);
        System.out.println("linked list : ");
        ll.display();
    }
    
}
