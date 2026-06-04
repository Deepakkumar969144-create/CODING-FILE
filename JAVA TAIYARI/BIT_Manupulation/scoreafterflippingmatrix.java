package BIT_Manupulation;
import java.util.Scanner;
import java.util.*;

public class scoreafterflippingmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] grid = { { 0, 0, 1,1 } , { 1,0,1,0 } , { 1, 1, 0 , 1 }};
        System.out.print ("score after flipping matrix : ");
        System.out.println(matrixscore(grid));

    }
    public static int matrixscore( int [][] grid){
        int m = grid.length, n = grid[0].length;
        for(int i =0 ; i< m ; i++ ){
            if( grid [i] [0] == 0 ){
                for(int j =0 ; j<n ; j++ ){
                    grid[i][j] = 1 - grid[i][j] ;

                }
            }
        }
        for(int j = 0 ; j<n; j++ ){
            int zeros = 0 , ones = 0 ;
            for( int i = 0 ; i<m ; i++ ){
                if( grid [i][j] == 0 ) zeros++;
                else ones++;

            }
            if( zeros > ones ) {
                for( int i = 0 ; i<m ; i++ ){
                    grid[i][j] ^= 1 ;

                }
            }
        }
        int sum = 0 ;;
        int pow = 1 ; 
        for(int j = n-1 ; j>= 0 ; j-- ){
            int ones = 0 ;
            for( int i =0 ; i < m ; i++ ){
                if( grid [i] [j] == 1 ) ones++ ;

            }
            sum += pow * ones;
            pow *= 2 ;

        }
        return sum;

    }
    
}
