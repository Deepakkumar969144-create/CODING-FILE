package DP;
import java.util.Scanner;
import java.util.*;

public class sticklethiefspaceoptimisedtabulations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr = { 6,10,1,2,15 };
        System.out.println("stickle thief aaray element : ");
        for( int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.println();
        System.out.println("stickle thief: ");
        System.out.println(findmaxsum(arr));

    }
    public static int findmaxsum( int arr[] ){
        int n = arr.length;
        int [] dp = new int[3];
        dp[0] = arr[0];
        if(n==1 ) return arr[0] ; 
        if(n>1  ) dp[1] = Math.max(arr[0] , arr[1] );
        if(n==2 ) return dp[1] ; 
        for( int i = 2 ; i<n; i++ ){
            dp[2 ]= Math.max(arr[i] + dp[0] , dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];

        }
        return dp[2];
        
    }

    
}
