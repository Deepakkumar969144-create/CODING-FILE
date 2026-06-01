package taiyarijavaa.TAI_OOP.LinkedList;
import java.util.*;

class removeduplicatetwo{
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
        size++;

    }

    void addattail(int val){
        node temp = new node(val);
        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;

        }
        size++;

    }

    void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    //  Merge Sort
    node getmid(node head){
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
                temp.next = a;   // FIX
                a = a.next;

            } 
            else {
                temp.next = b;
                b = b.next;

            }
            temp = temp.next;

        }

        if(a != null) temp.next = a;
        if(b != null) temp.next = b;

        return dummy.next;

    }

    node sortedlist(node head){
        if(head == null || head.next == null) return head;

        node mid = getmid(head);
        node righthead = mid.next;
        mid.next = null;

        node left = sortedlist(head);
        node right = sortedlist(righthead);

        return merge(left, right);

    }

    //  Remove ALL duplicates (Leetcode 82 type)
    node deleteduplicates(node head){
        node dummy = new node(-1);
        dummy.next = head;

        node t = dummy;
        node i = head;

        while(i != null){
            // duplicate detect
            if(i.next != null && i.val == i.next.val){
                int dup = i.val;

                // skip all duplicates
                while(i != null && i.val == dup){
                    i = i.next;

                }

                t.next = i; // skip duplicates

            } 
            else{
                t = i;
                i = i.next;

            }
        }
        return dummy.next;

    }
}

public class removeduplicatefromsortedlisttwo {
    public static void main(String[] args) {

        removeduplicatetwo ll = new removeduplicatetwo();
        // 🔹 Unsorted input
        ll.addathead(1);
        ll.addattail(3);
        ll.addattail(4);
        ll.addattail(6);
        ll.addattail(5);
        ll.addattail(3);
        System.out.print("Initial list: ");
        ll.display();

        //  Sort
        ll.head = ll.sortedlist(ll.head);
        System.out.print("After sorting: ");
        ll.display();

        //  Remove ALL duplicates
        ll.head = ll.deleteduplicates(ll.head);
        System.out.print("After removing all duplicates: ");
        ll.display();

    }
}
