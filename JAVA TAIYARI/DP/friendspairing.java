package DP;
import java.util.Scanner;
import java.util.*;

public class friendspairing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n = ");
        int n = sc.nextInt();
        System.out.print("friend pairing : ");
        System.out.println(countfriendpair(n));

    }
    public static long countfriendpair( int n ){
        long []dp = new long[n+1 ];
        return friend(n, dp);

    }
    public static long friend( int n , long [] dp ){
        if( n<= 2 ) return n ;
        if( dp [n] != 0 ) return n;
        return dp[n] = friend(n-1 , dp) + (n-1 )*friend(n-2 , dp);

    }
    
}
