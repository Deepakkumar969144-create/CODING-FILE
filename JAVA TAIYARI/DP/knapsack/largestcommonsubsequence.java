
import java.util.Scanner;
import java.util.*;

public class largestcommonsubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string s1 : ");
        String a = sc.nextLine();
        System.out.print("enter string s2 : ");
        String b  = sc.next();
        System.out.print( " largest common subsequence : ");
        System.out.println(lcs(a, b));

    }
    public static int lcs (String a , String b ){
    int m = a.length();
    int n = b.length();
    int [][] dp = new int[m][n];
    for( int i = 0 ; i < m ; i++ ){
        for( int j = 0 ; j < n ; j++ ){
            dp[i][j] = -1;

        }
    }
    return Lcs(m-1 , n-1 , new StringBuilder(a) , new StringBuilder(b) , dp );

    }
    public static int Lcs( int i , int j , StringBuilder a , StringBuilder b , int [][] dp ){
    if( i < 0 || j < 0 ) return 0;
    if( dp[i][j] != -1 )
        return dp[i][j];

    if( a.charAt(i) == b.charAt(j) )
        return dp[i][j] = 1 + Lcs(i-1 , j-1 , a , b , dp);

    else
        return dp[i][j] = Math.max( Lcs(i-1 , j , a , b , dp), Lcs(i , j-1 , a , b , dp));

    }

}