package twodarraylist;
import java.util.Scanner;

import binarysearch.sortedandrotatedarray;

import java.util.*;

public class multiplytwodmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat1 = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        int[][] mat2 = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        System.out.println(" original array matrix first : ");
        for (int[] list : mat1) {
            for (int ele : list) {
                System.out.print(ele + " ");

            }
            System.out.println();
        }
        System.out.println(" original array matrix secend : ");
        for (int[] list : mat2) {
            for (int ele : list) {
                System.out.print(ele + " ");

            }
            System.out.println();
        }
        ArrayList<ArrayList<Integer>> result = multiply(mat1, mat2);
        System.out.println(" multiply matrix  :\n" + result);

    }

    public static ArrayList<ArrayList<Integer>> multiply(int[][] a, int[][] b) {
        int n = a.length;
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                ans.get(i).add(c[i][j]);
            }
        }
        return ans;
    }
}