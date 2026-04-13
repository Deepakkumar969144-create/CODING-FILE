package cyclicSort;
import java.util.Scanner;
import java.util.*;

public class deuplicatenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 1, 3, 4, 2, 2 };
        System.out.println("original array element : ");
        for( int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.println();
        int result = deuplicatenum(arr);
        System.out.println("the duplicaate number : " + result);

    }
    public static int deuplicatenum( int[] arr){
        int i =0 ;
        while ( i < arr.length){
            int correctidx = arr[i] -1;
            if(arr[i] != arr[correctidx]){
                swap( arr , i , correctidx);

            }
            else{
                if(i != correctidx){
                return arr[i] ; // duplicate mil gaya 
            }
            i++ ;

            }
        }
        return -1;
    }

public static void swap( int [] arr , int i, int j){
    int temp = arr[i];
    arr[i] = arr [j];
    arr[j] = temp ; 

}
}
