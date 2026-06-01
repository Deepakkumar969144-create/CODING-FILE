package selectionsort;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class kthsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 7, 10, 4, 3, 20, 15, };
        System.out.println(" original array element : ");
        for (int ele : arr) {
            System.out.print(ele + " ");

        }
        System.out.println();

        System.out.print("enter k th term : ");
        int k = sc.nextInt();

        System.out.println(" K th smallest array : ");
          for( int ele: arr){
        System.out.print(ele + " ");

      }
      System.out.println();

          int result = kthsmallest(arr, k);
           // aagar return se ans aa raha hai to
      // funtion call se phle yek int ans = funtion call karo fir foreach loop se print .

        System.out.println("Kth smallest element: " + result);

    }

public static int kthsmallest ( int [] arr, int k){
    int n= arr.length;
     // TC = O(n*k)
    for( int i=0; i<k; i++ ){    // n-1 passes 
        int min = Integer.MAX_VALUE;
        int mindx = -1; 
        for( int j=i; j<n; j++){
            if(arr[j] < min) {
                min = arr[j];
                mindx = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[mindx];
        arr[mindx] = temp;
    }
    return arr[k-1];
      // aagar return se ans aa raha hai to
      // funtion call se phle yek int ans = funtion call karo fir foreach loop se print .
}
}