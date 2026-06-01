package taiyarijavaa.QUEUES;
import java.util.Scanner;
import java.util.*;

public class queueImplimentationviacircularArray {
    // queue is from f to r-1
    int []arr;
    int f;
    int r;
    int size;
     // correct constructor
    queueImplimentationviacircularArray(int capacity){
        arr = new int[capacity];
    }
    int size (){
        return size;

    }
    void add ( int ele ){
        if(size == arr.length){
            System.out.println("queue is empty!");
            return;

        }
        arr [r++] = ele;
        if(r == arr.length) r=0;
        size++;

    }
    int remove(){
        if(size == 0 ){
             System.out.println("queue is empty! ");
             return -1;

        }
        int peek = arr [f];
        f++;
        if(f== arr.length) f=0;
        size-- ;
        return peek;

    }
    void display(){
        if(size == 0){
            System.out.println("queue is empty!");
            return;

        }
        if(r>f){
            for( int i = f ; i<= r-1; i++){
                System.out.println(arr[i] + " ");

            }
        }
        else{
            for( int i = f ; i<arr.length ; i++){
                System.out.print(arr[i] + " ");

            }
            for( int i =0 ; i<r-1; i++ ){
                System.out.print(arr[i] + " ");

            }
        }
        System.out.println();

    }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        queueImplimentationviacircularArray q = new queueImplimentationviacircularArray(5);
        q.add(10);q.add(200);q.add(30);q.add(40);q.add(50);
        q.display();
        // q.add(80 ); // exception
        q.remove();
        q.add(60);
        q.add(70);
        q.display();

    }

}
