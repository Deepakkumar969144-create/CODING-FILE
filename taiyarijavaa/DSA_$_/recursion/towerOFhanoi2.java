package recursion;
import java.util.Scanner;
import java.util.*;

public class towerOFhanoi2 {
    static int count;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter disk quenty : ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("output : ");
        System.out.println("total number of case(step) : " +towerofhanoi(n, n, n, n));

    }
   public static int towerofhanoi( int n , int from , int to , int aux) {
            //   a - from , c - aux , b - to
    count =0;
    hanoi ( n, 'A' , 'B' , 'C' );
    return count ;

   }
   public static void hanoi( int n , char a , char b , char c ){
    if( n == 0 ) return;
    hanoi(n-1 , a, c, b);   // a - from , c - aux , b - to
    System.out.println("move disk "+n+ " from "+ a+ " to "+b );
    count ++ ;
    hanoi(n-1, b, a, c);    // 
    return ;
    
   }
}

