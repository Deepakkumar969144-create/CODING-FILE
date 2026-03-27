
package foreachloop;

import java.util.Scanner;

public class rotatearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr = { 3, 2, 5, 6, 4, 7 };
        System.out.println("Original element in Array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
            
        }
        System.out.println();
        System.out.println(" enter rotate by input : ");
        int n = sc.nextInt();

        int d = n;           // rotate by 2

        rotatearray(arr, d);

        System.out.println("\nRotated Array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void rotatearray(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);         // ✅ important
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}