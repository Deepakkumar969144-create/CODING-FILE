package DP;
import java.util.Scanner;
import java.util.*;

public class countderangementsdisarrangementofball {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n = ");
        int n = sc.nextInt();
        System.out.print( "count deragrements : ");
        System.out.println(countder(n)  );
        
    }
    public static int countder( int n ){
        if( n<= 3 ) return n-1 ;
        return (n-1 ) * (countder(n-1 ) + countder(n-2 ));

    }
    
}
