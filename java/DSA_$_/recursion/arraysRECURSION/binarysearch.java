package recursion.arraysRECURSION;

import java.util.Scanner;
import java.util.*;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = { -1, 0, 3, 5, 9, 12 };
        System.out.println(" original array : ");
        for (int ele : num) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.print("search array element : ");
        int target = sc.nextInt();
        int result = search(num, target);
        System.out.println(" binary search (index) : " + result);
        if (result == -1) {
            System.out.print("element not find ( invailid )");
        }
    }

    public static int helper(int[] num, int target, int low, int high) {
        if (low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (num[mid] == target)
            return mid;
        else if (num[mid] > target)
            return helper(num, target, low, high - 1);
        else
            return helper(num, target, mid + 1, high);

    }

    public static int search(int[] num, int target) {
        int n = num.length;
        return helper(num, target, 0, n - 1);

    }
}
