package LinkedListtwo;
import java.util.*;


class deletionandreversecll {
    node tail;
    node head;
    int size;

    void addattail(int val) {
        node temp = new node(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;

        }
        size++;

    }

    void display() {
        if (head == null) return;

        node temp = head;
        System.out.print(temp.val + " ");
        temp = temp.next;

        while (temp != head) {   // fix for circular
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();

    }

    void reverselist(node head) {
        node prev = null;
        node curr = head;
        node fwd = null;

        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;

        }
    }

    node reverse(node head) {
        node tail = head;

        while (tail.next != head) tail = tail.next;

        tail.next = null;            // break circular
        reverselist(head);           // reverse linear list

        head.next = tail;            // reconnect
        return tail;                 // new head

    }

    node deletenode(node head, int key) {
        node tail = head;

        while (tail.next != head) {
            tail = tail.next;

        }

        tail.next = null; // break circular

        if (head.val == key) {
            head = head.next;
            tail.next = head;
            return head;

        }

        node temp = head;
        node temp2 = head.next;

        while (temp2 != null) {
            if (temp2.val == key) {   //  FIX
                temp.next = temp2.next;
                break;

            }
            temp = temp.next;
            temp2 = temp2.next;

        }

        tail.next = head; // make circular again
        return head;

    }

    void circular() {
        if (tail != null) {
            tail.next = head;

        }
    }
}

public class deletionandreversecircularll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        deletionandreversecll ll = new deletionandreversecll();

        ll.addattail(2);
        ll.addattail(5);
        ll.addattail(7);
        ll.addattail(9);
        ll.addattail(10);
        ll.addattail(11);

        ll.circular(); // VERY IMPORTANT
        System.out.println("original linked list : ");
        ll.display();

        System.out.print("enter delete node : ");
        int k = sc.nextInt();

        ll.head = ll.deletenode(ll.head, k);
        System.out.println("after deletion linked list: ");
        ll.display();

        ll.head = ll.reverse(ll.head);
        System.out.println("after reverse: ");
        ll.display();

    }
}