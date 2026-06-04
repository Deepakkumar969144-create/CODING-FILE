package BIT_Manupulation;
import java.util.Scanner;
import java.util.*;

public class xorofnuminagivenrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("entet input L : ");
        int a = sc.nextInt();
        System.out.print("enterr input R : ");
        int b = sc.nextInt();
        System.out.print("xor of number in a given range : ");
        System.out.println(findxor(a, b));

    }
    public static int xor( int n){
        if(n % 4 == 1 ) return 1 ;
        else if( n % 4 == 2 ) return n + 1; 
        else if( n % 4 == 3 ) return 0 ;
        else return n;

    }
    public static int findxor( int l , int r ){
        return xor(l-1 ) ^ xor(r);

    }
    
}
