package DP;
import java.util.Scanner;
import java.util.Scanner;
import java.util.*;

public class numberofpathsMemoization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter m = ");
        int m = sc.nextInt();
        System.out.print("enter n = ");
        int n = sc.nextInt();

        System.out.print("number of paths : ");
        System.out.println(numberofpaths(m, n));

    }
    public static int numberofpaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        return paths(m, n, dp);

    }
    public static int paths(int m, int n, int[][] dp) {
        if (m == 1 || n == 1)
            return 1;

        if (dp[m][n] != 0)
            return dp[m][n];

        return dp[m][n] = paths(m - 1, n, dp) + paths(m, n - 1, dp);

    }

}