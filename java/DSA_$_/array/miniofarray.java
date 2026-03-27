import java.util.Scanner;
public class miniofarray {
    public static void main(String[] args) {
        int[] arr= { 4, -6, 3, 8, -5};
        int min= Integer.MAX_VALUE; 
        for( int i=0; i< arr.length; i++){
            if( arr[i]< min){
                min= arr[i];

            }

        }
        System.out.println("min array " + min);
        
    }
    
}
