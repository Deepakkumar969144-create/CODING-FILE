package LinkedList;
import java.util.Scanner;
import java.util.*;


class middleoflinkedlist{
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

    void deletemiddle(){
    if(head == null || head.next == null){
        head = null;
        tail = null;
        size = 0;
        return;
    }

    node slow = head;
    node fast = head;
    node idx = null;

    while(fast != null && fast.next != null){
        idx = slow;
        slow = slow.next;
        fast = fast.next.next;
    }

    // delete middle node
    idx.next = slow.next;

    // aagar last node delete ho raha ho (rare case )
    if(slow == tail){
        tail = idx;
    }

    size--;
}

}
public class deletemiddleoflinkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        middleoflinkedlist ll = new middleoflinkedlist();
         // Add elements
        ll.addathead(2);
        ll.addattail(4);
        ll.addattail(6);
        ll.addattail(7);
        ll.addattail(5);
        ll.addattail(1);

        System.out.print("Initial List: ");
        ll.display();

        // Insert
        ll.insert(15, 2);
        System.out.print("After Insert at index 2: ");
        ll.display();

        // deletemiddle ko call karna 
        ll.deletemiddle();
        System.out.print("After deleting middle node : ");
        ll.display();

    }
}
