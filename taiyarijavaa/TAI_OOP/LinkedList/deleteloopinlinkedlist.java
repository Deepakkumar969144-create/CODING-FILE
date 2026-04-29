package taiyarijavaa.TAI_OOP.LinkedList;
import java.util.Scanner;
import java.util.*;

// llinked llist ccyclic - 
class deletloop{
    node head;
    node tail;
    int size = 0;

    void addathead(int val){
        node temp = new node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++; // FIX
    }

    void addattail(int val){
        node temp = new node(val);
        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++; // FIX
    }

    void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }
    
    void insert(int val, int idx){
        if(idx < 0 || idx > size){
            System.out.println("Invalid index");
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
        for(int i = 0; i < idx-1; i++){
            temp = temp.next;
        }

        node t = new node(val);
        t.next = temp.next; // FIX
        temp.next = t;
        size++;

    }
    
    // delete loop in linked list -
    boolean deleteloopinll(node head){
        node slow = head;
        node fast = head;
        while ( fast != null && fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if( fast == slow ){
                return true;

            }
        }

          return false; // loop nahi mila
    }
}

public class deleteloopinlinkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        deletloop ll = new deletloop();
            // Add elements
        ll.addathead(1);
        ll.addattail(3);
        ll.addattail(4);
        ll.addattail(6);
        ll.addattail(5);

        System.out.print("Initial List: ");
        ll.display();

        // Insert
        ll.insert(9, 2);
        System.out.print("After Insert at index 2: ");
        ll.display();

        // call karna 
        System.out.println("");
        boolean hasLoop = ll.deleteloopinll(ll.head);
        System.out.println("Loop present: " + hasLoop);

                // output - true aayega - 
        // boolean hasLoop = ll.deleteloopinll(ll.head);
        // System.out.println("Loop present: " + hasLoop);

    }
}
