package taiyarijavaa.TAI_OOP.LinkedList;
import java.util.Scanner;
import java.util.*;

class swapingnode{
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

    // swapping node in a linked list - 
    void swappnode(node head , int k ){
        node slow = head;
        node fast = head;
        for(int i =1; i<=k ; i++){
            fast = fast.next;

        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            
        }
        fast= head;
        for(int i = 1; i<= k-1; i++){
            fast = fast.next;

        }
        int temp = fast.val;
        fast.val = slow.val;
        slow.val = temp ;

    }

}

public class swapingnodeinlinkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        swapingnode ll = new swapingnode();
          // Add elements
        ll.addathead(1);
        ll.addattail(2);
        ll.addattail(3);
        ll.addattail(4);
        ll.addattail(5);

        System.out.print("Initial List: ");
        ll.display();

        // Insert
        ll.insert(10, 2);
        System.out.print("After Insert at index 2: ");
        ll.display();

        // call karna 
        System.out.print("swaping node k node start and k node end node se enter k : ");
        int k = sc.nextInt();
        ll.swappnode(ll.head, k);
        System.out.print("After swapping k nodes: ");
        ll.display();

    }
    
}
