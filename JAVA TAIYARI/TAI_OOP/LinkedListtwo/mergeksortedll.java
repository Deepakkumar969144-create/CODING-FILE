package taiyarijavaa.TAI_OOP.LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class mergekth{
    node head;
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
    void addattail( int val ){
        node temp = new node(val);
        if(head == null ) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;

        }
        size++;

    }
    void display(){
        node temp = head;
        while (temp != null ) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();

    }
    // merge kth sorted linked list -
    // input: arr[] = [ 1, 2, 3, ] , [ 4,5,] , [ 5,6] , [ 7, 8] 
    // output : 1->2-> 3->4->5->6->7->8
    // code mere style me 
    
}
public class mergeksortedll {
    
}
