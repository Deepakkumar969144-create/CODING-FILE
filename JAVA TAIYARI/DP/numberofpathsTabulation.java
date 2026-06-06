package DP;
import java.util.Scanner;
import java.util.*;

public class numberofpathsTabulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter m : ");
        int m = sc.nextInt();
        System.out.print("enter N : ");
        int n = sc.nextInt();

        System.out.print( "number of paths tabulation : ");
        System.out.println(numberofpaths(m, n));

    }
    public static int numberofpaths(int m , int n ){
        int[][] dp = new int[m][n];

        for(int i = 0 ; i<m; i++ ){
            for( int j = 0 ; j<n ; j++ ){
                if(i == 0 || j == 0 )
                    dp[i][j] = 1;

                else
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];

            }
        }
        return dp[m-1][n-1];
        
    }
}