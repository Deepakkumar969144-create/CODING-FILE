package Binary_Search_On_Ans;
import java.util.Scanner;
import java.util.*;

public class smallestdivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {1,2,5,9};
        System.out.print("valur of array element : ");
        for(int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.println();
        int k = 6;
        System.out.println("value of k : "+ k );
        System.out.print("smallest divisor : ");
        System.out.println( smallestdivi(arr, k));

    }
    public static int smallestdivi(int []arr , int k ){
        int low = 1;
        int high = maxele(arr);
        while (low <= high ) {
            int mid = low + (high - low )/2 ;
            int sum = 0 ;
            for(int i = 0 ;i<arr.length; i++ ){
                sum += ( arr[i] + mid -1 )/ mid ;

            }
            if( sum <= k ){
                high = mid -1;

            }
            else {
                low = mid + 1;

            }
        }
        return low ;

    }
    public static int maxele( int arr[] ){
        int max = arr[0] ;
        for( int i = 1 ; i< arr.length ; i++ ){
            if(arr[i] > max ){
                max = arr[i] ;

            }
        }
        return max;

    }

}
