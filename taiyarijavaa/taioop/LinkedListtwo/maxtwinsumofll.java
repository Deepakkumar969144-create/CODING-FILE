package LinkedListtwo;
import java.util.Scanner;
import java.util.*;
 
class maxitwinsumll{
    node head ;
    node tail ;
    int size = 0 ;
    void addathead ( int val ){
        node temp = new node(val);
        if( head == null ) head = tail = temp;
        else{
            head.next = temp;
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
        while (temp != null ) {
            System.out.print(temp.val + " ");
            temp = temp.next;
            
        }
        System.out.println();

    }
    node reverse(node head){
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
    int mactwinssum(node head ){
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null ) {
        slow = slow.next;
        fast = fast.next.next;

    }
    node head2 = reverse(slow);
    node i = head;
    node j = head2;
    int max = 0;
    while (j != null ) {
        int sum = i.val + j.val;
        max = Math.max( max , sum);
        i = i.next;
        j = j.next;
        
        }
        return max ; 

    }
}

public class maxtwinsumofll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        maxitwinsumll ll = new maxitwinsumll();
        ll.addathead(5);
        ll.addattail(4);
        ll.addattail(2);
        ll.addattail(1);
        System.out.println("original linked list : ");
        ll.display();
        System.out.println("max twin sum of a linked list : ");
        int ans = ll.mactwinssum(ll.head);
        System.out.println(ans);
        
    }
    
}
