package recursion;
import java.util.Scanner;
import java.util.*;

public class waystoreachnthstair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter the number : ");
        int n = sc.nextInt();
        int result = countways(n);
        System.out.println(" ways to reach the stair : " + result);
        int resultt = countway(n);
        System.out.println(" ways to reach the nth stair : " + resultt);

    }
    public static int countways( int n){
        if( n ==1 ) return 1;
        if( n ==2 ) return 2;
        return countways( n -1 ) + countways(n -2);

    }
    // but chhota code - 
    public static int countway( int n ){
        if( n <= 2 ) return n;
        return countway(n -1 ) + countway( n -2);

    }
}
