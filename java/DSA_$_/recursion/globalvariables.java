package recursion;
import java.util.Scanner;
import java.util.*;

public class globalvariables {
    static int x = 10; // global variable 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        x = 9;      // CHANGE KIYA HAI NA KI NAYA INTEGER DIYA 
        System.out.println(x);
        int x = 4;  // local variable dec. and inisi.( more reference )
        System.out.println(x);
        x= 7; 
        fun(); 
    // jab koi variable nahi goga to global variable lega but local variable ki jada value hogi 
    // matlab local variable > global variable  
    }
    public static void fun( ){
        x = 20 ;
    }
 
}


