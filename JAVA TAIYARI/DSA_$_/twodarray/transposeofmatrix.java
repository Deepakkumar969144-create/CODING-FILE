package twodarray;
import java.util.Scanner;
import foreachloop.foreachloopp;
import java.util.*;

public class transposeofmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr= {{ 1,2,3,},{4,5,6},{ 7,8,9}};
        System.out.println("original array : ");
        for(int i=0; i<arr.length; i++){
            for( int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        int [][] a = transpose(arr);        // transpose function call karte hai
        System.out.println("transpose of matrix is : ");
        for( int [] ar: a){
            for( int ele : ar){
                System.out.print( ele + " " );
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int [][] arr){
        int row = arr.length, colum = arr[0].length;
        int [][] a = new int [colum] [row];
        for ( int i=0; i<a.length; i++){
            for ( int j=0; j<a[0].length; j++){
                a[i][j] = arr[j][i]; 
            }
        }
        return a;
    }
}
