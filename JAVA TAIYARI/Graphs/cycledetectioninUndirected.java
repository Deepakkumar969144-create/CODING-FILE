package Graphs;
import java.util.*;

public class cycledetectioninUndirected {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v = 4;
        int E = 4;
        int edges[][] = { { 0, 1 }, { 0, 2 }, { 1, 2 }, { 2, 3 } };
        System.out.println("array value of : ");
        for( int [] array : edges ){
            for( int ele : array){
                System.out.print( ele + " ");

            }
            System.out.println();

        }
        System.out.println("value of v : "+ v +"\nvalue of E " + E);
        System.out.print("cycle detection in undirected : ");
        System.out.println(iscycle(E, edges));

    }
    static class pair{
        int vertex;
        int parent;
        pair( int vertex , int parent ){
            this.vertex = vertex;
            this.parent = parent;
            

        }
    }
    public static boolean iscycle( int n , int[][]edges ){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<n; i++ ){
            adj.add(new ArrayList<>());

        }
        for( int i = 0; i<edges.length; i++ ){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);

        }
        boolean[] vis = new boolean[n];
        for(int i = 0; i<n; i++ ){
            if(!vis[i] ){
                if(bfs( i, vis , adj )) return true;

            }
        }
        return false;

    }
    public static boolean bfs( int src, boolean[] vis, ArrayList<ArrayList<Integer>> adj ){
        vis[src] = true;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(src, -1 ));
        while (q.size() > 0 ) {
            pair front = q.remove();
            int vertex = front.vertex;
            int parent = front.parent;
            for( int ele : adj.get(vertex)){
                if(!vis[ele ] ){ 
                q.add(new pair(ele , vertex )   );
                vis[ele] = true;

            }
            else if( ele != parent) return true;

            }

        }
        return false;

    }

}
