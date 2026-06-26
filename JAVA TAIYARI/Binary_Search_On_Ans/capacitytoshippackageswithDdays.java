package Binary_Search_On_Ans;
import java.util.Scanner;
import java.util.*;

public class capacitytoshippackageswithDdays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = 3;
        int arr[] = { 1, 2, 1 };
        int d = 2;
        System.out.print("capacity to ship packages wihtin D days : ");
        System.out.println(leastweightcap(arr, n, d));

    }
    public static int leastweightcap( int [] arr , int n , int d ){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for( int ele : arr ){
            max = Math.max(max, ele );
            sum += ele;
            
        }
        int lo = max;
        int hi = sum;
        int ans = -1 ;
        while (lo <= hi ) {
            int mid = lo +(hi -lo )/2;
            if(days(mid, arr ) <= d ){
                hi = mid -1 ;
                ans = mid ;

            }
            else{
            lo = mid +1 ;

            }
        }
        return ans;

    }
    public static int days(int capacity , int [] arr ){
        int days =0 ;
        int c = capacity;
        for( int ele : arr ){
            if( c >= ele ) c -= ele ;
            else {
                days ++ ;
                c= capacity - ele ; 

            }
        }
        days++ ;
        return days;

    }
    
}
