package recursion;
import java.util.Scanner;
import java.util.*;

public class decreasingincreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter number : ");
        int n = sc.nextInt();
        System.out.println("decresing incresing number :");
        print(n);
    }
    public static void print(int n){
        if( n==0) return ;
        System.out.print(n+ " ");
        print(n-1);
        System.out.print(n+ " ");
    }
}

        // method 2 - 
        
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("enter number: ");
    //     int n = sc.nextInt();
    //     System.out.println("decresing increaing number ");
    //     print(n);
    // }
    // public static void print( int n){
    //     if( n==0) return ; 
    //     System.out.print(n+ " ");
    //     print(n-1);
    //     if( n != 1) System.out.print(n+ " ");
    // }
    // }