package cyclicSort;
import java.util.Scanner;
import java.util.*;

public class missingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 5 };
        System.out.println("original array element : ");
        for( int ele : arr ){
            System.out.print( ele +  " ");
        }
        System.out.println();
        System.out.println("missing number array : " + missingnum(arr));
    }

    public static int missingnum(int arr[]) {
        int n = 1 + arr.length; // 1 to n
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == n || arr[i] == i + 1)
                i++;
            else {
                int idx = arr[i] - 1;
                swap(arr, i, idx);
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1)
                return i+1;
        }
        return n;
    }

    public static void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;

    }
}

//         //  method - 2 ( index out of bound error aa raha hai )
// public static int missingnum( int [] arr ){
//     int n = arr.length;  // 0 to n 
//     int i=0;
//     while ( i< arr.length){
//         if(arr[i] == i || arr[i] == n )  i++; 
//         else{ 
//            int idx = arr [i] ;
//             swap( arr , i, idx );
            
//         }
//         } 
//     for(i =0 ; i<arr.length; i++ ) {
//         if( arr[i] != i )
//         return i; 

//     }
//     return n; 

// }
// public static void swap( int [] arr, int i , int idx ){
//     int temp = arr[i] ;
//     arr[i] = arr [idx ] ;
//     arr[idx ] = temp;

// }
// }
