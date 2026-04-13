package cyclicSort;
import java.util.Scanner;
import java.util.*;

public class setmismatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 1,2, 2, 4};
        System.out.println("original array: ");
        for( int ele : arr)
        System.out.print( ele + " ");
        System.out.println();
        setmismatch(arr);

    }

    public static void setmismatch ( int [] arr){
        int n = arr.length;
        int i =0;
        while(i<n){  // cyclic sort 
            int rightidx = arr[i] - 1;
            if( arr[i] != arr[rightidx]){
                swap(arr, i , rightidx);

            }
            else {
                i++;
            } 
        }
        for( i =0 ; i<n ; i++ ){  // final duplicate & missing 
            if( arr[i] != i+1){
                System.out.println("duplicate : " + arr[i]);
                System.out.println("missing : " + ( i + 1 ));
                return ; 
                
            }
        }
    }
    
  public static void swap( int[] arr , int i , int j){
    int temp = arr[i];
    arr[i] = arr[j] ;
    arr[j] = temp;

  }  
}
