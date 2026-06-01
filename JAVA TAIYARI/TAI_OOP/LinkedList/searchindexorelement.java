package taiyarijavaa.TAI_OOP.LinkedList;
import java.util.Scanner;
import java.util.*;


class search {
    node head;
    node tail;
    node temp;
    int size = 0;

    void addAttail(int val){
        node temp = new node(val);
        if(head == null){
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // index return karega (-1 agar nahi mila)
    int searchIndex(int val){
        if(head == null) return -1;
        node temp = head;
        int idx =0;
        // node temp = head;
        while(temp != null) return idx;
        
            // if(temp != null) return idx;
            temp = temp.next;
            idx++;
        
        return -1;
    }

    // element exist karta hai ya nahi
    boolean searchElement(int val){
        node temp = head;

        while(temp != null){
            if(temp.val == val) return true;
            temp = temp.next;
        }
        return false;
    }
}

public class searchindexorelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        search ss = new search();
        ss.addAttail(10);
        ss.addAttail(20);
        ss.addAttail(30);
        ss.addAttail(40);
        System.out.println("linked list : ");
        ss.display();

        ss.addAttail(50);
        ss.addAttail(60);
        System.out.println("full linked list element : ");
        ss.display();

        System.out.print("enter node : ");
        int val = sc.nextInt();
        System.out.println("Index of node : " + ss.searchIndex(val));
        System.out.print("enter node : ");
        int vall = sc.nextInt();
        System.out.println("Is present node : " + ss.searchElement(vall));


    }
}