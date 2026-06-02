package HEAPS;
import java.util.Scanner;
import java.util.*;

public class nearlysorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 6,5,3,2,8,10,9};
        System.out.println("array element : ");
        for( int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.println();

        int k = 3;
        System.out.println("nearly sorted : ");
        // System.out.println(nearsorted(arr, k));
        nearlysorted obj = new nearlysorted();
        obj.nearsorted(arr, k);
        for( int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.println();

    }
    public static void nearsorted( int [] arr , int k ){
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for( int ele : arr ){
            pq.add(ele);
            if(pq.size() > k ) arr[ idx ++ ] = pq.remove();

        }
        while ( pq.size()> 0 ) {
            arr[ idx ++ ] = pq.remove();
            
        }
    }
    
}
