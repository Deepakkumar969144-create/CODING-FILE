package binarysearch;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class binarysearchh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr= { -1, 0, 3, 5, 9, 12};
        System.out.println(" original array element : ");
        for( int ele : arr){
            System.out.print( ele + " ");

        }
        System.out.println();
        System.out.print(" enter array element  search : ");
        int target = sc.nextInt();
        System.out.println(" search in array element " +target );
          int result = search(arr,target);
          System.out.println(" binary search in array : " + result);
        
        }

    public static int search( int [] arr ,int target ){
        int n= arr.length;
        int low = 0 , high = n-1;
        while ( low <= high ){
            int mid = ( low + high )/2;
            if( arr[mid ] == target){
                return mid;}
            else if ( arr[mid ] < target){
                low = mid +1;

            }
            else high = mid -1; 
        }
        return 0; 
    }
}
// Binary Search ek searching technique hai jo sorted array me use hoti hai

// 👉 Matlab: array sorted hona chahiye (ascending ya descending)
// Har step me:
// ➡️ Array ko 2 parts me divide karte hain
// ➡️ Beech wala element (mid) check karte hain
// Condition	Action
// arr[mid] == target	mil gaya 🎯
// arr[mid] < target	right side jao 👉
// arr[mid] > target	left side jao 👈