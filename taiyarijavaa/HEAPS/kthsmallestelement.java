package taiyarijavaa.HEAPS;
import java.util.Scanner;
import java.util.*;

public class kthsmallestelement {
    public static int kthsmallest(int [] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr ){
            pq.add(ele ); 
            if(pq.size() > k) pq.remove();

        }
        return pq.peek();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 7,10,4,3,20,15,};
        System.out.println("array element : ");
        for(int ele : arr){
            System.out.print( ele + " ");

        }
        System.out.println();
        int k = 3;

        System.out.print("k th smallest element : ");
        System.out.println(kthsmallest(arr, k));

    }
}

