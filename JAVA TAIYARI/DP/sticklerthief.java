package DP;
import java.util.*;

public class sticklerthief { // house robber 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 6,10,1,2,15};
        System.out.print("array element cost number : ");
        for( int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.print("stick thief cost number : ");
        System.out.println(findmaxsum(arr));

    }
    static int [] dp ;
    public static int findmaxsum( int arr[] ){
        int n = arr.length;
        dp = new int[n];    // 0 to n 
        Arrays.fill(dp, -1);    // mark 
        return loot( 0 , arr );

    }
    public static int loot ( int  i , int [] arr ){ // i -> 0 to n-1 
        if( i >= arr.length) return 0 ;
        if( dp[i ] != -1 ) return dp[i] ;
        int pick = arr[i] + loot(i + 2 , arr);
        int skip = loot(i+1 , arr);
        return dp[i] = Math.max(pick, skip);

    }
    
}
