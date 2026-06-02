package HEAPS;
import java.util.Scanner;
import java.util.*;

public class minimumcastofropes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {4,3,2,6};
        System.out.println("array element: ");
        for(int ele : arr){
            System.out.print(ele + " ");

        }
        System.out.println();

        System.out.print("minimum cost of ropes : ");
        System.out.println(minimumcost(arr));

    }
    public static int minimumcost(int [] arr){
        int totalcost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);

        }
        while(pq.size() > 1){
            int first = pq.remove();
            int second = pq.remove();
            int sum = first + second;
            totalcost += sum;
            pq.add(sum);

        }
        return totalcost;

    }

}