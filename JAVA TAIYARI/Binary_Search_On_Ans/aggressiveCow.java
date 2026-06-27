package Binary_Search_On_Ans;
import java.util.Scanner;
import java.util.*;

public class aggressiveCow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("value of array ele ment  : ");
        int arr[] = { 1, 2, 5, 7, 10 };
        for( int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.println();
        int cows = 3;
        System.out.println("valur of k ya cows : "+ cows);
        System.out.print("aggessive cows : ");
        System.out.println(aggresiveC(arr, cows) );

    }
    public static int aggresiveC( int arr [] , int cow ){
        Arrays.sort(arr);
        int low = 1;
        int high= arr[arr.length -1 ] - arr[0];
        int ans = 0 ;
        while (low <= high ) {
            int mid = low + ( high - low )/ 2 ;
            if( canplace( arr, cow , mid )){
                ans = mid ;
                low = mid + 1 ;

            }
            else {
                high = mid -1 ;

            }
        }
        return ans;

    }
    public static boolean canplace ( int arr[] , int cow , int dist ){
        int countcow = 1;
        int last = arr [0] ;
        for(int i = 1; i<arr.length ; i++ ){
            if( arr[i] - last >= dist ){
                countcow++ ;
                last = arr[i] ;

            }
            if( countcow >= cow ){
                return true;

            }
        }
        return false ;

    }
    
}
