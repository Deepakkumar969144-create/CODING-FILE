package recursion;
import java.util.Scanner;
import java.util.*;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter number : ");
        int n = sc.nextInt();
        int result = nthfibonacci(n);
        System.out.println(" Nth Fibonaccci number : " + result);

    }
    public static int nthfibonacci( int n ){
        if( n <= 1) return 1;
        int a = nthfibonacci(n -1 );
        int b = nthfibonacci(n - 2 );
        return a+b;

    }
}
// fibonacci(0) = 0 and f(1) = 1 and f(n) = f( n-1 ) + f( n-2 ) for n>1 
// fibo number = 0 1 2 3 5 8 13 21 34 55 ........
// Index       = 1 2 3 4 5 6 7  8   9 10 .......
// fibonacci tree se solve hota hai jisme lest call and right call hoti hai jise DFS CONCEPT  kahte hai 
// first call left call lagti hai 
