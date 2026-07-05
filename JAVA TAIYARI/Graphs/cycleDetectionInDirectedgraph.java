package Graphs;
import java.util.*;

public class cycleDetectionInDirectedgraph {    // khahn`s Alogoritham -  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("valur of Array element : ");
        int [][] edges = { {0,1},{1,2}, {2,3},{0,3},{3,1}};
        for( int[] arry : edges){
            for( int ele : arry){
                System.out.print( ele + " ");

            }
            System.out.println();

        }
        int v = 5;
        System.out.println("value of v : "+v);
        System.out.println("Cycle Detection In Directed graph : ");
        System.out.println(iscyclic(v, edges));
        
    }
    public static boolean iscyclic( int n , int[][] edges){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for( int i = 0 ; i<n; i++ ){
            adj.add(new ArrayList<>());

        }
        int [] indegree = new int[n];
        for( int i = 0 ; i<n; i++ ){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            indegree[v] ++ ;

        }
        Queue<Integer> q = new LinkedList<>();
        for( int i = 0 ; i<n; i++ ){
            if(indegree[i] == 0 ){
                q.add(i );

            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (q.size() > 0 ) {
            int vertex = q.remove();
            ans.add(vertex);
            for( int ele: adj.get(vertex)){
                indegree[ele ]--;
                if(indegree[ele] == 0 ) q.add(ele );

            }
            
        }
        return ( n != ans.size() ); //* */

    }
    
}
