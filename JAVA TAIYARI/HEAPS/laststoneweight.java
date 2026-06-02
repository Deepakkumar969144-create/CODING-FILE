package HEAPS;
import java.util.Scanner;
import java.util.*;

public class laststoneweight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [ ] ston = { 2,7,4,1,8,1};
        System.out.println("array element stone: ");
        for( int ele : ston ){
            System.out.print( ele + " ");

        }
        System.out.println();

        System.out.print("last stone weight : ");
        System.out.println(lastsrone(ston));

    }
    public static int lastsrone( int [] ston){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for( int ele : ston ){
            pq.add(ele);

        }
        while (pq.size()> 1) {
            int first = pq.remove();
            int second = pq.remove();
            if(first != second){
                pq.add(first - second);

            }
        }
        if(pq.size() == 0) return 0;
        return pq.size();

    }
    
}
