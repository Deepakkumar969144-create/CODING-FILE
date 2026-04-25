package LinkedListtwo;
import java.util.*;

class clonelistwithnextrandom{
    node head;
    node tail;
    int size; 

    void addattail(int val){
        node temp = new node(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;

        }
        size++;

    }

    void display(node head){
        node temp = head;
        while(temp != null){
            int r = (temp.random != null) ? temp.random.val : -1;
            System.out.print("(" + temp.val + "," + r + ") ");
            temp = temp.next;

        }
        System.out.println();

    }

    node clonelinkedl(node head1){

        // deep copy (tumhara dummy wala)
        node dummy = new node(-1);
        node t = dummy;
        node t1 = head1;

        while(t1 != null){
            node n = new node(t1.val);
            t.next = n;
            t = t.next;
            t1 = t1.next;

        }

        node head2 = dummy.next;

        // merging lists alternatively (same idea, bas pointers safe kiye)
        t1 = head1;
        node t2 = head2;

        while(t1 != null && t2 != null){
            node n1 = t1.next;
            node n2 = t2.next;

            t1.next = t2;
            t2.next = n1;

            t1 = n1;
            t2 = n2;

        }

        // assign random pointers (tumhara hi loop, fix traversal)
        t1 = head1;
        while(t1 != null){
            if(t1.random != null){
                t1.next.random = t1.random.next;

            }
            t1 = t1.next.next;

        }

        // splitting linked list (tumhara hi idea, safe version)
        t1 = head1;
        t2 = head2;

        while(t1 != null && t2 != null){
            t1.next = t2.next;
            t1 = t1.next;

            if(t1 != null){
                t2.next = t1.next;

            }
            t2 = t2.next;

        }

        return head2;

    }
}

public class clonelistwithnextandrandom{
    public static void main(String[] args){

        clonelistwithnextrandom ll = new clonelistwithnextrandom();

        ll.addattail(1);
        ll.addattail(2);
        ll.addattail(3);
        ll.addattail(4);

        // random pointers
        ll.head.random = ll.head.next.next;
        ll.head.next.random = ll.head;
        ll.head.next.next.random = ll.head.next.next.next;
        ll.head.next.next.next.random = ll.head.next;

        System.out.println("Original:");
        ll.display(ll.head);

        node cloned = ll.clonelinkedl(ll.head);

        System.out.println("Cloned:");
        ll.display(cloned);

        System.out.println(ll.head == cloned); // false hona chahiye to Dono alag objects hain
        

    }
}