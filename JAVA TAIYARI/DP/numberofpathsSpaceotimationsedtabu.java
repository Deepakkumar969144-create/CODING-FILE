package DP;
import java.util.Scanner;
import java.util.*;
public class numberofpathsSpaceotimationsedtabu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter m = ");
        int m = sc.nextInt();
        System.out.print("enter n = ");
        int n = sc.nextInt();
        System.out.print("number of paths : ");
        System.out.println(numberpaths(m, n)    );

    }
    public static int numberpaths(int m, int n) {
        int[][] dp = new int[2][n];
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
            dp[1][0] = 1;
            for (int a = 1; a <= m - 1; a++) {
                if (a % 2 == 1) {
                    // sirf yaha j -> k kiya hai
                    for (int k = 1; k < n; k++) {
                        dp[1][k] = dp[0][k] + dp[1][k - 1];

                    }
                }
                else {
                    // sirf yaha j -> k kiya hai
                    for (int k = 1; k < n; k++) {
                        dp[0][k] = dp[1][k] + dp[0][k - 1];

                    }
                }
            }
            return Math.max(dp[1][n - 1], dp[0][n - 1]);

        }
        // compile error hatane ke liye
        return 0;

    }
}