package BIT_Manupulation;
import java.util.Scanner;
import java.util.*;
public class numberrofonebits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        System.out.println("number of 1 bits in the given number is : "+setbits(n));
        
    }
    public static int setbits(int n){
        int count = 0 ;
        for( int i =0 ; i< 31; i++ ){
            if( (n >> i ) % 2 != 0 ) count ++ ;
            
        }
        return count ;

    }
}