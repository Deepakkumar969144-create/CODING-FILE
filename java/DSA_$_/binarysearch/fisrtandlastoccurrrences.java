package binarysearch;
import java.util.Scanner;
import java.util.Scanner;
// import java.pattern_printing.triangle.star;
import java.util.ArrayList;
import java.util.Arrays;

public class fisrtandlastoccurrrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr= { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        System.out.println(" original array element : ");

        for(int ele : arr){
            System.out.print(ele+ " ");

        }
        System.out.println();
        System.out.print(" enter is search in array element : ");
        int target  = sc.nextInt();
        
        int result1 = firstoccurence(arr, target);
        int result2 = lastoccurence(arr, target);
        System.out.println("final occureneced(index number) : ["  +result1+ " , " +result2+ "]");

    }
            //  fisrt occurence 

        public static int firstoccurence( int [] arr, int target){
            int low =0 , high = arr.length;
            int idx = -1;
            while  ( low <= high){
                int mid = low + ( high - low )/2;

            if(arr[mid ]== target ){
                idx = mid ;
                high = mid -1 ;  // left jao 
            }
            else if ( arr[mid ] < target ){
                low = mid + 1; 

            }
            else { 
                high = mid -1 ;

            }
        }
         return idx;      
}
           // last occurence 

         public static int lastoccurence( int [] arr, int target ){
            int low =0, high = arr.length -1;
            int idx = -1;
            while ( low <= high ){
                int mid = low + ( high - low )/2;
                if( arr[mid ] == target ){
                    idx = mid;
                    low = mid +1;       // right jao 

                }
                else if ( arr[mid] < target ){
                    low = mid + 1;

                }
                else { 
                    high = mid -1;

                }
            }
            return idx;

         }
}
