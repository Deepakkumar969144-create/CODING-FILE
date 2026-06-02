package HEAPS;
import java.util.Scanner;

import java.util.*;

public class kthlargestelement {
    public static int kthlargest( int arr [] , int k ){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for( int ele : arr ){
            pq.add(ele);
            if(pq.size()>k) pq.remove();

        }
        return pq.peek();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 3,5,4,2,9,};
        System.out.println("array element: ");
        for( int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.println();

        int k = 3;
        System.out.print("kth largest element : ");
        System.out.println(kthlargest(arr, k));
    }
    
}
