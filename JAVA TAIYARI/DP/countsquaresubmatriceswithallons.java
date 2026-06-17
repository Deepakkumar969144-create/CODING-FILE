package DP;
import java.util.Scanner;
import java.util.*;
public class countsquaresubmatriceswithallons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter m = ");
        int m = sc.nextInt();
        System.out.print("enter n = ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        System.out.println("Enter matrix elements (0 or 1)(i,j space de ke likhna ) :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.print("count square submatrices with all ones : ");
        System.out.println(countsquare(m, n, arr));
    
    }
    public static int countsquare(int m, int n, int arr[][]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i != 0 && j != 0) {
                    if (arr[i][j] == 1) {
                        arr[i][j] += Math.min( arr[i - 1][j], Math.min(arr[i - 1][j - 1], arr[i][j - 1]) );

                    }
                }
                count += arr[i][j];

            }
        }
        return count;

    }

}