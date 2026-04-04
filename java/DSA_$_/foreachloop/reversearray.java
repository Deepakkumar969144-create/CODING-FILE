package foreachloop;
import java.util.Scanner;

public class reversearray {

    public static void main(String[] args) {
        System.out.println("array element " );

        int [] arr= { 3, 5, 6, 2, 8, 9 };
        for( int ele: arr){
            System.out.print(ele + " ");
           
        }
        int n = arr.length ;
        int i=0 , j= n-1; 

        while ( i< j){
            int temp = arr[i];
            arr[i] = arr[ j] ;
            arr[j] = temp;
            i++;
            j--;

        }
         System.out.println();
         System.out.println(" reverse array element : ");
         
        for( int ele: arr){
            System.out.print(ele+ " ");

        }

    }
}