package Graphs;
import java.util.*;

import javax.management.Query;

public class bipartiteGraph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] edges = { { 0, 3 }, { 1, 2 }, { 3, 2 }, { 0, 2 }};
        for( int [] array : edges){
            for( int ele : array){
                System.out.print( ele + " ");

            }
            System.out.println();

        }
        int v = 4 ;
        System.out.println("valur of v : " + v);
        System.out.println("Bipartite Graph : ");
        System.out.println(isbipartite(v, edges));
        
    }
    public static boolean isbipartite( int n , int[][]edges ){
        ArrayList<ArrayList<Integer >> adj = new ArrayList<>();
        for( int i = 0 ;i<n; i++ ){
            adj.add(new ArrayList<>());

        }
        for( int i = 0 ; i<edges.length; i++ ){
            int u = edges[i][0];
            int v = edges[i][1] ;
            adj.get(u).add(v);
            adj.get(v).add(u);

        }
        int [] vis = new int[n];
        // 1 is green . 2 is red , 0 is uncolourd 
        for( int i = 0 ; i<n; i++ ){
            if( vis[i] == 0     ){
                if(!bfs( i , vis, adj )) return false;

            }
        }
        return true;

    }
    public static boolean bfs(int src , int[]vis, ArrayList<ArrayList<Integer>> adj ){
        vis[src ] = 1 ;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while (q.size() > 0 ) {
            int vertex = q.remove();
            int color = vis[vertex];
            for( int ele : adj.get(vertex)){
                if( vis[ele] == 0 ){
                    q.add(ele );
                    vis[ele ] = 3 - color ;

                }
                else if(vis[ele] == color) return false;

            }
    
        }
        return true;

    }
    
}
