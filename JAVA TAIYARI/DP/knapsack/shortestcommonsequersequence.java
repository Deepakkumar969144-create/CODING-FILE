import java.util.Scanner;
import java.util.*;

public class shortestcommonsequersequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string s1 : ");
        String s1  = sc.nextLine();
        System.out.print("ENTER string s2 : ");
        String s2  = sc.nextLine();
        System.out.print("shortest common seuquence : ");
        int m = s1.length();
        int n= s2.length();
        int [][] dp = new int[m+1 ][ n+1 ];

        // lcs tabulation 
        for(int i = 1 ; i<= m; i++ ){
            for(int j= 1 ; j<= n ; j++ ){
                if(s1.charAt(i-1 ) == s2.charAt(j-1 )){
                    dp[i][j] = 1 + dp[i-1 ][j-1];

                }
                else{
                    dp[i][j] = Math.max(dp[i-1 ][j] , dp[i][j-1 ] );

                }

            }
        }
        StringBuilder ans = new StringBuilder();
        int i = m;
        int j= n;
        while (i > 0 && j > 0 ) {
            if( s1.charAt(i-1 ) == s2.charAt(j-1 ) ){
                ans.append(s1.charAt(i-1 ));
                i--;
                j--;

            }
            else{
                if(dp[i-1][j] > dp[i][j-1 ] ){
                    ans.append(s1.charAt(i-1 ));
                    i--;

                }
                else{
                    ans.append(s2.charAt(j-1 ));
                    j--;

                }

            }
        }
        while (i>0 ) {
            ans.append(s1.charAt(j-1 ));
            i--;
            
        }
        while (j>0 ) {
            ans.append(s2.charAt(j-1 ));
            j--;
            
        }
        ans.reverse();
        System.out.println(ans);

    }
    
}
