package Graphs;
import java.util.*;

public class numberofIsland {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] grid = { 
            { '1' , '1' ,'0' , '0' , '0' },
            { '1' ,'1' , '0','0','0'}, 
            { '0' , '0' , '1' , '0' , '0'},
            { '0' , '0' , '0' , '1' , '1'}
        };
        System.out.print("value of array is : ");
        for( int [] array : grid ){
            for( int ele : array ){
                System.out.print( ele + " ");

            }
            System.out.println();

        }
        System.out.print( "number of island is : ");
        System.out.print(numberofislnad(grid));

    }
    public static int numberofislnad(int [][] grid ){
        int n = grid.length;
        int m = grid[0].length;
        boolean visited [][] = new boolean[n][m];
        int count = 0 ;
        for( int i =0 ; i<n; i++ ){
            for( int j =0 ; j<m; j++ ){
                if( grid[i][j] == '1' && !visited[i][j] ){
                    bfs(grid , visited, i , j );
                    count++ ;

                }
            }
        }
        return count;

    }
    public static void bfs( int [][] grid , boolean[][] visited , int row , int col ){
        Queue<int[] > q = new LinkedList<>();
        q.add(new int[]{row , col});
        visited[row][col] = true;
        while (! q.isEmpty()) {
            int front[] = q.remove();
            int r = front[0];
            int c = front[1];

            // up
            if( r-1 >= 0 && grid[r-1 ][c] == '1' && !visited[r-1][c]){
                visited[r-1][c] = true;
                q.add(new int[]{r-1 , c});

            }
            // down
            if( r+1 <grid.length && grid[r+1 ][c] == '1' && !visited[r+1][c]  ){
                visited[r+1][c] = true;
                q.add(new int[]{ r+1 , c });
                
            }
            // left 
            if( c-1 >= 0 && grid[r][c-1] == '1' && !visited[r][c-1]  ){
                visited[r][c-1] = true;
                q.add(new int[]{ r , c-1 });

            }
            // right 
            if( c+1 < grid[0].length && grid[r][c+1 ] == '1' && !visited[r][c+1 ]){
                visited[r][c+1] = true;
                q.add(new int[]{ r, c+1 });

            }
        }
    }
    
}
