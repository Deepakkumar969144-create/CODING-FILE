package taiyarijavaa.TAI_OOP.oopps.constructorsoops;
import java.util.Scanner;
import java.util.*;

public class methodoverloading {
    //      Same naam ka method use karke different type ke inputs handle karna
    // Matlab:
    //      ek hi function naam → multiple situations handle kare
    public static class car {
        public static int max ( int a, int b){
            return Math.max(a, b);

        }
        public static int max( int a , int b , int c){
            System.out.println("this input is max input number: ");
            return Math.max(a, Math.max(b, c));
        }
    }
    public static void main(String[] args) {
        System.out.println(car.max(3, 4, 7));
        // jab automatic 2 variavle and 3 variable bala method acces karega 
    }
}
    // * code ka order matter karta hai ( matlab code karne ka order )
