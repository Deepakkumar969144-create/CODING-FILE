package LinkedList;
import java.util.Scanner;
import java.util.*;

class fromendoflinst {
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

    // remove n th node from en dof list - 
    void removenthfromend(int n){
    if(head == null) return;

    node fast = head;
    node slow = head;

    // fast ko n steps aage le jao
    for(int i = 1; i <= n; i++){
        if(fast == null) return;    // n > size
        fast = fast.next;

    }

    // agar first node delete karni ho
    if(fast == null){
        head = head.next;
        if(head == null) tail = null;
        size--;
        return;

    }

    // dono ko move karo
    while(fast.next != null){
        slow = slow.next;
        fast = fast.next;

    }

    // delete node
    slow.next = slow.next.next;

    // agar tail delete hui ho
    if(slow.next == null){
        tail = slow;

    }

    size--;

    }

}
public class removenthnodefromendoflinst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        fromendoflinst ll = new fromendoflinst();
        // Add elements
        ll.addathead(5);
        ll.addattail(10);
        ll.addattail(20);
        ll.addattail(30);

        System.out.print("Initial List: ");
        ll.display();

        // Insert
        ll.insert(15, 2);
        System.out.print("After Insert at index 2: ");
        ll.display();

        // call karna 
        System.out.print("enter end point node se n ; ");
        int n = sc.nextInt();
        ll.removenthfromend(n);
        System.out.print("After removing nth from end node: ");
        ll.display();

    }
}
