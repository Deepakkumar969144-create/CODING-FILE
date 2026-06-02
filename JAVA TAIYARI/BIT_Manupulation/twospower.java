package BIT_Manupulation;
import java.util.Scanner;
import java.util.*;
public class twospower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("inter number : ");
        int n = sc.nextInt();
        System.out.println("fist approach : " + ispowerof2(n));
        System.out.println("second approach: "+ ispoweroftwo(n));
        System.out.println("third approach : " + ispoweroftwoo(n));
        
    }
    /// apporach - 1 
    public static boolean ispowerof2(int n ){
        if(n== 0 ) return false;
        if(n== 1 ) return true;
        if( n%2 == 1 ) return false;
        return ispowerof2(n/2);

    }
    // apporach - 2 
    public static boolean ispoweroftwo(int n ){
        if(n == 0 ) return false;
        while(n > 1 ) {
            if(n%2 == 1 ) return false;
            n = n/2;

        }
        return true;

    }
    // apporach - 3 
    public static boolean ispoweroftwoo(int n ){
        return ((n & ( n-1)) == 0 );

    }
    
}
