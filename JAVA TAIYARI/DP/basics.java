package DP;
import java.util.Scanner;
public class basics {
    // ek hi problem ko bar bar solve karne ki jagah uska answer store karke reuse karna . 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number : ");
        int n = sc.nextInt();
        System.out.println("Nth fibonacci number ; ");
        System.out.println(nthfibonacci(n));
        
    }
    // dp concept - ex . Nth fibonacci number - 
    static int [] dp;
    public static int fibo( int n ){
        if( n<= 1 ) return n;
        if( dp [n] != 0  ) return dp[n];    // extra 
        int ans = fibo(n-1 ) + fibo(n-2 );
        dp[n] = ans;    // extra 
        return ans;

    }
    public static int nthfibonacci(int n ){
        dp = new int[n+1 ] ;    // idx from 0 to n 
        return fibo(n);

    }
    
}
