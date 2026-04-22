package LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class merge{
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

    node sortedmerge(node head1, node head2){
    node i = head1;
    node j = head2;

    node dummy = new node(-1);
    node k = dummy;

    while(i != null && j != null){
        if(i.val <= j.val){
            k.next = i;
            i = i.next;

        } 
        else {
            k.next = j;
            j = j.next;

        }
        k = k.next;   // IMPORTANT

    }

    if(i != null) k.next = i;
    else k.next = j;

    return dummy.next;

    }
}

public class mergetwosortdll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        merge ll = new merge();
        merge lll = new merge();

        System.out.print("enter number of size list 1 : ");
        int a = sc.nextInt();
        System.out.print("enter nodes: ");
        for(int i =0; i<a ; i++){
            ll.addattail(sc.nextInt());

        }
        System.out.print("enter number of size list 2 : ");
        int b = sc.nextInt();
        System.out.print("enter nodes : ");
        for(int i =0; i<b; i++){
            lll.addattail(sc.nextInt());

        }
        System.out.println("merged lists : ");
        node mergetwolistNode = ll.sortedmerge(ll.head , lll.head );
        ll.head = mergetwolistNode;
        ll.display();

    }

}
