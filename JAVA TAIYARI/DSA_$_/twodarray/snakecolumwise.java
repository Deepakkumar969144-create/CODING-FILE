package twodarray;
import java.util.*;

public class snakecolumwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr = { {3,5,7,2},{ 1,5,2,8}, { 8,4,1,3}, { 2,1,6,4}};
        System.out.println("original array : ");
        for( int [] a: arr){
            for( int ele : a ){
                System.out.print( ele + " " );

            }
            System.out.println();
        }
        int rows = arr.length;
        int column = arr[0].length;
        System.out.println("snake column wise array : ");
        for( int j=0 ; j<column; j++){
            if( j%2 ==0 ){
                for( int i=0 ; i<rows; i++){
                    System.out.print( arr[i][j] + " " );
                }
            }
            else {
                for ( int i= rows -1; i>= 0; i--){
                    System.out.print( arr[i][j] + " " );
                }
            }
        }
    }
    
}
