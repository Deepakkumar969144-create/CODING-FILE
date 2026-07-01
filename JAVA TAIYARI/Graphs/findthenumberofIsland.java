package Graphs;
import java.beans.Visibility;
import java.util.*;

public class findthenumberofIsland {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("value of array is ( 76 - L AND 87 - W ) : ");
        int grid[][] = { { 'L', 'L', 'W','W', 'W'} ,
        { 'W' , 'L', 'W','W', 'L'}, 
        { 'L' , 'W', 'W','L','L'},
        { 'W','W','W' , 'W','W'},
        { 'L' ,'W','L','L','W'} };
    for( int [] array : grid ){
        for( int ele : array){
            System.out.print( ele + " ");

        }
        System.out.println();
    }
    System.out.print("find the number of island is : ");
    System.out.println(numberofisland(grid));

    }
    public static int numberofisland( int [][] grid ){
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m ];
        int count = 0 ;
        for( int i =0 ; i<n ; i++ ){
            for( int j =0 ; j<m ; j++ ){
                if(grid[i][j] == 'L' && !visited[i][j]){
                    bfs( grid , visited , i , j );
                    count ++ ;

                }
            }
        }
        return count;

    }
    public static void bfs( int [][] grid , boolean [][] visited , int row , int col ){
        Queue<int[] > q = new LinkedList<>();
        q.add(new int[] {row , col });
        visited[row ][col] = true;
        int dr[] = { -1 ,1 , 0 , 0 };
        int dc [] = { 0 , 0 , -1 , 1 };
        while (!q.isEmpty()) {
            int front[] = q.remove();
            int r = front[0];
            int c = front[1];
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= 0 && nr < grid.length &&
                        nc >= 0 && nc < grid[0].length &&
                        grid[nr][nc] == 'L' &&
                        !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    q.add(new int[] { nr, nc });

                }
            }
        }

    }

}
