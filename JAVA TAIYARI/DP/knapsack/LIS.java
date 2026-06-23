import java.util.Scanner;
import java.util.*;

public class LIS {// LIS - 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter arrays size  : ");
        int  n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array element : ");
        for(int i = 0 ; i<n; i++ ){
            arr[i] = sc.nextInt();

        }
        System.out.println("array element : ");
        for( int i = 0 ; i<n; i++ ){
            System.out.print( arr[i] + " ");

        
        }
        System.out.print( "longest increasing subsequence : ");
        System.out.println(lis(arr) );
        
    }
    public static int lis( int arr[] ){
        int n = arr.length;
        int[][] dp= new int[n ][n+1 ];
        for( int i= 0 ; i<n; i++ ){
            for( int j=0 ; j< n; j++ ){
                dp[i][j] = -1 ;

            }
        }
        return helper( 0 , -1 , arr, dp );
    }
    public static int helper( int idx , int prev , int[] arr , int [][] dp ){
        if(idx == arr.length) return 0;
        if(dp[idx ] [prev + 1 ] != -1 ){
            return dp[idx ][prev + 1 ];

        }
        int skip = helper(idx + 1 , prev, arr, dp);
        if(prev != -1 && arr[idx] <= arr[prev] ){
            return dp [idx ][ prev + 1 ] = skip;

        }
        int pick = 1 + helper(idx + 1 , idx , arr, dp);
        return dp[idx ][prev] = Math.max(pick , skip );

    }
    
}