package DP;
import java.util.Scanner;
import java.util.*;
public class uniquepaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        System.out.println("unique paths element array : ");
        for (int[] ele : arr) {
            for (int value : ele) {
                System.out.print(value + " ");

            }
            System.out.println();

        }
        System.out.println("unique paths : ");
        System.out.println(uniquePathh(arr));

    }
    public static int uniquePathh(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        // Agar starting cell obstacle hai
        if (grid[0][0] == 1) {
            return 0;

        }
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;

                }
                if (i == 0 && j == 0) {
                    continue;

                }
                int up = 0;
                int left = 0;
                if (i > 0) {
                    up = dp[i - 1][j];

                }
                if (j > 0) {
                    left = dp[i][j - 1];

                }
                dp[i][j] = up + left;

            }
        }
        return dp[m - 1][n - 1];

    }
    
}