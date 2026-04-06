package twodarray;
import java.util.Scanner;
import java.util.*;

public class rotatearrayimage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr ={{ 2,8,3,4},{ 7,2,1,6},{ 5,5,4,1},{ 3,1,8,2}};
        System.out.println("original array : ");
        for( int [] a : arr){
            for( int ele : a){
                System.out.print( ele + " " );
            }
            System.out.println();
        }
            // transpose the array
        int n = arr.length;
        for( int i=0; i<n; i++){
            for( int j=i; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        // revese each row 
        for( int i=0; i<n; i++){
            int start =0; 
            int end = n-1;
            while ( start < end ){
                int temp = arr[i] [start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start ++;
                end --;

            }
        }
            // print rotaote array image
        System.out.println("rotate array image is : ");
        for( int [] a: arr){
            for( int ele : a){
                System.out.print( ele + " " );

            }
            System.out.println();
        }
    } 
}
