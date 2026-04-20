package LinkedList;
import java.util.Scanner;

import binarysearch.sortedandrotatedarray;

import java.util.*;

class rotate{
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

    // rotate list - 
    int length (node head ){
        int len = 0;
        node temp = head;
        while (temp != head) {
            temp = temp.next;
            len ++;
            
        }
        return len ;

        }
          node rotateright ( node head , int k ){
            if(head == null || head.next == null )
            return head;
            int  n = length(head);
            k %= n;
            if( k ==0 ) return head;
            node slow = head;
            node fast = head;
            for( int i = 1 ; i <= k +1; i++ ){
                fast = fast.next;

            }
            while ( fast != null ) {
                slow = slow.next;
                fast = fast.next;

            }
            node a = slow.next;
            slow.next = a;
            node tail = a ;
            while (tail .next != null ) {
                tail  = tail.next ;
                tail.next = head;
                
            }
            return a ;

    }

}
public class rotatelist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rotate ll = new rotate();
         ll.addattail(1);
          ll.addattail(2);
        ll.addattail(3);
        ll.addattail(4);
        ll.addattail(5);
         ll.addattail(6);
         ll.addattail(7);
         System.out.println("linked list : ");
         ll.display();

         System.out.print("enter k node : ");
         int k = sc.nextInt();
         

    }
}
