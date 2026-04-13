package recursion;
import java.util.Scanner;
import java.util.*;

public class poweraorb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter base : ");
        int a = sc.nextInt();
        System.out.print("enter exponent : ");
        int b = sc.nextInt();
        int result = power(a, b);
        System.out.println( a+ " raised to the power " +b+ " is " + result);

    }
    public static int power( int a , int b){
        if( b == 0) return 1;
        int call = power( a , b/2);
        if( b%2 == 0 ) return call * call ;
        else {
            return a * call * call ; 
        }
    }
}
