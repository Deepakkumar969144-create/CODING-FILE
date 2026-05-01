package taiyarijavaa.QUEUES;
import java.util.*;

public class LLImplementationofqueue {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    node head;
    node tail;
    int size;

    int size(){
        return size;

    }

    void add(int ele){ // add at tail
        node n = new node(ele);
        if(size == 0) head = tail = n;
        else {
            tail.next = n;
            tail = n;

        }
        size++;

    }

    int peek(){
        if(size == 0){
            System.out.println("queue is empty ");
            return -1;

        }
        return head.data;

    }

    int remove(){
        if(size == 0){
            System.out.println("queue is empty ");
            return -1;

        }
        int val = head.data;
        head = head.next;
        size--;
        if(size == 0) tail = null;
        return val;

    }

    void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        LLImplementationofqueue q = new LLImplementationofqueue();

        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);

        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());

    }
}