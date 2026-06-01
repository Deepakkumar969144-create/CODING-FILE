package binarysearch;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class floorinsortedarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr = { 1,2,8,10,10,12,19};
        System.out.println(" original element : ");
        for( int ele: arr){
            System.out.print( ele + " ");

        }
        System.out.println();
        System.out.print(" enter search element : ");
        int x = sc.nextInt();
        int result = findfloor(arr, x);
        System.out.println(" search index : " + result + " in element " + x);

    }
    public static int findfloor( int [] arr, int x){
        int low = 0 , high = arr.length -1, idx = -1;
        while( low <= high ){
            int mid = (low + high )/2;
            if( arr[mid] > x){
                high = mid -1;
            }
                else{
                    idx = mid;
                    low =mid+1;
            }
        }
        return idx ; 
    }
}
