package twodarray;
import java.util.Scanner;
import java.util.*;

public class basiic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr = new int [3][4];
        // 2d array banane ka tarika 
        int [][] arrr = { { 6,0,2,7,6} , { 1,3,7,2,2} , { 9,9,4,5,2}};
        // 2d array banane ka tarika 
        System.out.println("oringinal array is : ");
        for ( int i=0; i< arrr.length; i++){            // printint help loop 
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arrr[i][j] + " ");

            }
            System.out.println();
        }
        // inpput lena 
          // 🔥 UNIVERSAL INPUT LOOP
          
          System.out.println("enter the elements of array (rows by columns[3*4]) : ");
        for (int i = 0; i < arr.length; i++) {  // rows
            for (int j = 0; j < arr[i].length; j++) {   // columns
                arr[i][j] = sc.nextInt();
                // input ke liye arr[i][j] = sc.nextInt(); use karte hai but 2d array me loop ke sath lagate hai 

            }
        }
        // array print karne ke liye for each loop lagate hai
                // 2d array print ke liye best method - 
                
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