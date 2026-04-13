package binarysearch;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class descendingsortedarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 100, 87, 76, 66, 52, 43, 35, 25, 9} ;
        System.out.println(" original array element : ");
        for( int ele : arr){
            System.out.print( ele + " ");

        }
        System.out.println();
        System.out.print(" enter search element : ");
        int x = sc.nextInt();
        int result = floorsearch(arr, x);
        System.out.println("search index : " + result + " search element " + x);

    }
    public static int floorsearch( int [ ] arr , int x){
        int low = 0, high = arr.length -1 ;
        int ans = -1;
        while ( low <= high ){
            int mid = (low + high )/2;

            if( arr[mid] == x){
                return mid ;
            }
            if( arr[mid ] > x){
                low = mid + 1; ;// right jao small vlaues 
            }
            else{
                ans = mid ;   // posssible ans 
                high = mid -1; // left for better element 
            }

        }
        return ans ;

    }
    
}
