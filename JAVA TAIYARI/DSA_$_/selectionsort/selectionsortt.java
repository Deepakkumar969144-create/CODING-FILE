package selectionsort;
import java.util.Scanner;
public class selectionsortt {
    public static void main(String[] args) {
        int [] arr = { 5, -2, 6, 7, 2, 0, 7, 2};
        System.out.println(" original array: ");
        for( int ele : arr){
            System.out.print( ele+ " ");

        }
        System.out.println();

        int n= arr.length;
        print(arr);
       
        }
         public static void print( int [] arr ){
            int n = arr.length;

        for ( int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j=i; j<n ; j++){
                if( arr[j] < min){
                    min = arr[j];
                    mindex = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[ mindex ];
            arr[mindex ] = temp;
        }
        System.out.println(" selection sort array : ");
        for( int ele: arr){
            System.out.print(ele + " ");

        }
        System.out.println();


    }
}
    

