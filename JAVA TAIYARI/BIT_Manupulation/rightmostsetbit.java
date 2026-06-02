package BIT_Manupulation;
import java.util.Scanner;
import java.util.*;

public class rightmostsetbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number jese 101100011 : ");
        int n = sc.nextInt();

        System.out.println("rightmost set bit : " + setbit(n));

    }
    public static int setbit ( int n ){
        // return n | ( n + 1 );
        for( int i = 0 ; i< 31 ; i++ ){
            if( ( n >> i ) % 2  == 0 ){
                return n | ( 1 << i ); 

            }
        }
        return 3;

    }
    
}
