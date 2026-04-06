package twodarray;
import java.util.Scanner;
import java.util.*;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = { { 6, 0, 2, 7, 6} , { 1, 3, 7, 2,2} , { 9, 9, 4, 5, 2} };
          // 2d array banane ka tarika 
           System.out.println("oringinal array is : ");
        for ( int i=0; i< arr.length; i++){            // printint help loop 
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // sum of 2d array nikalana 
        int sum =0;
        for( int i=0; i<arr.length; i++){
            for( int j=0; j<arr[0].length; j++){
                sum = sum + arr[i][j];
                // sum += arr[i][j]; 
            }
        }
        System.out.println("sum of 2d array is : " +sum);
    }
}
