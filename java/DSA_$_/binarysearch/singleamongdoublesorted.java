package binarysearch;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class singleamongdoublesorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65 };
        System.out.println("original array element : ");
        for (int ele : arr) {
            System.out.print(ele + " ");

        }
        System.out.println();
        int result = findonce(arr);
        System.out.println("single among double in a sorted array : " + result);
        // for( int ele : arr){
        // System.out.print( ele + " ");

        // }
        // System.out.println();

    }

    public static int findonce(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return arr[0];
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];

        }
        if (arr[0] != arr[1])
            return arr[0];
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            int first = mid, secend = mid;
            if (arr[mid] == arr[mid]) {
                first = mid - 1;

            } else
                secend = mid + 1;
            int leftcount = first - low;
            int rightcount = high - secend;
            if (leftcount % 2 == 0)
                low = secend + 1;
            else
                high = first - 1;

        }
        return 0;
    }
}
