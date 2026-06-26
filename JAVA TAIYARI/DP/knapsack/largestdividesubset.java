import java.util.Scanner;
import java.util.*;

public class largestdividesubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        ArrayList<Integer> ans = lis(arr);
        System.out.println("Largest Divisible Subset : " + ans);

    }
    public static ArrayList<Integer> lis(int arr[]){
        int n = arr.length;

        int dp[] = new int[n];
        int hash[] = new int[n];

        Arrays.fill(dp,1);
        
        int maxi = 1;
        int lastindex = 0;
        for(int i=0;i<n;i++){
            hash[i]=i;
            for(int prev=0;prev<i;prev++){
                if(arr[i]%arr[prev]==0 && dp[prev]+1>dp[i]){
                    dp[i]=dp[prev]+1;
                    hash[i]=prev;

                }
            }
            if(dp[i]>maxi){
                maxi=dp[i];
                lastindex=i;

            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[lastindex]);
        while(hash[lastindex]!=lastindex){
            lastindex=hash[lastindex];
            ans.add(arr[lastindex]);

        }
        Collections.reverse(ans);
        return ans;

    }

}