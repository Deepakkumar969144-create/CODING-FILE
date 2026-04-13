package recursion;
import java.util.Scanner;
import java.util.*;

public class basicc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.print(" enter the number : ");
       int n = sc.nextInt();
       print(n);

    }

     // function calling it self - 
     public static void print ( int n){
        if( n==0) return ;
        System.out.print(n + " ");
        print ( n-1);   // print 4 ye print 4 fir se print function ko call lagayega 5 bar 
// recursion - function khud ko bar bar call karega yahi recursion hai jese esme print bar bar call lagaye ga khud ko hi 

     }
    
}
