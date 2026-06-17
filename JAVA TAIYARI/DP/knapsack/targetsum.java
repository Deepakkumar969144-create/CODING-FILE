package DP.knapsack;
import java.util.Scanner;
import java.util.*;

public class targetsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print( "enter n : ");
        int n = sc.nextInt();
        int [] arr = { 1,1,1,1,1};
        int target = 3;
        System.out.println( "target number : " + target);
        System.out.print( "target sum : ");
        System.out.println(findtarget(n, arr, target) );

    }
    // mehtod == 1 -
    // public static int findtarget ( int n , int [] arr , int target ){
    //     return helper( 0 , target , arr );

    // }
    // public static int helper( int i , int target , int []arr ){
    //     if( i == arr.length){
    //         if( target == 0 ) return 1 ;
    //         else return 0 ;

    //     }
    //     int add = helper(i+1 , target - arr[i ], arr);
    //     int subtract = helper(i+1 , target +arr[i] , arr);
    //     return add + subtract ; 

    // }
    // method == 2 - 
    static int abssum;
    public static int findtarget(int n , int []arr , int target ){
        abssum = 0;
        for( int ele : arr ) abssum += Math.abs(ele);
        int [][]dp = new int[arr.length][2*abssum +1 ]; 
        return helper(0, 0, target, arr, dp);
    }
    public static int helper( int i ,int sum , int target, int[]arr , int[][] dp ){
        if (i == arr.length) {
        if (sum == target)
            return 1;
        else
            return 0;

        }
        if(dp[i][sum + abssum] != 0 ) return dp[i][sum + abssum ];
        int add = helper(i+1 , sum + arr[i] , target, arr, dp);
        int subtract = helper(i+1 , sum - arr[i] , target, arr, dp);
        return dp[i][sum + abssum ] = add + subtract;

    }
    
    
}
