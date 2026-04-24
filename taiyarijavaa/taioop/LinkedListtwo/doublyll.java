package LinkedListtwo;
import java.util.Scanner;

import java.util.*;

class doublyl{
    node head;
    node tail ;
    int size;
    void addattail(int val ){
        node n = new node(val);
        if( head == null ) head = tail = n;
        else{
            tail.next = n;
            n.prev = tail;
            tail = n;

        }
        size++;

    }

    void insertathead ( int val ){
        node  n = new node(val);
        if( size == 0 ) head = tail = n;
        else{
            n.next = head; 
            head.prev = n;
            head = n;

        }
        size++;

    }
    void insert( int idx , int val ) throws Exception {
        if(idx<0 || idx > size ) throw new Exception("Index out of bound ");
        else if( idx == 0 ) insertathead(val);
        else if (idx == size ) addattail(val);
        else{
            node n = new node(val);
            node temp = head;
            for( int i = 1 ; i<idx -1 ; i++){
                temp= temp.next;

            }
            n.next = temp.next;
            temp.next.prev = n;
            temp.next = n;
            n.prev = temp;
            size++;

        }
    }
    int get(int idx ) throws Exception{
        if( idx < 0 || idx>size ) throw new Exception("index out of bound ");
        else if ( idx == size-1 ) return  tail.val;
        else{
            node temp ;
            if( idx <= size/2){
                temp = head; 
                for( int i = 1 ; i<= idx ; i++ ){
                    temp = temp.next;

                }
            }
            else{
                temp = tail;
                for( int i = 1 ; i<= size - idx - 1 ; i++ ){
                    temp = temp.prev; 

                }
            }
            return temp.val ;

        }
    }
    void deletathead() throws Exception {
        if( size == 0 ) throw new Exception(" list is empty ");
        head = head.next;
        if(head != null ) head.prev = null ;
        size--;

    }
    void deleteattail()throws Exception {
        if( size == 0 ) throw new Exception("list is empty");
        tail = tail.prev;
        if( tail != null ) tail.next = null ;
        size--;

    }
    void delet( int idx ) throws Exception{
        if( idx < 0 || idx >= size ) throw new Exception(" index out of bound ");
        else if ( idx == 0 ) deletathead();
        else if ( idx ==  size-1 ) deleteattail();
        else{
            node temp = head;
            for ( int i =0 ; i<idx ; i++ ){
                temp= temp.next;

            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev; 
            size--;

        }
    }
    void display(){
        node temp = head;
        while (temp != null ) {
            System.out.print(temp.val + " ");
            temp = temp.next;
            
        }
        System.out.println();

    }
    void displayreverse(){
        node temp = tail;
        while (temp != null ) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
            
        }
        System.out.println();

    }
}

public class doublyll {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        doublyl ll = new doublyl();
        ll.addattail(1);
        ll.addattail(2);
        ll.addattail(3);
        ll.addattail(4);
        ll.insertathead(5);
        ll.insertathead(6);
        ll.display();
        ll.displayreverse();
        
    }
    
}
