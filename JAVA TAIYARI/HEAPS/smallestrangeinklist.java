package HEAPS;
import java.util.*;

public class smallestrangeinklist {
    // smallest range covering element fromk lists 
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                { 4, 7, 9, 12, 15 },
                { 0, 8, 10, 14, 20 },
                { 6, 12, 16, 30, 50 }

        };
        System.out.println("matrix : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }
        smallestrangeinklist outer = new smallestrangeinklist();
        ArrayList<Integer> ans = outer.findsmallest(arr);
        System.out.println();

        System.out.println("smallest range is : ");
        System.out.println("[" + ans.get(0) + "," + ans.get(1) + "]");

    }
    public class  triplet implements Comparable<triplet>  {
        int ele;
        int row ;
        int col;
        triplet( int ele , int row , int col ){
            this.ele = ele;
            this.row = row;
            this.col = col;

        }
        public int compareTo(triplet t){
            return this.ele = t.ele ;

        }
    }
    public ArrayList < Integer> findsmallest(int [][] arr ){
        int k = arr.length , n = arr[0].length;
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for( int i =0 ; i< k ; i++){
            max = Math.max(max, arr[i] [0]);
            min = Math.min(min, arr[i][0]);
            pq.add(new triplet(arr[i][0], i, 0));

        }
        int a = min;
        int b = max;
        // [a,b ] is the range 
        while (true) {
            triplet top = pq.remove();
            int ele = top.ele;
            int row = top.row;
            int col = top.col;
            if(max - ele < b - a ){
                a = ele ;
                b = max;

            }
            if(col == n-1 ) break;
            int next = arr[row][col + 1 ];
            max = Math.max(max, next);
            pq.add(new triplet(next, row, col+1 ));
            
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);
        return ans;

    }

}
