package DP;
import java.util.Scanner;
import java.util.*;

public class NthfibonacciTabulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number fibonacci number : ");
        int n = sc.nextInt();
        System.out.print("Nth fibonacci number : ");
        System.out.println(nthfibonacci(n));

    }
    public static int nthfibonacci(int n ) {
        int[] dp = new int[n + 1 ]; // idx from 0 to n 
        if( n >= 1 ) dp [1 ] = 1 ;
        for(int i = 2 ; i<= n ; i++ )
        dp[i] = dp[ i - 1 ] + dp[i - 2  ];
        return dp[n];
        
    }
    
}
