package recursion;
import java.util.Scanner;
import java.util.*;

public class gcdoftwonum_{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter first number : ");
        int a  = sc.nextInt();
        System.out.print("enter secend number : ");
        int b = sc.nextInt();
        int result = gcd(a, b);
        System.out.println("GCD of two number : " + result);
    }
    public static int gcd( int a , int b ){
        return helper( Math.min(a, b) , Math.max(a, b));

    }
    public static int helper( int a , int b){
        if( a == 0 ) return b;
        return helper( b%a , a) ;

    }
}
