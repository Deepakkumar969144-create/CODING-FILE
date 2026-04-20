package LinkedList;
import java.util.Scanner;
import java.util.*;

class removeduplicate {
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

    node getMid(node head){
    node slow = head;
    node fast = head.next;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

    node merge(node a, node b){
    node dummy = new node(-1);
    node temp = dummy;

    while(a != null && b != null){
        if(a.val <= b.val){
            temp.next = a;
            a = a.next;
        } else {
            temp.next = b;
            b = b.next;
        }
        temp = temp.next;
    }

    if(a != null) temp.next = a;
    if(b != null) temp.next = b;

    return dummy.next;
}   

    // method of sorted karne ke liye linked list - 
    node sortList(node head){
    if(head == null || head.next == null) return head;

    node mid = getMid(head);
    node rightHead = mid.next;
    mid.next = null;

    node left = sortList(head);
    node right = sortList(rightHead);

    return merge(left, right);
}

    // REMOVE DUPLICATE NODE - 
    node removeduplicate(node head){
    if(head == null) return null;

    node i = head;
    node j = head.next;

    while(j != null){
        if(i.val == j.val){
            j = j.next;
        } else {
            i.next = j;
            i = j;
            j = j.next;
        }
    }
    i.next = null;
    return head;
}

}

public class removeduplicatefromsortedlinkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        removeduplicate ll = new removeduplicate();
               // Add elements
        ll.addathead(1);
        ll.addattail(3);
        ll.addattail(4);
        ll.addattail(6);
        ll.addattail(5);
        ll.addattail(4);

        System.out.print("Initial List: ");
        ll.display();

        // Insert
        ll.insert(9, 2);
        System.out.print("After Insert at index 2: ");
        ll.display();

        // CALL IN sort karo pehle
        ll.head = ll.sortList(ll.head);
        System.out.print("After Sorting: ");
        ll.display();

        // CAL IN duplicate remove
        ll.head = ll.removeduplicate(ll.head);
        System.out.print("After Removing Duplicates: ");
        ll.display();

    }
}
