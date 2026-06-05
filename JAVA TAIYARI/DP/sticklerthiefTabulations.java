package DP;
import java.util.Scanner;
import java.util.*;

public class sticklerthiefTabulations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] money = { 6, 10 , 1, 2 , 15 };
        System.out.print("stickler thief arrays element : ");
        for( int ele : money){
            System.out.print( ele + " ");

        }
        System.out.println();
        System.out.print("stickler thief : ");
        System.out.println(findmaxsum(money));

    }
    public static int findmaxsum(int arr[] ){
        int n = arr.length;
        int [] dp = new int[n];
        dp[0] = arr[0];
        if( n > 1 ) dp[1 ] = Math.max(arr[0 ], arr[1]);
        for(int i = 2 ; i<n; i++ ) {
            dp [i] = Math.max(arr[i] + dp[i-2 ] , dp[i - 1 ]);

        }
        return dp[n-1 ];

    }
    
}
