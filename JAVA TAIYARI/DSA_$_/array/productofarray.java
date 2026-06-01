import java.util.Scanner;
public class productofarray {
    public static void main(String[] args) {
        int [] arr= { 3, 5, 6, 3,4} ;
        int product = 1;
        for ( int i=0; i< arr.length ; i++){
            product *= arr[i]; 
        }
        System.out.println("product of array " + product);

    }
    
}
