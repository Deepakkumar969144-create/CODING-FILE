package recursion.mergesortInversion;

import java.util.Scanner;
import java.util.*;

public class countinversion {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 4, 1, 3, 5 };
        System.out.println("original array : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("inversion count : " + inversioncount(arr));

    }

    public static int inversioncount(int arr[]) {
        count = 0;
        mergesort(arr);
        return count;
    }

    public static void mergesort(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return;
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < n; i++)
            right[i - mid] = arr[i];
        mergesort(left);
        mergesort(right);
        merge(left, right, arr);

    }

    public static void merge(int[] a, int[] b, int[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k++] = a[i++];

            } else {
                arr[k++] = b[j++];
                count += (a.length - i); // mainn logic

            }
        }
        while (i < a.length)
            arr[k++] = a[i++];
        while (j < b.length)
            arr[k++] = b[j++];

    }
}
