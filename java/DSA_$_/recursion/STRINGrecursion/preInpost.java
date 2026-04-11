package recursion.STRINGrecursion;
import java.util.Scanner;
import java.util.*;

public class preInpost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number ( pre in post ) : ");
        int n = sc.nextInt();
        System.out.println("pre in post ( output) : ");
        pip(n);     // call 

    }
    // public static void pip ( int n ){
    //     if( n== 0) return;
    //     System.out.print(n+ " "); // pre
    //     pip(n-1);
    //     System.out.print( n+ " "); // in 
    //     pip(n-1);
    //     System.out.print( n+ " "); // post 
    // }

            // similar code but thoda diffient
    public static void pip ( int n ){
        if( n == 0 ) return;
        System.out.print( "pre" +n+ " ");
        pip(n-1);
        System.out.print( "in" +n+ " ");
        pip(n-1);
        System.out.print( " " +n+ " ");
        }
}
