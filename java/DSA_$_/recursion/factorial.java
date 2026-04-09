package recursion;
import java.util.Scanner;
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("output factorial : " + result);
    }
    public static int factorial( int n){
        if( n == 0 || n == 1)  return 1 ;
        int ans = n * factorial ( n - 1 );
        return ans;
    }
}
// time complexity = max no. of calls in call stack 
// space complexity = no . of calls 
