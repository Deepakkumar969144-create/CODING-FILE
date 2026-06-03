package BIT_Manupulation;
import java.util.Scanner;
import java.util.*;

public class minbitflipstoconvertnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start = 10,goal = 7;
        System.out.println("minimum number of bit flips required to convert "+start+" to "+goal+" is : "+minbitflip(start,goal));
        
    }
    public static int minbitflip( int start  , int goal ){
        int xor = start ^ goal;
        int count = 0 ;
        while( xor != 0 ){
            xor = xor & ( xor - 1 );
            count ++;

        }
        return count ;

    }    
}
