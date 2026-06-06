package DP;
import java.util.Scanner;
import java.util.*;

public class minpathsumTabulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("path sum arrays element : ");
        int [][]arr = {{ 1,3,1}, {1,5,1} , { 4,2,1}};
        for (int[] ele : arr) {
        for (int value : ele) {
        System.out.print(value + " ");

        }
        System.out.println();

        }   
        System.out.println();
        
        System.out.print( "min cost path sum / min cost sum / min path sum : ");
        System.out.println(minpathsum(arr));

    }
    public static int minpathsum(int [][] grid ){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0 ; i<m ; i++ ){
            for( int j = 0; j<n ; j++){
                if(i == 0 && j ==0 ) 
                dp[i][j] = grid[i][j];
                else if ( i==0 ) dp [i][j] = grid[i][j] + dp[i][j-1] ; 
                else if( j == 0 ) dp[i][j] = grid[i][j] + dp[i-1 ][j];
                else dp[i][j] = grid[i][j] + Math.min(dp[i][j-1] , dp[i-1][j]);

            }
        }
        return dp[m-1 ][n-1];
    }
    
}
