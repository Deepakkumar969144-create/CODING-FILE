import java.util.Scanner;
import java.util.*;

public class LIStwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter arrays size  : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("array element : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("longest increasing subsequence : ");
        System.out.println(lis(arr));

    }
    public static int lis(int arr[]) {
        int n = arr.length;
        if (n == 0)
            return 0;

        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxlen = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    max = Math.max(max, dp[j]);

                }
            }
            dp[i] += max;
            maxlen = Math.max(maxlen, dp[i]);

        }
        return maxlen;

    }
    
}