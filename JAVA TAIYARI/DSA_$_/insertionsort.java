import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr= { 4, 1, 17, 31, 9, 2, 0, 8, 6, };
        // Arrays.sort(arr);        // shortcut array sort
        System.out.println("original arrays element : ");
        for(int ele: arr){
            System.out.print( ele+ " ");

        }
        System.out.println();
                //  Insertion sort algorithm 

        for(int i=1; i<arr.length; i++){
            int j=i;
            while( j<0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;

            }
        }
        System.out.println(" insertion sort array : ");
        for ( int ele : arr){
            System.out.print( ele + " ");

        }
        System.out.println();
    }
}
 