package BIT_Manupulation;
import java.util.Scanner;
import java.util.*;

public class poweroffourandtwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        long n = sc.nextLong();
        System.out.println( n + " is power of 2 : " + ispowerof2(n));
        System.out.println( n + " is perfect square : " + issquare(n));
        System.out.println( n + " is power of 4 : " + ispowerof4(n));

    }
    public static boolean ispowerof2( long n){
        return ( ( n & ( n - 1 )) == 0 );

    }
    public static boolean issquare( long n ){
        long root = ( long ) ( Math.sqrt(n));
        return ( root * root == n );

    }
    public static boolean ispowerof4( long n ){
        return ( ispowerof2(n) && issquare(n)) ? true : false ;

    }

}
