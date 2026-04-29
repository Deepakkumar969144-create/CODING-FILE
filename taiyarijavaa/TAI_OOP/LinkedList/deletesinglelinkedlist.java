package taiyarijavaa.TAI_OOP.LinkedList;
import java.util.Scanner;
import java.util.*;

class linkedlist{
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

    void deletenode(node target){
        if(target == null || target.next == null){
        System.out.println("Cannot delete this node");
        return;

    }

        // * main method this question - 
        target.val = target.next.val;
        target.next = target.next.next;
        size--; // IMPORTANT

    }

}

public class deletesinglelinkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linkedlist ll = new linkedlist();
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

        node temp = ll.head.next.next.next; // suppose 20 wala node
        ll.deletenode(temp);
        System.out.print("new linkedlist : ");
        ll.display();

    }
}
