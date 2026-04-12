package recursion.mergesortInversion;

import java.util.Scanner;
import java.util.*;

public class mergesortusingmagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 5, 2, 8, 4, 1, 6, 7, 3, -5 };
        System.out.println("original array : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        mergesort(arr);             // print mergesort function and call 
        System.out.println("sorted array : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

    }

    //  unsorted array ko sorted array me convert karta hai
    //     using merge sort algorithm
    public static void mergesort(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return;
        // 1 length array is pehle se sorted

        // step 1 - create 2 new empty arrays of size n/2 each
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // step 2 - copy paste array into a and b
        int idx = 0;
        // idx travel karega array pe
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];

        // magic
        mergesort(a);
        mergesort(b);

        // step4 - merge 'a' and 'b' int array
        merge(a, b, arr);

    }

    // 2 sorted arrays (a aur b) ko merge karke ek sorted array (arr) banata hai
    public static void merge ( int [] a , int [] b , int[] arr){
        int i=0 , j =0 , k=0;
        while ( i<a.length && j<b.length){ // Jab tak dono arrays me elements hain:
            if( a[i] <= b[j] )
            arr[k++] = a[i++];
            else 
            arr[k++] = b[j++];
        }

        // agar a me elements bache hain → copy kar do
        // agar b me elements bache hain → copy kar do
        while ( i<a.length) 
        arr[k++] = a[ i++];
        while ( j<b.length) 
        arr[ k++] = b[j++];
    }
}
