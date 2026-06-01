import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        int[] arr= { -5 , 4, 23, 3, 43, -7, 5, 9};
        int sum=0;
        for( int i=0; i<arr.length; i++){
            sum  += arr[i];

        }
        System.out.println("sum of array " + sum);

    }
    
}
