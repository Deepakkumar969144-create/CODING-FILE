package binarysearch;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class sortedandrotatedarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 0, 3, 5, 9, 12, -1, -2, -3 };
        System.out.println(" original array element : ");
        for( int ele : arr){
            System.out.print( ele + " ");

        }
        System.out.println();
        System.out.print("enter your search in element in sorted array :");
        int target = sc.nextInt();
        int result = search(arr, target);
        System.out.println("search an element in sorted and rotated array index: " + result);
        if( result == -1 ) System.out.println("envailid input");

    }
    public static int search( int []arr ,int target ){
        int low = 0 , high = arr.length-1; 
        while ( low <= high ) {
                int mid = low + ( high - low )/2;
                if( arr[mid] == target ){
                    return mid; 

                }
                else if ( arr[low ] <= arr[ mid]) {
                    if ( arr[ low ] <= target && target < arr[mid] )
                    high = mid -1;

                else low = mid +1;
            }
            else {
                if( arr[mid ] < target && target <= arr[high ] )
                low = mid + 1;
                else high = mid -1;

            }
        }
        return -1;
    }
    }

