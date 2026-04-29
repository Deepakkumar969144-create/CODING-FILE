package taiyarijavaa.TAI_OOP.LinkedList;
import java.util.Scanner;
import java.util.*;

class intersectionoftwo{
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

        // inter section of two linked list - 
  node getintersectionnode(node head1, node head2){

    int len1 = 0;
    int len2 = 0;

    node temp1 = head1;
    while(temp1 != null){
        temp1 = temp1.next;
        len1++;
    }

    node temp2 = head2;
    while(temp2 != null){
        temp2 = temp2.next;
        len2++;
    }

    temp1 = head1;
    temp2 = head2;

    // length equal karo
    if(len1 > len2){
        for(int i = 1; i <= len1 - len2; i++){
            temp1 = temp1.next;
        }
    } else {
        for(int i = 1; i <= len2 - len1; i++){
            temp2 = temp2.next;
        }
    }

    // intersection find karo
    while(temp1 != temp2){
        temp1 = temp1.next;
        temp2 = temp2.next;
    }

    return temp1;
}
}

public class intersectionoftwolinkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        intersectionoftwo ll = new intersectionoftwo();
       // common part
        node common = new node(70);
        common.next = new node(80);
        common.next.next = new node(90);

        // list A
        node headA = new node(10);
        headA.next = new node(20);
        headA.next.next = new node(30);
        headA.next.next.next = common;

        // list B
        node headB = new node(50);
        headB.next = new node(60);
        headB.next.next = common;

        // call
        node ans = ll.getintersectionnode(headA, headB);

        if(ans != null)
            System.out.println("Intersection at: " + ans.val);
        else
            System.out.println("No intersection");

    }
}
