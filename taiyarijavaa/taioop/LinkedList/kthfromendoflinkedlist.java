package LinkedList;
import java.util.Scanner;
import java.util.*;


class linkedlistlist{
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

    // function to find the val of kth node from th end of a linied list 
   int getkthfromlast(node head, int k){
    node slow = head;
    node fast = head;

    // fast ko k steps aage le jao
    for(int i = 1; i <= k; i++){
        if(fast == null) return -1;
        fast = fast.next;
    }

    // ab dono ko move karo
    while(fast != null){
        slow = slow.next;
        fast = fast.next;
    }

    return slow.val;
}

}
public class kthfromendoflinkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linkedlistlist ll = new linkedlistlist();
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
        System.out.print("enter input end point node se k: ");
        int k = sc.nextInt();
        int ans = ll.getkthfromlast(ll.head, k);
        System.out.println("Kth from end node : " + ans);
    
        }
}
