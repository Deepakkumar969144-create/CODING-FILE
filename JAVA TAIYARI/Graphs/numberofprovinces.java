package Graphs;
import java.util.*;

public class numberofprovinces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr = { { 1,0,1 } , { 0 , 1 , 0 } , { 1, 0 , 1 }};
        System.out.println("value of array s : ");
        for( int[] row : arr ){
            for( int ele : row ){
                System.out.print( ele + " ");
            }
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            adj.add(new ArrayList<>());
            for (int j = 0; j < arr.length; j++) {
                adj.get(i).add(arr[i][j]);

            }
        }
        System.out.println("value of number of provinces : ");
        System.out.println(numprovi(adj, arr.length));
        
    }
    public static int numprovi( ArrayList< ArrayList< Integer >> adj , int n ){
        int count = 0 ;
        boolean [] visied = new boolean[n];
        for( int i = 0 ; i<n ; i++ ){
            if( !visied [i] ){
                bfs(i , visied , adj );
                count++ ;

            }
        }
        return count;

    }
    public static void bfs ( int i , boolean[] visited , ArrayList<ArrayList< Integer>> adj ){
        int n = adj.size();
        Queue<Integer> q = new LinkedList<>();
        q.add(i );
        visited[i] = true;
        while (q.size() > 0 ) {
            int front = q.remove();
            for( int j = 0; j<n ; j++ ){
                if( adj .get(front).get(j) == 1 && visited[j] == false ){
                    q.add(j);
                    visited[j] = true; 

                }
            }
        }

    }

}
