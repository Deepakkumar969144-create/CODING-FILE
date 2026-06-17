package DP.knapsack;
import java.util.Scanner;
import java.util.*;

public class knapsackwithduplicatewitems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("value for val : ");
        int val[] = {1,1 };
        for( int ele : val ){
            System.out.print(ele + " ");

        }
        System.out.println();
        System.out.print( "value for wt : ");
        int wt [] = { 2,1};
        for( int ele : wt ){
            System.out.print(ele + " ");

        }
        System.out.println();
        System.out.print("knapsack with duplicates items : ");
        System.out.println( knapsack(val, wt, 3));

    }
    public static int knapsack( int val[] , int wt[] , int capacity ){
        int n =val.length;
        int [][] dp = new int[n ][capacity+1 ];
        return helper(0, capacity, val, wt, dp);

    }
    public static int helper ( int i , int capacity , int[]val , int wt[] , int[][] dp ){
        if(i == val.length ) return 0;
        if(dp[i][capacity ] != 0 ) return dp[i] [capacity ];
        int skip = helper(i+1 , capacity, val, wt, dp);
        if( capacity < wt[i] )
        return dp[i][capacity] = skip;
        int pick = val[i] + helper(i, capacity-wt[i], val, wt, dp);
        return dp[i][capacity] = Math.max(pick, skip);

    }
    
}
