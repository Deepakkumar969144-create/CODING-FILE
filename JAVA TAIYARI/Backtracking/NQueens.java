package Backtracking;
import java.util.Scanner;
import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = 5;
        System.out.println("value of matrix m*n : " + n);
        char[][] chessboard = new char[n][n];
        for(int i = 0 ; i<n ; i++ ){
            for(int j = 0; j<n; j++ ){
                chessboard[i][j] = 'x';
            
            }
        }
        nQueens( 0 , chessboard );

    }
    public static void nQueens( int row , char[][] chessboard ){
        int n = chessboard.length;
        if( row == n ){ // a valid ans 
            for(int i = 0; i<n; i++ ){
                for( int j = 0; j<n; j++ ){
                    System.out.print(chessboard [i][j] + " ");

                }
                System.out.println();

            }
            System.out.println();
            return;
        }
        for( int col = 0 ; col <n; col++ ){
            if( canqueesBePlace( row , col , chessboard )){
                chessboard [ row ][col ] = 'Q'; // mark 
                nQueens(row+1 , chessboard); //  move to the next row 
                chessboard[row][col] = 'x'; // unmark 

            }
        }
    }
    public static boolean canqueesBePlace( int row , int col , char[][] chessboard ){
        int n = chessboard.length;
        int i = row - 1 ;
        while (i >= 0 ) {
            if(chessboard[i][col] == 'Q') return false ;
            i--;
            
        }
        // check left diagonal 
        i = row -1 ;
        int j = col -1 ;
        while ( i >= 0 && j >= 0 ) {
            if(chessboard [i][j] == 'Q') return false;
            i--;
            j--;
            
        }
        // check right diagonal 
        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < n ) {
            if( chessboard [i][j] == 'Q')
            return false;
            i--;
            j++ ;
            
        }
        return true;

    }
    
}
