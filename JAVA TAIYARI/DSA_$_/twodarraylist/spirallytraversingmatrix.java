package twodarraylist;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;

public class spirallytraversingmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = { { 1, 2, 3, 4, }, { 5, 6, 7, 8 }, { 9, 10, 11, 12, }, { 13, 14, 15, 16 } };
        System.out.println(" original array :");
        for (int[] list : mat) {
            for (int ele : list) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> result = spirallytraverse(mat);
        System.out.println(" output - spirally traversing matrix :" + result);

    }

    public static ArrayList<Integer> spirallytraverse(int[][] mat) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;
        int firstrow = 0;
        int lastrow = m - 1;
        int firstcol = 0;
        int lastcol = n - 1;
        int tne = m * n; // tne = total number element
        while (ans.size() < tne) {
            // right jao
            for (int j = firstcol; j <= lastcol; j++) {
                ans.add(mat[firstrow][j]);
            }
            firstrow++;
            if (ans.size() == tne)
                break;

            // down jao
            for (int i = firstrow; i <= lastrow; i++) {
                ans.add(mat[i][lastcol]);
            }
            lastcol--;
            if (ans.size() == tne)
                break;

            // left jap
            if (firstrow <= lastrow) {
                for (int j = lastcol; j >= firstcol; j--) {
                    ans.add(mat[lastrow][j]);
                }
            }
                lastrow--;
            if (ans.size() == tne)
                break;

            // up jao
            if (firstcol <= lastcol) {
                for (int i = lastrow; i >= firstrow; i--) {
                    ans.add(mat[i][firstcol]);
                }
            }
                firstcol++;
             }
             return ans;
      }
}
