package taiyarijavaa.TAI_OOP.LinkedList;
import java.util.Scanner;
import java.util.*;


class delete {
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

    void deletathead(){
        if(head == null){
            System.out.println("list is empty!");
            return;
        }
        head = head.next;
        if(head == null) tail = null;
        size--;
    }

    boolean search(int val){
        node temp = head;
        while(temp != null){
            if(temp.val == val) return true;
            temp = temp.next;
        }
        return false;
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

    void delete(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("Invalid index");
            return;
        }

        if(idx == 0){
            deletathead();
            return;
        }

        node temp = head;
        for(int i = 0; i < idx-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        if(idx == size-1) tail = temp;

        size--;
    }

    int get(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("Invalid index");
            return -1;
        }

        node temp = head;
        for(int i = 0; i < idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
}
public class deletee {
    public static void main(String[] args) {

        delete ll = new delete();

        // Add elements
        ll.addathead(5);
        ll.addattail(10);
        ll.addattail(20);
        ll.addattail(30);

        System.out.print("Initial List: ");
        ll.display();

        // Insert
        ll.insert(15, 2);
        System.out.print("After Insert at index 2 is node : ");
        ll.display();

        // Delete at head
        ll.deletathead();
        System.out.print("After delete at head: ");
        ll.display();

        // Delete at index
        ll.delete(2);
        System.out.print("After delete at index 2: ");
        ll.display();

        // Search
        System.out.println("Search 20: " + ll.search(20));
        System.out.println("Search 100: " + ll.search(100));

        // Get element
        System.out.println("node at index 1: " + ll.get(1));

        // Size
        System.out.println("Size: " + ll.size);
    }
}
