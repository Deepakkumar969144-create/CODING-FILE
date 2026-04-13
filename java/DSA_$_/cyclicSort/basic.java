package cyclicSort;

import java.util.Scanner;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = { 5, 1, 2, 3 , 4, 6, 7, 0};
        // Is array me values 0 to n-1 (0–7) hain
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i) {
                i++;
            } else {
                int idx = arr[i];
                swap(arr, i, idx);
            }
        }
        for( int ele : arr){
            System.out.print( ele + " ");
        }
    }

    public static void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;

    }

}
    // cyclidc sort - Har element ko uske correct index pe bhejna
            //   Jab tak sahi jagah na ho → swap