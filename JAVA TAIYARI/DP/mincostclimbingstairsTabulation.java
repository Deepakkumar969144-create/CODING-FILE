package DP;
import java.util.Scanner;
import java.util.*;

public class mincostclimbingstairsTabulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] cost = { 1, 2, 10, 1, 1, 5 };
        System.out.print( "min cost climbing statairs aarays element : ") ;
        for( int ele : cost){
            System.out.print(ele + " ");

        }
        System.out.println();
        System.out.print("min cost climbing stairs : ");
        System.out.println(mincost(cost));
    }
    public static int mincost( int [] cost ){
        int n = cost.length;
        int [] dp = new int[n];     // 0 to n-1 
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2 ; i<n; i++ ){
            dp[i] = cost[i] + Math.min(dp[i-1 ], dp[i - 2 ]);

        }
        return Math.min(dp[n-2 ], dp[n-1]);

    }
    
}
