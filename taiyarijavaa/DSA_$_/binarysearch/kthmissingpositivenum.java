package binarysearch;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class kthmissingpositivenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr= { 2, 3, 4, 7, 11};
        System.out.println("original array element : ");
        for( int ele : arr){
            System.out.print( ele + " ");

        }
        System.out.println();
        System.out.print("enter search num: ");
        int k = sc.nextInt();
        int result = kthmissing(arr, k);
        System.out.print( "output " + result);
    }
    public static int kthmissing( int [] arr, int k){
        int low = 0 , high = arr.length-1;
        while ( low <= high ){
            int mid = low + (high - low) / 2;
            int correctnumber =mid+1;
            int missing = arr[mid] - correctnumber;

            if( missing >= k) high = mid -1;
            else low = mid +1;
        }
        return high + 1 + k;
    }
    
}
