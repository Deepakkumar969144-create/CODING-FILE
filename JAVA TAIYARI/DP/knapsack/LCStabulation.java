import java.util.*;

public class LCStabulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String s1 : ");
        String s1 = sc.nextLine();
        System.out.print("Enter String s2 : ");
        String s2 = sc.nextLine();
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Tabulation
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

            }
        }

        // LCS Length
        System.out.println("LCS Length : " + dp[m][n]);

        // Backtracking for LCS String
        StringBuilder ans = new StringBuilder();
        int i = m;
        int j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                ans.append(s1.charAt(i - 1));
                i--;
                j--;

            }
            else {
                if (dp[i - 1][j] > dp[i][j - 1])
                    i--;
                else
                    j--;

            }
        }
        ans.reverse();
        System.out.println("LCS String : " + ans);

        // Calling lcs() method
        System.out.println("LCS Length Using Function : " + lcs(s1, s2));
        
    }
    public static int lcs(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

            }
        }
        return dp[m][n];
    }
    
}