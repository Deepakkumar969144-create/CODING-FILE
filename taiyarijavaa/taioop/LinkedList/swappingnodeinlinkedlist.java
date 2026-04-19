package LinkedList;
import java.util.Scanner;
import java.util.*;

class swaplinkedlist{
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

        // swapping node in a linked lsit - 
    void swapnodes(int k){
    if(head == null || k > size) return;

    if(2*k - 1 == size) return;      // same node case

    node x = head;
    node idx = null;

    for(int i = 1; i < k; i++){
        idx = x;
        x = x.next;

    }

    node y = head;
    node idxx= null;

    for(int i = 1; i < size - k + 1; i++){
        idxx = y;
        y = y.next;
    }

    // prev links fix
    if(idx != null) idx.next = y;
    if(idxx != null) idxx.next = x;

    // next swap
    node temp = x.next;
    x.next = y.next;
    y.next = temp;

    // head update
    if(k == 1) head = y;
    if(k == size) head = x;

    // tail update
    if(k == 1) tail = x;
    if(k == size) tail = y;
        // x → kth from start
        // y → kth from end
        // links swap karo
}

}
public class swappingnodeinlinkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        swaplinkedlist ll = new swaplinkedlist();
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
        ll.swapnodes(k);
        System.out.print("After swapping k nodes: ");
        ll.display();

    }
}
