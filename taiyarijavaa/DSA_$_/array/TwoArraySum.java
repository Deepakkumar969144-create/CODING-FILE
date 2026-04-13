
import java.util.Scanner;

public class TwoArraySum {
    public static void main(String[] args) {

        int[] arr = {12, 34, 56, 67, 78};
        int[] arr1 = {10, 20, 30, 40, 50};
        int target = 90;        // "Kya array me aise 2 numbers hain jinka sum = 90 ho?"
                          // Target wo number hota hai jise tum banana chahte ho (sum ke through)`
         System.out.println("first array");

for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("second array");
        for(int ele : arr1){
            System.out.print(ele + " ");
        }
        System.out.println();

         System.out.println(" target : " + target);
        // System.out.println();

        boolean result = twoSum(arr, arr1, target);  // function call kiya hai main function se 
                                                        //aur uska result ek boolean variable me store kar diya hai
        
        System.out.println("Result: " + result);
       

    }

    public static boolean twoSum(int[] arr, int[] arr1, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                if (arr[i] + arr1[j] == target) {   // main two sum array ka main code
                    return true;
                }
            }
        }

        return false;
    }
}

        