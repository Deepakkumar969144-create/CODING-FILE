package binarysearch;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class firstoccurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr= { 1,2,3,4,5,};
        for(int ele : arr){
            System.out.print(ele + " ");

        }
        System.out.println();
        System.out.print(" search in appears in array element : ");
        int k = sc.nextInt();
        int result = binarysearch(arr, k);
        System.out.println(" outpput : " + result);


    }
            // first occurence 
            
    public static int binarysearch( int [] arr, int k){
        int low = 0, high = arr.length-1;
        int idx = -1;
        while ( low <= high){
            int mid = (low + high) / 2;
            if (arr[mid ] > k)
            high = mid-1;
            else if ( arr[mid ] < k ){
                low = mid +1;

            }
            else {
                idx = mid;
                high = mid -1;

            }
        }
        return idx;

    }
    
}
