package LinkedList;

import oopps.polymorphism.human;

class insertt{ // user defined data structure 
    node head ; // null
    node tail;  // null
    int size = 0;
    int val;
    int idx;

        // * method of add head node - 
     void addAtHead(int val ){
        node temp = new node(val);
        if(head == null ) head = tail = temp;
        else {
            temp.next = head;   // insert At Head linkedlist data structure me 
            head = temp;

        }
        size++;
    }

            // * method of add tail node - 
    void addAttail(int val){
        node temp = new node (val);
        if(tail == null ) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;

        }
        size++;
    }

        // * method of display node - 
    void display(){
        if( head == null ) return ;
        node temp = head;
        while ( temp != null ) {
            System.out.print(temp.val + " ");
            temp = temp.next;
            
        }
        System.out.println();

    }

        // * method of delet head node - 
    void deletAtHead(){
        if( head == null ) {
            System.out.println("list is empty ! ");
            return;
        }
        head = head.next;
        if(head == null )  tail = null;
        size -- ;
    }

        // * method of insert -
    void insert(int val , int idx){
      if( idx < 0 || idx> size) System.out.println("invaild index ");
      else if( idx ==0 ) addAtHead(val);
      else if ( idx == size) addAttail(val);
      else {
        node temp = head;
        for( int i= 1; i<= idx -1; i++){
            temp = temp.next;

        }
         node t = new node(val);
        t.next = temp.next;
        temp.next = t;
        size ++;

        }
        return;
    } 

        // * mehtod of 
    int get ( int idx ){
        node temp  = head;
        for ( int i =1 ; i<= idx ; i++ ){
            temp = temp.next;

        }
        return temp.val;

    }
}
public class iinsert {

    public static void main(String[] args) {
       
        insertt ll = new insertt();
        ll.addAttail(10);
        ll.addAttail(20);
        ll.addAttail(30);
        ll.addAttail(40);
        ll.display();
        ll.addAttail(50);
        ll.addAttail(60);
        ll.display();
        System.out.println(ll.size);
        ll.insert(30,2);
        ll.display();
        ll.deletAtHead();
        ll.display();
        System.out.println((ll.size));
        System.out.println(ll.get(4));

    }
}


