package DP;
import java.util.Scanner;
import java.util.*;

public class Nthfibonaccinumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        System.out.print("Nth fibonacci number : ");
        System.out.println(nthfibonacci(n));

    }
    public static int nthfibonacci( int n ){
        if( n<= 1 ) return n ;
        int [] dp = new int[3 ];
        dp[1] = 1 ;
        for( int i = 1 ; i<= n-1 ; i++ ){
            dp[2] = dp[1]+ dp[0 ];
            dp[0] = dp[1] ;
            dp[1] = dp[2];

        }
        return dp[2];

    }
    
}
