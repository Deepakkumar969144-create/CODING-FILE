package Graphs;
import java.util.*;

public class numberofenclaves {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int grid[][] = { { 0, 0, 0, 1 }, { 0, 1, 1, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 1 }, { 0, 1, 1, 0 } };
        System.out.println("value of arrays is : ");
        for( int [] array : grid ){
            for( int ele : array){
                System.out.print( ele +  " ");

            }
            System.out.println();

        }
        System.out.print("number of enclaves is : ");
        System.out.println(numberofenclave(grid));

    }
    static class pair{
        int row;
        int col ;
        pair( int row , int col ){
        this.row = row;
        this.col = col;

        } 
    }
    public static int numberofenclave( int [][] arr ){
        int m = arr.length;
        int n = arr[0].length;
        Queue<pair> q = new LinkedList<>();
        for( int j = 0 ; j<n; j++ ){
            if( arr [0][j] == 1 ){
                arr[0][j] = -1 ;
                q.add(new pair(0, j));

            }
            if( arr[m-1 ][j] == 1 ){
                arr[m-1][j] = -1 ;
                q.add(new pair(m-1 , j));

            }
        }
        for( int i =0 ; i<m ; i++ ){
            if( arr[i][0] == 1 ){
                arr[i][0] = -1 ;
                q.add(new pair(i , 0));

            }
            if(arr[i][n-1] == 1 ){
                arr[i][n-1] = -1 ;
                q.add(new pair(i , n-1));

            }
        }
        while (q.size() > 0 ) {
            pair front = q.remove();
            int row = front.row;
            int col = front.col;
            if( col-1 >= 0 && arr[row][col -1 ] == 1 ){
                arr[row ][col - 1 ] = - 1;
                q.add(new pair(row, col - 1));

            }
            if( col + 1 < n && arr[row ][col + 1 ] == 1){
                arr[row][col +1 ] = -1 ;
                q.add(new pair(row , col + 1));

            }
            if( row -1 >= 0 && arr[row - 1 ][col ] == 1 ){
                arr[row - 1 ][col ] = -1;
                q.add(new pair(row - 1 , col));

            }
            if( row + 1 < m && arr[row + 1 ][ col] == 1 ){
                arr[row + 1 ] [col] = -1 ;
                q.add(new pair(row + 1 , col ));

            }
    
        }
        int count = 0 ;
        for( int i =  0; i<m ; i++ ){
            for( int j = 0 ; j<n; j++ ){
                if(arr[i][j] == 1  ) count++;

            }
        }
        return count++;

    }
    
}
