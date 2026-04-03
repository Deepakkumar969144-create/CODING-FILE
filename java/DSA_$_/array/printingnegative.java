

import java.util.Scanner;

public class printingnegative {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length:");
        int n = sc.nextInt();

        int[] arr = new int[n];      //"n size ka ek dabba bana diya jisme sirf integers store honge"

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Negative numbers are:");  // negative number in array 
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}           //  array of size n is created and user is asked to input the elements of the array. 
            // Then, a loop is used to check each element of the array, and if an element is negative (less than 0), 
            // it is printed to the console.