package cyclicSort;
import java.util.Scanner;
import selectionsort.findlargestfirst;
import java.util.*;

public class firstmissingpositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 3, 4, -1, 1};
        System.out.println("original array ");
        for( int ele : arr)
        System.out.print( ele + " ");
        System.out.println();
        System.out.println("first missing positivr : " + firstmissingpasi(arr));

    }

    public static int firstmissingpasi( int [] arr ){
        int i =0 , n = arr.length ;
        while ( i<n ){
            if( arr[i] <=  0 ) i++;
            else if( arr[i] > n ) i++;
            else if ( arr[i] == i +1) i++ ;
            else if ( arr [i] == arr[ arr[i] -1]) i++;
            else swap( arr, i , arr[i]-1);

        }
        for( i=0;  i<n ; i++ ){
            if( arr[i] != i+1 ) return i+1;
        }
        return n + 1 ;
    }

    public static void swap( int [] arr , int i , int j ) {
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp;
        
    }
}
