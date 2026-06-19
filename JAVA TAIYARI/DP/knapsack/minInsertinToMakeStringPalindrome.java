package DP.knapsack;
import java.util.Scanner;
import java.util.*;

public class minInsertinToMakeStringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string s1  : ");
        String a  = sc.next();
        System.out.print("min Insertion to make string palindrom : ");
        System.out.print( findmininsertion(a));

    }
    public static int findmininsertion( String s ){
        return s.length() - lps(s);

    }
    public static int lps( String s ){
        StringBuilder a = new StringBuilder(s );
        StringBuilder b = new StringBuilder(s );
        b.reverse();
        return lcs(a , b );

    }
    public static int lcs(StringBuilder a , StringBuilder b ){
        int m = a.length(); 
        int n = b.length();
        int[][] dp = new int[m ][n ];
        for( int i =0 ; i<m ; i++ )
        for(int j =0 ; j<n ; j++ )
        dp[i][j] = -1 ;
        return LCS(m-1 , n-1 , a, b , dp );

    }
    public static  int LCS(int i , int j , StringBuilder a , StringBuilder b  , int [][] dp ){
        if(i < 0 || j< 0 ) return 0;
        if( dp [i][j] != -1 ) return dp[i][j] ;
        if( a.charAt(i) == b.charAt(j) )
        return dp[i][j] = 1 + LCS(i-1 , j-1 , a, b, dp);
        else
        return dp[i][j] = Math.max(LCS(i-1 ,  j , a, b, dp), LCS(i, j-1 , a, b, dp));

    }

}
