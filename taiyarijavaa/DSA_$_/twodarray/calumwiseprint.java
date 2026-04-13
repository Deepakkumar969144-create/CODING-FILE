package twodarray;
import java.util.Scanner;
import java.util.*;

public class calumwiseprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr= {{ 6, 0, 2, 7, 6} , { 1, 3, 7, 2,2} , { 9, 9, 4, 5, 2} };
        // array print karne ke liye loop lagate hai
           System.out.println("original array is : ");
        for( int i=0; i<arr.length; i++){
            for( int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // column wise print karna hai
        System.out.println("column wise print is : ");
        for( int j=0; j<arr[0].length; j++){
            for( int i=0; i< arr.length; i++){
                System.out.print(arr[i][j] + " " );

            }
            System.out.println();
        }
    }
    
}
