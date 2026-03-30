package selectionsort;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class unionoftwosortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 1, 2, 3, 4, 5, };
        int[] b = { 1, 2, 3, 6, 7 };
        System.out.println(" first array: ");
        for (int ele : a) {
            System.out.print(ele + " ");

        }
        System.out.println();
        System.out.println(" secend array: ");
        for (int ele : b) {
            System.out.print(ele + " ");

        }
        System.out.println();
        System.out.println(" uninon of two sorted arrays element : ");
        findeunioIntegers(a, b);
        for (int ele : findeunioIntegers(a, b)) {
            System.out.print(ele + " ");

        }
        System.out.println();

    }

    public static ArrayList<Integer> findeunioIntegers(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);

                }
                i++;

            } else if (ans.size() == 0 || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);

            }
            j++;

        }

        while (i < a.length) {
            if (ans.size() == 0 || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);

            }
            i++;

        }
        return ans;
    }

}

