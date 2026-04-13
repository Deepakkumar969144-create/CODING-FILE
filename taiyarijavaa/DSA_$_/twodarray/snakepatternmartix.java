package twodarray;
import java.util.Scanner;
import java.util.*;

public class snakepatternmartix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr = { { 2, 8, 3,4,7},{ 7,2,1,6,3}, { 5,5,4,1,4,}, { 3,1,8,2,6}};
        System.out.println("original array : ");
        for( int i=0; i<arr.length; i++){
            for( int j=0 ; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        // snake pattern array - 
        System.out.println("snake patter array : ");
        for( int i=0; i<arr.length; i++){
            if( i%2 ==0 ){
                for( int j=0; j<arr[0].length; j++){
                    System.out.print(arr[i][j] + " " );
                }
            }
            else {
                for(int j=arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j] + " " );
                }
            }
            System.out.println();
        }

    }
    
}
