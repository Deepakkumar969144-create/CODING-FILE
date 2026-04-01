package binarysearch;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class squareroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = 4;
       
       
        System.out.println(" output " + squre(n));     //print and call yek sath
       

    }
    public static int squre(int n){
        int low = 0, high = n , idx = 0;
        while ( low <= high){
            int mid = ( low + high) / 2;
            if( mid <= n/mid ){     // mid * mid =n
                idx = mid ;
                low = mid +1;

            }
            else {
                high = mid -1;
            }
        }
        return idx ;

    }
    
}
