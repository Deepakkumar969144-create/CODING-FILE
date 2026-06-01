package twodarray;
import java.util.Scanner;
import java.util.*;

public class maxeleofeachrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int[][] arr = {
            {2, 8, 3, 4, 7},
            {7, 2, 1, 6, 3},
            {5, 5, 4, 1, 4},
            {3, 1, 8, 2, 6}
        };
        for( int i=0; i<arr.length ; i++){
            for( int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }
        int minofmax = Integer.MAX_VALUE;
        for( int i=0; i<arr.length; i++){
            int rowmax = Integer.MIN_VALUE;

        // FIND MAX OF EACH ROW 
        for( int j=0; j<arr[i].length; j++){
            if( arr[i] [j] > rowmax){
                rowmax = arr[i][j];
            }
            }
            // FIND MIN AMONG ALL ROW MAX 
            if(rowmax < minofmax){
                minofmax = rowmax;

            }
        }
        System.out.println("the min of max of each row is : " + minofmax);

    }
    
}
