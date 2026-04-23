package LinkedListtwo;
import java.util.*;


class reversesublist{
    node head;
    node tail;
    int size;

    void addathead(int val){
        node temp = new node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;   // FIX
            head = temp;    

        }
        size++;

    }

    void addattail(int val){
        node temp = new node(val);
        if(head == null) head = tail = temp;
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

    node reverse(node head){
        node prev = null;
        node curr = head;

        while(curr != null){
            node fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;

        }
        return prev;

    }

    // MAIN FUNCTION
    node reverseBetween(int l, int r, node head){
        if(l == r) return head;

        node dummy = new node(-1);
        dummy.next = head;

        node prev = dummy;

        // move prev to (l-1)
        for(int i=1;i<l;i++){
            prev = prev.next;

        }

        node start = prev.next;      // l position
        node end = start;

        // move end to r
        for(int i=l;i<r;i++){
            end = end.next;

        }

        node nextPart = end.next;

        // break
        end.next = null;

        // reverse
        node newHead = reverse(start);

        // reconnect
        prev.next = newHead;
        start.next = nextPart;

        return dummy.next;
        
    }
}

public class reverseasublistofall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        reversesublist ll = new reversesublist();

        ll.addattail(1);
        ll.addattail(7);
        ll.addattail(5);
        ll.addattail(3);
        ll.addattail(9);
        ll.addattail(8);
        ll.addattail(10);
        ll.addattail(2);
        ll.addattail(2);
        ll.addattail(5);

        System.out.println("original linked list : ");
        ll.display();

        System.out.print("enter l : ");
        int l = sc.nextInt();

        System.out.print("enter r : ");
        int r = sc.nextInt();

        ll.head = ll.reverseBetween(l, r, ll.head);   //  MAIN CALL

        System.out.println("after reverse sublist : ");
        ll.display();

    }
}