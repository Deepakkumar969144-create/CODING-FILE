package LinkedListtwo;
import java.util.*;


class rotatedoubly {
    node head;
    node tail;
    int size;

    void addathead(int val) {
        node temp = new node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;

        }
        size++;

    }

    void addattail(int val) {
        node temp = new node(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;

        }
        size++;

    }

    void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();

    }

    // ROTATE FUNCTION
    node rotate(int p) {
        if (head == null || p == 0) return head;
        node temp = head;

        // p-th node tak jao
        for (int i = 1; i < p; i++) {
            temp = temp.next;

        }
        node newHead = temp.next;

        // break the list
        temp.next = null;
        newHead.prev = null;

        // old tail ko old head se jodo
        tail.next = head;
        head.prev = tail;

        // update head & tail
        head = newHead;
        tail = temp;
        return head;

    }
}

public class rotatedoublyll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rotatedoubly ll = new rotatedoubly();

        ll.addattail(1);
        ll.addattail(2);
        ll.addattail(3);
        ll.addattail(4);
        ll.addattail(5);
        ll.addattail(6);

        System.out.println("Original linked list :");
        ll.display();

        System.out.print("enter p node from reverse linked list : ");
        int p = sc.nextInt();
        ll.head = ll.rotate(p);

        System.out.println("After rotate doubly linked list : ");
        ll.display();
        
    }
}