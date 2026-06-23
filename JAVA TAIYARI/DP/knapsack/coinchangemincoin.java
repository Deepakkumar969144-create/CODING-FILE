
import java.util.Scanner;
import java.util.*;
public class coinchangemincoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("coin array element : ");
        int[] arr = {25, 10, 5};
        for (int ele : arr) {
            System.out.print(ele + " ");

        }
        System.out.println();

        int sum = 30;
        System.out.print("coin change ans : ");
        System.out.println(mincoins(arr, sum));

    }
    public static int mincoins(int coin[], int sum) {
        if (sum == 0)
            return 0;
        int[][] dp = new int[coin.length][sum + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);

        }
        int ans = helper(0, sum, coin, dp);
        if (ans == Integer.MAX_VALUE)
            return -1;

        return ans;

    }
    public static int helper(int i, int sum, int[] coin, int[][] dp) {
        if (i == coin.length) {
            if (sum == 0)
                return 0;
            else
                return Integer.MAX_VALUE;

        }
        if (dp[i][sum] != -1)
            return dp[i][sum];

        int skip = helper(i + 1, sum, coin, dp);
        if (sum < coin[i])
            return dp[i][sum] = skip;

        int take = helper(i, sum - coin[i], coin, dp);
        int pick = (take == Integer.MAX_VALUE) ? Integer.MAX_VALUE : take + 1;

        return dp[i][sum] = Math.min(skip, pick);

    }

}