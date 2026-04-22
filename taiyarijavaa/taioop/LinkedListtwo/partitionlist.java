package LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class partition{
    node head;
    node tail ;
    int size = 0 ;
    void addathead(int val ){
        node temp = new node(val);
        if(head == null ) head = tail = temp ;
        else {
            temp.next = head;

        }
        size++;

    }
    void addattail(int val ){
        node temp = new node(val);
        if( tail == null ) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;

        }
        size++;

    }
    void display(){
        node temp = head;
        while( temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();

    }
    void insert(int val , int idx ){
        if(idx < 0 || idx > size){
            System.out.println("invailid index ");
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
        node temp = head ;
        for( int i =0; i<idx ; i++ ){
            temp = temp.next;

        }
        node t = new node(val);
        t.next = temp.next;
        temp.next = t;
        size++;

    }
    node partition (node head , int x ){
        node d1 = new node(-1);
        node d2 = new node(-2);
        node t1 = d1;
        node t2 = d2;
        node t = head;
        while (t != null ) {
            if(t.val < x ){
                t1.next = t;
                t1 = t1.next;
                
            }
            else {
            t2.next = t;
            t2 = t2.next;
            }
            t = t.next;
            
        }
        t1.next = d2.next;
        t2.next = null ;
        return d1.next;

    }
}

public class partitionlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        portition ll = new portition();
        ll.addathead(1);
        ll.addattail(4);
        ll.addattail(3);
        ll.addattail(2);
        ll.addattail(5);
        ll.addattail(2);
        System.out.println("original list : ");
        ll.display();
        System.out.print("enter x node number : ");
        int x = sc.nextInt();
        ll.head = ll.partition(ll.head, x);
        System.out.println("portition list : ");
        ll.display();
    }
    
}
