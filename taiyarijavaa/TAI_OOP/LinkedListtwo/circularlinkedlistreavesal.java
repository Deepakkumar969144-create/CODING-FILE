package taiyarijavaa.TAI_OOP.LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class addnub{
    node head ;
    node tail;
    int size ;
    void addathead(int val ){
        node temp = new node(val);
        if( head == null ) head = tail = temp;
        else{
            head.next = temp;
            head = temp;

        }
        size++;

    }
    void addattail ( int val ){
        node temp = new node(val);
        if( head == null ) head = tail = temp;
        else{
            tail.next = temp ;
            tail = temp;

        }
        size++;

    }
    void display(){
        node temp = head;
        while (temp != null ) {
            System.out.print( temp.val + " ");
            temp = temp.next;
            
        }
        size++ ;

    }

    void circular(){
        if( tail != null ){
            tail.next = head;

        }
    }

    void printlist ( node head ){
        System.out.print( head.val + " ");
        node temp = head.next;
        while (temp != head ) {
            System.out.print( temp.val + " ");
            temp = temp.next;
            
        } 
    }
    void reverseprint (){
        if( head == null ) return ;
        ArrayList<Integer> list = new ArrayList<>();
        node temp = head;
        list.add(temp.val);
        temp = temp.next;
        while (temp != head ) {
            list.add(temp.val);
            temp = temp.next;
            
        }
        for( int i = list.size() - 1 ; i >= 0 ; i-- ){
            System.out.print( list.get(i) + " ");

        }
    }
}

public class circularlinkedlistreavesal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        addnub ll = new addnub();
        System.out.print("enter linked list size : ");
        int n = sc.nextInt();
        System.out.println("enter linked list node ya element : ");
        for( int i = 0 ; i<n ; i++ ){
            ll.addattail(sc.nextInt());

        }
        System.out.println("your linked list : ");
        ll.circular();
        ll.printlist(ll.head);
        System.out.println();
        System.out.println("final circular linked list traversal linked list: ");
        ll.reverseprint();

    }
    
}
