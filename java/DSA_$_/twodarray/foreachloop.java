package twodarray;
import java.util.Scanner;
import java.util.*;

public class foreachloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = {{ 6, 9, 2, 7, 6} , { 1, 3, 7, 2,2} , { 9,9,4,5,2}};
        // print array
        System.out.println("original array is : ");
        for( int i=0; i<arr.length; i++){
            for( int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        // array print method 2 : for each loop

        System.out.println("array print using for each loop is : ");
        for( int [] a : arr){
            for( int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
         // array print for each loop - 

    System.out.println("original array is : ");
        for( int i=0; i<arr.length; i++){
            for( int ele : arr[i]){
                System.out.print( ele + " ");

            }
            System.out.println();
        }
    }
}
