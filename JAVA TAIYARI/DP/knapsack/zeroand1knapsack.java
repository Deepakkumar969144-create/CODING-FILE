
import java.util.Scanner;
import java.util.*;
public class zeroand1knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] val = {60, 100, 120};
        System.out.print( "value for val : ");
        for(int ele : val ){
            System.out.print( ele + " ");

        }
        System.out.println();
        int[] wt = {10, 20, 30};
        System.out.print("value for wt : ");
        for( int ele : wt ){
            System.out.print( ele + " ");

        }
        System.out.println();

        int capacity = 50;
        System.out.println("capacity : " + capacity);
        System.out.print( "0/1 knapsack : ");
        System.out.println(knapsack(capacity, val, wt));

    }
    public static int knapsack(int capacity, int val[], int wt[]) {
        int n = val.length;
        int[][] dp = new int[n][capacity + 1];

        // dp ko -1 se initialize karo
        for (int[] row : dp) {
            Arrays.fill(row, -1);

        }
        return helper(0, capacity, val, wt, dp);

    }
    public static int helper(int i, int capacity, int[] val, int[] wt, int[][] dp) {
        if (i == val.length)
            return 0;

        if (dp[i][capacity] != -1)
            return dp[i][capacity];

        // Skip current item
        int skip = helper(i + 1, capacity, val, wt, dp);

        // Agar weight zyada hai to pick nahi kar sakte
        if (capacity < wt[i])
            return dp[i][capacity] = skip;

        // Pick current item
        int pick = val[i] + helper(i + 1, capacity - wt[i], val, wt, dp);
        return dp[i][capacity] = Math.max(pick, skip);

    }

}