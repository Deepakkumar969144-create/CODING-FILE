package taiyarijavaa.QUEUES;
import java.util.Scanner;
import java.util.*;

public class Implementationnvialeinkedlinst {
    node head;
    node tail;
    int size;
    int peek(){
        if( size == 0 ){
            System.out.println("queue is empty!");
            return -1;

        }
        return head.val;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Implementationnvialeinkedlinst q = new Implementationnvialeinkedlinst();
        q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);
        q.display();
        System.out.println(q.remove());
        q.display();

    }
    int remove(){
        if( size == 0 ){
            System.out.println("queue is empty ");
            return -1;

        }
        int front = head.val;
        head = head.next;
        size -- ;
        return front; 

    }
    void add ( int val ){ // add at tail
        node temp = new node(val);
        if(size == 0 ) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;

        }
        size++ ;

    }
    void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
                
        }
        System.out.println();

    }

}
