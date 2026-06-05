package DP;
import java.util.Scanner;
import java.util.*;

public class mincostclimbingstairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cost[] = { 1, 2,10, 1, 1, 5 };
        System.out.print(" arrya element cost climbing stairs: ");
        for( int ele : cost ){
            System.out.print( ele + " ");

        }
        System.out.println();
        System.out.println("min cost climbing stairs : ");
        System.out.println(mincost(cost));

    }
    static int [] dp;
    public static int mincost(int [] cost ){
        int n = cost.length; 
        dp = new int[n];    // 0 to n-1 
        Arrays.fill(dp, -1);    // mark 
        return Math.min(mincostclimbing(0, cost), mincostclimbing(1,cost));

    }
    public static int mincostclimbing( int i , int [] cost ){   // i -> 0  n-1 
        if( i>= cost.length) return 0 ;
        if( dp [i] != -1 ) return dp[i];
        return dp[i] = cost[i] + Math.min(mincostclimbing(i+1 , cost ) , mincostclimbing(i+2 , cost));
        
    }
    
}
