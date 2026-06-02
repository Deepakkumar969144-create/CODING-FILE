package HEAPS;
import java.util.*;

public class kclosepointstoorigin {
    class triplet implements Comparable<triplet>{
        int dist;
        int x;
        int y;
        triplet(int dist , int x , int y){
            this.dist = dist;
            this.x = x;
            this.y = y;

        }
        public int compareTo(triplet t){
            return t.dist - this.dist;

        }
    }
    public int[][] kclosest(int [][] points, int k){
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        for(int [] point : points){
            int x = point[0];
            int y = point[1];
            int dist = x * x + y * y;
            pq.add(new triplet(dist , x , y));
            if(pq.size() > k){
                pq.remove();

            }
        }
        int [][] ans = new int[k][2];
        for(int i = 0 ; i < k ; i++){
            triplet top = pq.remove();
            ans[i][0] = top.x;
            ans[i][1] = top.y;

        }
        return ans;

    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] points = {{1,3}, {-2,2}, {5,8}, {0,1}};
        int k = 2;
        System.out.println("k = " +k);
        System.out.println("points : ");
        for(int [] ele : points){
            System.out.print(ele[0] + " " + ele[1]);

        }
        System.out.println();
        System.out.println("k closest points to origin : ");
        kclosepointstoorigin obj = new kclosepointstoorigin();
        int [][] ans = obj.kclosest(points , k);
        for(int [] ele : ans){
            System.out.print(ele[0] + " " + ele[1]);

        }
    }
}
