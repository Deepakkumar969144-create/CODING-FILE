package recursion;
import java.util.Scanner;
import twodarray.arraysum;
import java.util.*;

public class onetontak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter number : ");
        int n = sc.nextInt();
        print(1, n);

    }

    public static void print(int x, int n) {
        if (x > n) return;
        System.out.print(x + " ");
        print(x + 1, n);

    }
}

        //  1 to n tak method 2 - 

    // public class onetontak {
    // static int n;
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("enter number : ");
    //     n = sc.nextInt();
    //     print(1);

    // }
    // public static void print ( int x){
    //     if( x>n) return ;
    //     System.out.print(x + " ");
    //     print(x+1);

    // } 
    // }
